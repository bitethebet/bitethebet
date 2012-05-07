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
                padding-top: 250px;
                padding-bottom: 10px;
                margin-left: 200px;
            }
        </style>
    </head>
    <body>
        <tiles:insertAttribute name="header" />
        <div class="container-fluid">
            <div class="row-fluid">
                <div class="span6">
                    <tiles:insertAttribute name="body" />
                </div>
                <div class="span3">
                    <div class="row">
                        <div class="span3"><tiles:insertAttribute name="authPanel"/></div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
