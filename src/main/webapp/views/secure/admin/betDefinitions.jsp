<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<table class="table table-condensed">
    <thead>
        <tr>
            <th>Player</th>
            <th>Player</th>
            <th>Group</th>
            <th>Date</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="definition" items="${betDefinitions}">
            <tr>
                <td ><c:out value="${definition.players[0].name}"/></td>
                <td ><c:out value="${definition.players[1].name}"/></td>
                <td ><c:out value="${definition.betCategory}"/></td>
                <td colspan="2"><c:out value="${definition.date}"/></td>
            </tr>
        </c:forEach>
        <form:form method="post" action="/secure/admin/addBetDefinition.html">
            <tr>
                <td style="width: 20">
                    <form:select path="players[0].name" style="width: 100%">
                        <form:option value="" label="-- Choose one--" />
                        <form:options items="${players}" itemValue="name" itemLabel="name" />
                    </form:select>
                </td>
                <td style="width: 20%">
                    <form:select path="players[1].name" style="width: 100%">
                        <form:option value="" label="-- Choose one--" />
                        <form:options items="${players}" itemValue="name" itemLabel="name" />
                    </form:select> 
                </td>
                <td style="width: 20%">
                    <form:select path="betCategory" style="width: 100%">
                        <form:option value="" label="-- Choose one--" />
                        <c:forEach items="${categories}" var="category">
                            <form:option value="${category}" >
                                <spring:message code="${category.name}"/>
                            </form:option>
                        </c:forEach>
                    </form:select> 
                </td>
                <td style="width: 20%">
                    <form:input  path="date" style="width: 50%"></form:input>
                </td >
                <td style="width: 20%"><button style="width: 94%; float: right"  type="submit" class="btn btn-primary">Save</button></td>
            </tr>
        </form:form>
    </tbody>
</table>
