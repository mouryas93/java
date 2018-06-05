<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	type="text/css">
<meta charset="utf-8">
<style>
.col-centered {
	float: none;
	margin: 0 auto;
}

body {
	background-image: url("Images/login.png");
	background-size: cover;
	background-repeat: no-repeat;
	background-position: center center;
}
</style>
<title>Error</title>
</head>
<body>
	<div class="container">
		<div class="col-xs-12 col-sm-8 col-md-4 col-lg-4 col-centered">
			<div class="jumbotron">
				<h4>An error has occurred.</h4>

				<div style="color: #F00;">
					Error message:
					<%=exception.toString()%>
				</div>
</body>
</html>