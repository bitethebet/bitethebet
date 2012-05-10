<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table class="table table-condensed">
    <thead>
        <tr>
            <th>Player</th>
            <th>Player</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="definition" items="${betDefinitions}">
            <tr>
                <td><c:out value="${definitions.players[0].name}"/></td>
                <td><c:out value="${definitions.players[1].name}"/></td>
            </tr>
        </c:forEach>
        <form:form method="post" action="/secure/admin/addBetDefinition.html">
            <tr>
                <td width="40%">
                    <form:select path="players[0].name">
                        <form:option value="" label="-- Choose one--" />
                        <form:options items="${players}" itemValue="name" itemLabel="name" />
                    </form:select>
                </td>
                <td width="40%">
                    <form:select path="players[1].name">
                        <form:option value="" label="-- Choose one--" />
                        <form:options items="${players}" itemValue="name" itemLabel="name" />
                    </form:select> 
                </td>
                <td><button style="width: 40%" type="submit" class="btn btn-primary">Save</button></td>

            </tr>
        </form:form>
    </tbody>
</table>
