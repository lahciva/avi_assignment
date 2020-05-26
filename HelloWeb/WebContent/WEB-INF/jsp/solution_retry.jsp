<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ page contentType = "text/html; charset = UTF-8" %>
<html>
<head>
<title>Solution</title>
</head>

   <body>
      <h2>${message}</h2>
   	  <a>Answer: ${solution} </a>
   </body>
   <br><br>
   <a href="/HelloWeb" >Home</a>
   <br><br>
	<h5>This is the solution you've entered for the expression. You can click on 'Home' and try more.</h5>
   
</html>