<%@ page language="java" import="java.util.*" isELIgnored="false" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>员工列表展示</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
</head>

<body>
    <div align="center" style="width: 80%" >
        <s:a href="emp_viewAdd">添加员工</s:a>
    </div>
    <table border="1" align="center" width="80%" cellpadding="5" cellspacing="0">
        <tr>
            <th>序号</th>
            <th>员工编号</th>
            <th>员工姓名</th>
            <th>员工薪水</th>
            <th>操作</th>
        </tr>
        <s:if test="#request.listEmp != null">
            <s:iterator var="emp" value="#request.listEmp" status="st">
                <tr>
                    <td><s:property value="#st.count"/></td>
                    <td><s:property value="#emp.id"/></td>
                    <td><s:property value="#emp.empName"/></td>
                    <td><s:property value="#emp.salary"/> </td>
                    <td>
                       <s:a href="emp_viewUpdate?id=%{#emp.id}">修改</s:a>
                        <s:a href="emp_delete?id=%{#emp.id}">删除</s:a>
                    </td>
                </tr>
            </s:iterator>
        </s:if>
    </table>
</body>
</html>

