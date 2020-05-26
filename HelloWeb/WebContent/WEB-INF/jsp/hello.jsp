<%@ page contentType="text/html; charset = UTF-8"%>
<html>
<head>
<title>Home</title>
</head>

<body>
	<h2>${message}</h2>
	<a>Enter a mathematical expression: 
	<form action="solution_retry" method="Post">
		<input name="expression" type="text"/><br/> 
		<input type="submit"/>
	</form>
	</a>
	<h5>Enter a mathematical expression to solve. And click on 'Submit'.</h5>
</body>
</html>