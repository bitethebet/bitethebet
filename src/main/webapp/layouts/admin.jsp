<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title><tiles:insertAttribute name="title" /></title>
<link href="/bootstrap/css/bootstrap.css" rel="stylesheet"></link>
<link href="/bootstrap/css/bootstrap-responsive.css" rel="stylesheet"></link>
<style type="text/css">
body {
	padding-top: 60px;
	padding-bottom: 40px;
}
</style>


</head>
<body>
 <tiles:insertAttribute name="header" />

<div class="container-fluid">
    <div class="row-fluid">
        <div class="span3">
            <div class="well sidebar-nav">
                <ul class="nav nav-list">
                    <li class="nav-header">Menu</li>
                    <li class="<tiles:insertAttribute name="countries" />"><a href="/secure/admin/console.html">Countries</a></li>
                    <li class="<tiles:insertAttribute name="users" />"><a href="/secure/admin/users.html">Users</a></li>
                    <li class="<tiles:insertAttribute name="bets" />"><a href="#">Bets</a></li>
                </ul>
            </div><!--/.well -->
        </div><!--/span-->
<tiles:insertAttribute name="body" />
    </div><!--/span-->
</div><!--/row-->
</div>
</body>
