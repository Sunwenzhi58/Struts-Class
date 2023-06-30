<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2023/5/30
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:bean name="example.struts2.SortComparator" var="myComparator"/>
<s:generator separator="," val="%{'struts2,framework,tag,programming,example'}">
    <s:sort comparator="#myComparator">
        <s:iterator status="iteratorStatus">
            <s:property/><s:if test="!#iteratorStatus.last">、</s:if>
        </s:iterator>
    </s:sort>
</s:generator>