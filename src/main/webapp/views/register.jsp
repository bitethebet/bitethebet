<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<div class="span6 offset3">
    <div class="hero-unit">
        <form:form method="post" action="registerUser.html" class="form-horizontal" commandName="userToRegister">
            <label><strong><spring:message code="auth.doNotHaveAccount"/></strong></label>
            <table>
                <tr>
                    <td>
                        <spring:message code="auth.login" var="login"/> 
                        <form:input path="username" type="text" placeholder="${login}" style="margin-bottom:10px" value="${user.username}"/>
                    </td>
                    <td style ="padding-left: 10px;">
                        <c:set var="usernameErrors"><form:errors path="username"/></c:set>
                        <c:if test="${not empty usernameErrors}">
                            <div class="alert alert-error"> 
                                <form:errors path="username" cssClass="error"/>
                            </div>
                        </c:if>
                    </td>
                </tr><tr>
                    <td>
                        <spring:message code="auth.password" var="password"/> 
                        <form:input path="password" type="password" placeholder="${password}" style="margin-bottom:10px"/>
                    </td>
                    <td style ="padding-left: 10px;">
                        <c:set var="passwordErrors"><form:errors path="password"/></c:set>
                        <c:if test="${not empty passwordErrors}">
                            <div class="alert alert-error">
                                <form:errors path="password" cssClass="error"/>
                            </div>
                        </c:if>
                    </td>
                </tr>
                <tr>
                    <td>
                       <spring:message code="auth.confirmPassword" var="confirmPassword"/>  
                        <form:input path="confirmPassword" type="password" placeholder="${confirmPassword}" style="margin-bottom:10px" />
                    </td>
                    <td style ="padding-left: 10px;">
                        <c:set var="confirmPasswordErrors"><form:errors path="confirmPassword"/></c:set>
                        <c:if test="${not empty confirmPasswordErrors}">
                            <div class="alert alert-error"> 
                                <form:errors path="confirmPassword" cssClass="error"/>
                            </div></c:if>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <button class="btn btn-primary" type="submit">
                                <spring:message code="button.createAccount"/>
                            </button>
                        </td>
                        <td>
                        </td>
                    </tr>
                </table>
        </form:form>
    </div>
</div>