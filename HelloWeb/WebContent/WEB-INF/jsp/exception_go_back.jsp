<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ page contentType = "text/html; charset = UTF-8" %>
<html>
<head>
<title>Error</title>
</head>

   <body>
      <h2>${message}</h2>
   	  <a>You entered an incorrect expression. </a>
   </body>
   <br><br>
   <a href="/HelloWeb" >Home</a>
   <br><br>
	<h5>Exception occurred. Go to 'Home' and enter proper expression.</h5>
   
</html>