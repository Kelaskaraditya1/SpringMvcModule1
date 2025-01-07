<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UserInfo</title>
</head>
<body>
<%@ page import="java.util.List, java.util.ArrayList" %>

<%

String sid = (String) request.getAttribute("StudentId");
String name =(String)request.getAttribute("StudentName");
String department = (String) request.getAttribute("StudentDepartment");
List<String>  expertiseList = (List<String>) request.getAttribute("ExpertiesList");

%>

<h2>The Student-Id of the Student is <%=sid %></h2>
<h2>The Name of the Student is <%=name %></h2>
<h2>The Department of the Student is <%=department %></h2>
<h2>The Student has expertise is in the below technologies</h2>
<%

for(String expertise:expertiseList){
	out.println(expertise);
}

%>


</body>
</html>