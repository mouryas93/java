<%@ page errorPage="/errorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" type="text/css">
    <meta charset="utf-8">
	<style>
    .col-centered{
    float: none;
    margin: 0 auto;
}
body { 
   background-image:    url("Images/login.png");
    background-size:     cover;                     
    background-repeat:   no-repeat;
    background-position: center center; 
}
</style>
<title>Login</title>
</head>
<body>
  <div class="container">
  <div class="col-xs-12 col-sm-8 col-md-4 col-lg-4 col-centered">
  <div class="jumbotron">
 <H4>Registration successful</H4>
 
        Your name is 
        <% out.println(request.getParameter("name")); %><br>
         Your user name is 
        <% out.println(request.getParameter("username")); %><br>
          Your email is 
        <% out.println(request.getParameter("email")); %><br>
          Your password is 
        <% out.println(request.getParameter("password")); %><br>
       <br>        Thanks for Registration.
</body>
</html>
