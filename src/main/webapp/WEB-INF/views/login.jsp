<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp"%>

메세지: ${msg}
<form name="loginForm" action="login">
    <table>
        <tr>
            <td>아이디</td>
            <td><input type="text" name="id" value="${id}" /></td>
        </tr>
        <tr>
            <td>패스워드</td>
            <td><input type="password" name="pwd" value="${pwd}" /></td>
        </tr>
    </table>
    <input type="submit" value="로그인" />
</form>

<%@include file="include/footer.jsp"%>