<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Welcome</title>
<link href="bootstrap/css/bootstrap.css" rel="stylesheet"></link>
<link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet"></link>
<style type="text/css">
body {
	padding-top: 60px;
	padding-bottom: 40px;
}
</style>


</head>
<body>
	<div class="hero-unit">
		<h1>Bite the bet!!!</h1>
		<p>
			<c:out value="${msg}" />
			</a>
		</p>
	</div>
</body>
</html>
