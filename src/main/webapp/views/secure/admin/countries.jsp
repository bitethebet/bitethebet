<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="span9">
            <div class="hero-unit">
                HEJ 

                <ul>
                    <c:forEach var="country" items="${countries}">
                        <li>
                            <div><c:out value="${country.name}"/></div>
                        </li>
                    </c:forEach>
                </ul>
                <form:form method="post" action="/secure/admin/addCountry.html">
                <table>
                    <tr>
                        <td><form:label path="name">Name</form:label></td>
                        <td><form:input path="name" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit" value="Add"/>
                        </td>
                    </tr>
                </table>
                </form:form>


            </div>

        </div><!--/row-->
