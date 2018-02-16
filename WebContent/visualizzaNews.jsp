<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="it.techshop.dao.news.News" %>
    <%@page import="it.techshop.dao.news.NewsDAO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Leggi</title>
</head>
<body>
<%@ include file="/header.jsp"%>

<% News ne = (News)request.getAttribute("news"); %>
 <div class="container-fluid">
<h2><%= ne.getTitolo() %></h2>
<br>
<div><%= ne.getData() %></div>
<br>
<p><%= ne.getDescrizione() %></p>
</div>
<%@ include file="/footer.jsp"%>
</body>
</html>