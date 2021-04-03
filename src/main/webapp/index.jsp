<%--
  Created by IntelliJ IDEA.
  User: itxin
  Date: 2019/11/24
  Time: 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="download?fileName=梦幻频道0218.apk">下载</a>
    上传
    <form action="upload" method="post" enctype="multipart/form-data">
        文件名：<input type="file" name="file"/><br/>
        描述：<input type="text" name="description"/><br/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
