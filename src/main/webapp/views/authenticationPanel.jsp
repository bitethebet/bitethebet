<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tag" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="row-fluid">
    <div class="span12">
        <div class="hero-unit" style="padding: 10px; width:80%;">
            <form:form action="j_spring_security_check" method="POST" style="margin: 0" commandName="user">
                <div>
                    <input id="login" name="j_username"  placeholder="<spring:message code="auth.login"/>"/>
                </div>
                <div>
                    <table>
                        <tr><td>
                                <input id="password" name="j_password" type="password" placeholder="<spring:message code="auth.password"/>" class="input-medium"/></td><td>
                            <input class="btn btn-success" type="submit" value="<spring:message code="button.login"/>"/><td>
                        </tr>
                    </table>
                </div>
            </form:form>
        </div>
    </div>
</div>
<div class="row-fluid">
    <div class="span12">
        <div class="hero-unit" style="padding: 10px; width:80%;">
            <form:form method="post" class="form-horizontal" action="register.html" commandName="userToRegister">
                <label><strong><spring:message code="auth.doNotHaveAccount"/></strong></label>
                <form:input path="username" type="text" placeholder="Login" style="margin-bottom:10px"/>
                <div>
                    <table>
                        <tr><td>
                                <form:input path="password" type="password" placeholder="Password" class="input-medium"/></td><td>
                                <button class="btn btn-primary" type="submit" >
                                    <spring:message code="auth.register"/>
                                </button>  
                            </td></tr>
                    </table>
                </div>
            </form:form>
        </div> 
    </div>
</div>