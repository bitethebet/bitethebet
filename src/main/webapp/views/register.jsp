<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<div class="span6 offset4">
    <div class="hero-unit" style="width: 50%">
        <form:form method="post" action="registerUser.html" class="form-horizontal" commandName="userToRegister">
        <label><strong><spring:message code="auth.doNotHaveAccount"/></strong></label>
                <form:input path="username" type="text" placeholder="Login" style="margin-bottom:10px" value="${user.username}"/>
                <form:input path="password" type="password" placeholder="Password" style="margin-bottom:10px"/>
                <form:input path="confirmPassword" type="password" placeholder="Confirm password" />
            <button class="btn btn-primary" type="submit">
                Create account
            </button>
        </form:form>
    </div>
</div>