<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2023/5/30
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table border="1" width="100">
    <s:iterator value="{1,2,3,4,5}" begin="2" end="4" status="iteratorStatus">
        <s:if test="!#iteratorStatus.odd">
            <tr bgcolor="gray">
                <td><s:property/></td>
            </tr>
        </s:if>
        <s:elseif test="!#iteratorStatus.even">
            <tr bgcolor="white">
                <td><s:property/></td>
            </tr>
        </s:elseif>
    </s:iterator>
</table>