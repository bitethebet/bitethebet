<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tag" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<style type="text/css">
    body {
        padding-top: 150px;
    }


    .show-grid  {
        background-color: #eee;
        text-align: center;
        -webkit-border-radius: 3px;
        -moz-border-radius: 3px;
        border-radius: 3px;
        min-height: 30px;
        line-height: 30px;
        margin-top: 10px;
    }
    
        .hidden-grid  {
        background-color: white;
        text-align: center;
        -webkit-border-radius: 3px;
        -moz-border-radius: 3px;
        border-radius: 3px;
        min-height: 30px;
        line-height: 30px;
        margin-top: 10px;
    }



</style>




<div class="span2 hidden-grid"> </div>
<div class="span5 show-grid" style="margin-right: 5px;">
    a tutaj bety
    
</div>
<div>
    <div class="span3 " style="margin-left: 5px">
    <div class="row-fluid show-grid">
        <form:form  action="j_spring_security_check" method="POST"  commandName="user" style="margin: 15px">
            <table > 
                <tr>
                    <td colspan="2">
                        <input style="width: 100%"   placeholder="<spring:message code="auth.login"/>" id="login" name="j_username"/>

                    </td>
                </tr>
                <tr>
                    <td style="width: 70%">
                        <input  id="password" name="j_password" type="password" placeholder="<spring:message code="auth.password"/>" class="input-medium"/>
                    </td>
                    <td >
                        <input style="width: 100%" class="btn btn-success" type="submit" value="<spring:message code="button.login"/>"/>
                    </td>
                </tr>

            </table>
        </form:form>
    </div>
    
        <div class="row-fluid show-grid">
        <form:form method="post"  action="register.html" commandName="userToRegister" style="margin: 15px">
            <label><strong><spring:message code="auth.doNotHaveAccount"/></strong></label>
            <table > 
                <tr>
                    <td colspan="2">
                       <form:input style="width: 100%" path="username" type="text" placeholder="Login" /> 

                    </td>
                </tr>
                <tr>
                    <td style="width: 70%">
                       <form:input  path="password" type="password" placeholder="Password" class="input-medium"/>
                    </td>
                    <td >
                         <input style="width: 100%" class="btn btn-primary" value="<spring:message code="auth.register"/>" type="submit" />
                        
                    </td>
                </tr>

            </table>
        </form:form>
    </div>


</div>
    </div>
<div class="span2 hidden-grid"></div>








