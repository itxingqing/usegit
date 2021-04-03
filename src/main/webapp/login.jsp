<%--
  Created by IntelliJ IDEA.
  User: itxin
  Date: 2019/11/23
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
登录
${requestScope.reqname}
d${sessionScope.sessionname}
${sessionScope.sessionname2}
${applicationScope.contextname}
<!--注意此时使用map的key来获取值-->
${requestScope.keyname}
<!--从spring的Model模型中获取-->
<br/>
${key}
<br/>
${hsing}
</body>
</html>
