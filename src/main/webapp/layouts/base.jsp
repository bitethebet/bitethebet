<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title><tiles:insertAttribute name="title" /></title>
<link href="/bootstrap/css/bootstrap.css" rel="stylesheet"></link>
<link href="/bootstrap/css/bootstrap-responsive.css" rel="stylesheet"></link>
<link href="/css/bootstrap_extention.css" rel="stylesheet"></link>
<link href="/css/roundabout_extension.css" rel="stylesheet"></link>
<link href="/css/bx_styles.css" rel="stylesheet"></link>


<style type="text/css">
body {
	padding-top: 60px;
	padding-bottom: 40px;
}
</style>
</head>
<body>
    <tiles:insertAttribute name="header" />
    <tiles:insertAttribute name="body" />
</body>
</html>
