<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<div class="hero-unit">
    <h1>Welcome <sec:authentication property="principal.username" /></h1>
</div>