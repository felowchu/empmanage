<%@ page language="java" import="java.util.*" isELIgnored="false" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>修改员工</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
</head>

<body>
    <s:form action="/emp_update.action" method="post"  theme="simple">
        <s:hidden name="id" id="id" value="%{id}"></s:hidden>
        <table border="1" align="center" width="80%" cellpadding="5" cellspacing="0">
            <tr>
                <td>员工姓名</td>
                <td>
                    <s:textfield name="empName" id="empName"></s:textfield>
                </td>
            </tr>
            <tr>
                <td>员工薪水</td>
                <td>
                    <s:textfield name="salary" id="salary"></s:textfield>
                </td>
            </tr>
            <tr>
                <td>选择部门</td>
                <td>
                    <s:select
                        name="deptId"
                        headerKey="-1"
                        headerValue="请选择"
                        list="#request.listDept"
                        listKey="id"
                        listValue="name"
                        value="dept.id"
                    ></s:select>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <s:submit value="修改员工"></s:submit>
                </td>
            </tr>
        </table>
    </s:form>
</body>
</html>

