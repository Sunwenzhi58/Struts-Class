<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2023/5/30
  Time: 23:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:bean name="example.struts2.Person" var="person">
    <s:param name="firstName" value="'Jiangguo'"/>
    <s:param name="lastName" value="'Wang'"/>
    Access JavaBean inside tag body:<br>
    FirstName is:<s:property value="firstName"/><br>
    LastName is:<s:property value="lastName"/><br>
</s:bean>
Access JavaBean outside tag body,var attribute must be set:<br>
FirstName is:<s:property value="#person.firstName"/><br>
LastName is:<s:property value="#person.lastName"/><br>