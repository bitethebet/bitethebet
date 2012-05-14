<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tag" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<style type="text/css">
    body {
        padding-top: 150px;
    }
</style>
<div class="row-fluid">
<div class="span2 hidden-grid"> </div>
<div class="span5 show-grid" style="margin-right: 5px;">
    a tutaj bety
    
</div>
<div>
    <div class="span3 " style="margin-left: 5px">
    <div class="row-fluid show-grid">
        <form:form  action="j_spring_security_check" method="POST"  commandName="user" >
            <table style=" margin: 15px; text-align: left"> 
                <tr>
                    <td colspan="2" style="width: 100%">
                        <div>
                        <input style="width: 96%"   placeholder="<spring:message code="auth.login"/>" id="login" name="j_username"/>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td style="width: 70%;">
                        <input style="width: 94%" id="password" name="j_password" type="password" placeholder="<spring:message code="auth.password"/>" />
                        
                    </td>
                    <td style="width: 30%">
                        <input style="width: 100%" class="btn btn-success" type="submit" value="<spring:message code="button.login"/>"/>
                        
                    </td>
                </tr>

            </table>
        </form:form>
    </div>
    
        <div class="row-fluid show-grid">
        <form:form method="post"  action="register.html" commandName="userToRegister" >
            <label><strong><spring:message code="auth.doNotHaveAccount"/></strong></label>
            <table style=" margin: 15px; text-align: left"> 
                <tr>
                    <td colspan="2" style="width: 100%">
                       <form:input style="width: 96%" path="username" type="text" placeholder="Login" /> 

                    </td>
                </tr>
                <tr>
                    <td style="width: 70%">
                       <form:input style="width: 94%" path="password" type="password" placeholder="Password"/>
                    </td>
                    <td style="width: 30%">
                         <input style="width: 100%" class="btn btn-primary" value="<spring:message code="auth.register"/>" type="submit" />
                        
                    </td>
                </tr>

            </table>
        </form:form>
    </div>


</div>
    </div>
<div class="span2 hidden-grid"></div>

</div>






