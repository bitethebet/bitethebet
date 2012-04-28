<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div class="container-fluid">
    <div class="row-fluid">
        <div class="span3">
            <div class="well sidebar-nav">
                <ul class="nav nav-list">
                    <li class="nav-header">Menu</li>
                    <li class="active"><a href="#">Users</a></li>
                    <li><a href="#">Countries</a></li>
                    <li><a href="#">Bets</a></li>
                    <li><a href="#">Link</a></li>
                    <li class="nav-header">Sidebar</li>
                    <li><a href="#">Link</a></li>
                    <li><a href="#">Link</a></li>
                    <li><a href="#">Link</a></li>
                    <li><a href="#">Link</a></li>
                    <li><a href="#">Link</a></li>
                    <li><a href="#">Link</a></li>
                    <li class="nav-header">Sidebar</li>
                    <li><a href="#">Link</a></li>
                    <li><a href="#">Link</a></li>
                    <li><a href="#">Link</a></li>
                </ul>
            </div><!--/.well -->
        </div><!--/span-->
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
    </div><!--/span-->
</div><!--/row-->
</div>

