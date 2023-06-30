<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2023/5/23
  Time: 9:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <h2>
       <s:debug/>
       1.访问action中的基本属性和方法（action中定义的属性默认存在值栈中）
       用户年龄：<s:property value="user.age"/><br>
       猫的朋友：<s:property value="cat.friend"/><br>
       猫的朋友的名字：<s:property value="cat.friend.name"/><br>
       <hr color="red">

   </h2>
</body>
</html>
