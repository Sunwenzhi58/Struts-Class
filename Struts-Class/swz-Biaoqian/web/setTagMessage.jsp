<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2023/5/30
  Time: 22:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:set name="firstName" value="student.firstName"/>
First Name is:<s:property value="#firstName"/><br>
<s:set name="lastName" value="student.lastName" scope="session"/>
Last Name is:<s:property value="#session.lastName"/><br>