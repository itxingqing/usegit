package com.xq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @ClassName LoginController
 * @Description 登录控制器
 * @Author 邢庆
 * @Date 2019/11/23 17:08
 * @Version 1.0
 **/
@Controller
public class LoginController {

    @RequestMapping("login")
    public String login() {
        return "login";
    }

    /**
     * 通过在参数中获得作用域的对象
     * @param request
     * @param session
     * @return
     */
    @RequestMapping("login2")
    public String login(HttpServletRequest request, HttpSession session) {

        request.setAttribute("reqname", "request");
        session.setAttribute("sessionname", "session");
        request.getSession().setAttribute("sessionname2", "session2");
        request.getServletContext().setAttribute("contextname", "context");

        return "login";
    }

    /**
     * 使用Map对象作为参数向页面传值
     * @param map
     * @return
     */
    @RequestMapping("login3")
    public String login(Map<String ,String> map) {
        map.put("keyname", "keyvalue");
        return "login";
    }

    /**
     * 使用spring的模型来传递信息
     * @param model
     * @return
     */
    @RequestMapping("login4")
    public String login(Model model) {
        model.addAttribute("key", "value");
        return "login";
    }

    /**
     * 使用spring的视图模型来处理前后端数据的传递
     * @return
     */
    @RequestMapping("login5")
    public ModelAndView loginByAndView() {
        ModelAndView modelAndView = new ModelAndView("login");
        modelAndView.addObject("hsing", "ching");
        return modelAndView;
    }

}
