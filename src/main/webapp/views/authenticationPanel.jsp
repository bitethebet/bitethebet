<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tag" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<div class="row-fluid hero-unit" style="padding: 10px; margin-bottom: 5px; width: 80%; margin-left: -20px">
    <div class="span3">
        <form action="j_spring_security_check" method="POST" >
            <div>
                <label for="login"></label>
                <input id="login" name="j_username"  placeholder="Login"/>
            </div>
            <div>
                <table>
                    <tr><td>
                            <label for="password"></label>
                            <input id="password" name="j_password" type="password" placeholder="Password" class="input-medium"/></td><td>
                            <input class="btn btn-success" type="submit" value="<spring:message code="button.login"/>"/> </td>
                    </tr>
                </table>
            </div>
        </form>
    </div>
</div>
<div class="row-fluid hero-unit"  style="width: 80%; padding: 10px; margin-left: -20px">
    <div class="span3">Level 2</div>
</div>
