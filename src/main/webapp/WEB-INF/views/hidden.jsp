<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%--@elvariable id="armando" type="it.euris.example.models.User"--%>
    <%@ page isELIgnored="false" %> 
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hidden Page</title>
</head>
<body>
	<p> Hidden Page </p>
	<p> Attribute recovered by Expression Language: ${armando.surname} </p>
	<% out.append("Ciao ");%>
</body>
</html>