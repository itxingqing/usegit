package com.xq.controller;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

/**
 * @ClassName FileController
 * @Description 文件上传下载控制器
 * @Author 邢庆
 * @Date 2019/11/24 18:26
 * @Version 1.0
 **/
@Controller
public class FileController {
    /**
     * 下载文件
     * @param fileName
     * @param request
     * @param response
     */
    @RequestMapping("download")
    public void downloadFile(String fileName, HttpServletRequest request, HttpServletResponse response) {
        // 参数的中文乱码
        try {
            fileName = new String(fileName.getBytes("ISO-8859-1"), "utf-8");
            // 此处如果下载文件是中文时，则要转换编码为iso-8859-1
            response.setHeader("Content-Disposition", "attachment;filename=" +
                    new String(fileName.getBytes("utf-8"), "ISO-8859-1"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        // java下载时候，需要全路径才能够下载，找到项目的files文件夹
        String absolutePath = request.getServletContext().getRealPath("files");
        // 设置下载时候，不进行inline在线打开，直接下载，默认是在线打开
        ServletOutputStream outputStream = null;
        try {
            outputStream = response.getOutputStream();
            File file = new File(absolutePath, fileName);
            // 使用Apache的文件处理工具类
            byte[] bytes = FileUtils.readFileToByteArray(file);
            outputStream.write(bytes);
            outputStream.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /**
     * 文件上传，注意MultipartFile参数的名称必须与jsp中的file文本框的name一致，否则参数为null
     * @param file
     * @param description
     * @return
     */
    @RequestMapping("upload")
    public String uploadFile(MultipartFile file, String description) {

        String filename = file.getOriginalFilename();
        String fileSuffix = filename.substring(filename.indexOf("."));
        // 定义成随机的文件名
        String saveFileName = UUID.randomUUID().toString() + fileSuffix;

        try {
            FileUtils.copyInputStreamToFile(file.getInputStream(), new File("d:/" + saveFileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "index";
    }
}
