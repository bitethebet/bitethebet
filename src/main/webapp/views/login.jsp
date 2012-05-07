<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tag" uri="http://www.springframework.org/tags" %>
<div class="hero-unit">
    <p>
        <c:if test="${!empty param.login_error}">
        <div class="alert alert-error">
            <button class="close" data-dismiss="alert">×</button>
            <strong>Warning!</strong> Error
        </div>
    </c:if>
    <form action="j_spring_security_check" method="POST">
        <div>
            <label for="login"></label>
            <input id="login" name="j_username" />
        </div>
        <div>
            <label for="password"></label>
            <input id="password" name="j_password" type="password" />
        </div>
        <div>
            <input type="submit" value="Login" />
        </div>
    </form>
</div>