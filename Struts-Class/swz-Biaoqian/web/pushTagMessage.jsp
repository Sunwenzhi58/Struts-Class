<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2023/5/30
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:push value="#session.student">
    FirstName is:<s:property value="firstName"/><br>
    LastName is:<s:property value="lastName"/><br>
</s:push>
