<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<div class="span6 offset3">
    <div class="hero-unit">
        <form:form method="post" action="/secure/user/bitethebet.html" commandName="bet">
            <table>
                <tr>
                    <td>
                        <form:input path="definition.players[0].name" type="text" style="margin-bottom:10px" value="${bet.definition.players[0].name}" class="uneditable-input"/>
                    </td>
                    <td>
                    </td>
                    <td>
                        <form:input path="definition.players[1].name" type="text" style="margin-bottom:10px" value="${bet.definition.players[1].name}" class="uneditable-input"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:input path="definition.players[0].score" type="text" style="margin-bottom:10px" value="${bet.definition.players[0].score}"/>
                    </td>
                    <td>
                    </td>
                    <td>
                        <form:input path="definition.players[1].score" type="text" style="margin-bottom:10px" value="${bet.definition.players[1].score}"/>
                    </td>
                </tr>
            </table>
            <button style="width: 100%;" type="submit" class="btn btn-primary">Save</button>
        </form:form>
    </div>
</div>