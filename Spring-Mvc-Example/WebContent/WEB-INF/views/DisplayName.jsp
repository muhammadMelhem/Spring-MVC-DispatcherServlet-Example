<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>welcome</title>
<%@ page import="java.util.List" %>

</head>
<body>
	<%
		List<String> welcome = (List<String>) request.getAttribute("NameString");
		String welcomeMessage = "";

		for (String msg : welcome)
			welcomeMessage += msg;

		out.print(welcomeMessage);
	%>
</body>
</html>