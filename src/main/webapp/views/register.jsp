<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div class="hero-unit">
    <form:form method="post" action="registerUser.html" class="form-horizontal">
        <fieldset>
            <legend>Create your free account</legend>
            <div class="control-group">
                <form:label path="username" class="control-label">Login</form:label>
                <div class="controls">
                    <form:input path="username" type="text" class="input-xlarge"/>
                </div>
                <form:label path="password" class="control-label">Password</form:label>
                <div class="controls">
                    <form:input path="password" type="password" class="input-xlarge" />
            </div>
        </div>
    </fieldset>
    <button class="btn" type="submit">
        Create account
    </button>
    </form:form>
</div>