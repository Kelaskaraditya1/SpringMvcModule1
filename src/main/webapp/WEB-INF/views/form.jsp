<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Details</title>
</head>
<body>


<%
    // Fetch single-valued parameters
    String sid = request.getParameter("StudentId");
    String name = request.getParameter("StudentName");
    String rollNo = request.getParameter("StudentRollNo");
    String department = request.getParameter("StudentDepartment");
%>

<h2>The Student-Id of the Student is: <%= sid %></h2>
<h2>The Name of the Student is: <%= name %></h2>
<h2>The RollNo of the Student is: <%= rollNo %></h2>
<h2>The Department of the Student is: <%= department %></h2>



</body>
</html>
