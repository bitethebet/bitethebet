<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<table class="table table-condensed">
    <thead>
        <tr>
            <th>Name</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="country" items="${countries}">
            <tr>
                <td><c:out value="${country.name}"/></td>
                <td>
                </td>
            </tr>
        </c:forEach>
        <form:form method="post" action="/secure/admin/addCountry.html">
            <tr>
                <td width="80%"><form:input style="width: 98%" path="name" class="input-xlarge"/></td>
                <td><button style="width: 100%" type="submit" class="btn btn-primary">Save</button>


                </td>

            </tr>
        </form:form>
    </tbody>
</table>





