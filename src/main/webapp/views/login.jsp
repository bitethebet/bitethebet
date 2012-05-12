<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tag" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<div class="span6 offset4">
    <div class="hero-unit" style="width: 50%">
        <p>
            <c:if test="${!empty param.login_error}">
            <div class="alert alert-error">
                <button class="close" data-dismiss="alert">×</button>
                <strong>Warning!</strong> <spring:message code="error.login"/>
            </div>
        </c:if>
        <form action="j_spring_security_check" method="POST">
            <div>
                <label for="login"></label>
                <input id="login" name="j_username" class="input-xlarge" placeholder="<spring:message code="auth.login"/>"/>
            </div>
            <div>
                <label for="password"></label>
                <input id="password" name="j_password" type="password" class="input-xlarge" placeholder="<spring:message code="auth.password"/>"/>
            </div>
            <div>
                <input class="btn btn-success" type="submit" value="<spring:message code="button.login"/>"/> 
            <a href="/register.html" ><spring:message code="auth.doNotHaveAccount"/> </a>
            </div>
        </form>
    </div>
</div>