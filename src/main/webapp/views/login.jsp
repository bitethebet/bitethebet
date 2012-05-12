<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tag" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<div class="span6 offset4">
    <div class="hero-unit" style="width: 50%">
        <c:if test="${!empty param.login_error}">
        <div class="alert alert-error">
            <button class="close" data-dismiss="alert">×</button>
            <strong>Warning!</strong> Error
        </div>
    </c:if>
    <form action="j_spring_security_check" method="POST">
        <div>
            <input id="login" name="j_username" placeholder="<spring:message code="auth.login"/>"/>
        </div>
        <div>
            <input id="password" name="j_password" type="password" placeholder="<spring:message code="auth.password"/>"/>
        </div>
        <div>
            <input type="submit" value="Login" />
        </div>
    </form>
    </div>
</div>