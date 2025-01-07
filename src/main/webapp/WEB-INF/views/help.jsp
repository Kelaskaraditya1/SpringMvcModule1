<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%
    String sid = (String) request.getParameter("sid");
    String name = (String) request.getParameter("name");
    String rollNo = request.getParameter("rollNo");
    String department = (String) request.getParameter("department");
%>

<h2>My Student-Id is <%= sid %></h2>
<h2>My Name is <%= name %></h2>
<h2>My Roll No is <%= rollNo %></h2>
<h2>My Department is <%= department %></h2>

<%
    String[] list = request.getParameterValues("expertiseList");
    if (list != null && list.length != 0) {
        for (String object : list) {
%>
            <h2><%= object %></h2>
<%
        }
    }
%>


</body>
</html>