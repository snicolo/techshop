<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="it.techshop.dao.news.News" %>
    <%@page import="it.techshop.dao.news.NewsDAO" %>
    <%@page import="java.util.Vector" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>News</title>
</head>
<body>
 <%@ include file="/header.jsp"%>
  <% 
 Vector<News> listanews =(Vector<News>) request.getAttribute("listanews");
 %>
 <br>
 <% for(News nw : listanews){ %>
 <div class="container-fluid">

<div class="card w-100">
  <div class="card-body">
    <h5 class="card-title"><%= nw.getTitolo() %></h5>
    <p class="card-text"><%= nw.getDescrizione() %></p>
    <a href="LeggiNews?id=<%= nw.getIdnews()%>" class="btn btn-primary">Leggi</a>
  </div>
</div>
<br>
</div>
<%} %>
 <%@ include file="/footer.jsp"%>
</body>
</html>