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
       名称：<s:property value="name"/>
       密码：<s:property value="password"/>
       <s:property value="method1()" />
       <hr color="red">
       2.访问action中的静态属性和方法<br>
       <s:property value="@java.lang.Math@PI"/><br>
       <s:property value="@@random()"/><br>
       <s:property value="@cn.ognl.StaticClass@STR"/><br>
       <s:property value="@cn.ognl.StaticClass@staticMethod()"/><br>
   </h2>
</body>
</html>
