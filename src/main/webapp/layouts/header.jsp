<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container-fluid">
            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>
            <a class="brand" href="/index.html">Bite the bet</a>
            <div class="nav-collapse">
                <ul class="nav">
                    <li class="active"><a href="/secure/admin/console.html">Admin</a></li>
                    <li><a href="#about">About</a></li>
                    <li><a href="#contact">Contact</a></li>
                </ul>

                <sec:authorize access="isAuthenticated()">
                    <p class="navbar-text pull-right"><a class="btn" href="j_spring_security_logout" style="margin-left: 30px;"> Logout</a></p>
                    <p class="navbar-text pull-right">Logged in as <a href="#"><sec:authentication property="principal.username" /></a></p>
                </sec:authorize>
                <sec:authorize access="isAnonymous()">
                    <p class="navbar-text pull-right"><a class="btn btn-success" href="/login.html" style="margin-left: 30px;">Login </a></p>
                    <p class="navbar-text pull-right"><a class="btn" href="/register.html">Sign Up</a></p>
                </sec:authorize>
            </div><!--/.nav-collapse -->
        </div>
    </div>
</div>