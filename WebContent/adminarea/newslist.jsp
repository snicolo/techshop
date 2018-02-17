<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="it.techshop.dao.news.News" %>
    <%@page import="it.techshop.dao.news.NewsDAO" %>
    <%@page import="java.util.Vector" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Elenco News</title>
</head>
<body>
 <%@ include file="/header.jsp"%>
 <br>
 <%-- nascondiamo il contenuto a chi non ha i permessi di amministratore --%>
 		<%
		Cookie[] ck = request.getCookies();
		if (ck != null) {
			for (int i = 0; i < ck.length; i++) {
				String name = ck[i].getName();
				String value = ck[i].getValue();
				if (name.equals("admin")) {
				
					
	%>
 <div class="container">
  <input class="form-control mr-sm-2" type="search" placeholder="Cerca notizia" aria-label="Search">
  </div>
  <br>
  <a href="<%=request.getContextPath()%>/adminarea/nuovanews.jsp" class="btn btn-primary btn-lg"
						role="button" aria-pressed="false"><i class="fa fa-plus-circle"
						aria-hidden="true"></i> Aggiungi Articolo</a><br>
						<br>
  <% 
 Vector<News> listanews =(Vector<News>) request.getAttribute("listanews");
  %>
 <br>
 <table class="table table-striped">
  <thead>
    <tr>
     
      <th scope="col">Data</th>
      <th scope="col">Titolo</th>
      <th scope="col">Descrizione</th>
     <%--  <th scope="col"><i class="fa fa-pencil" aria-hidden="true"></i></th> --%> 
      <th scope="col"><i class="fa fa-minus-circle" aria-hidden="true"></i></th>
    </tr>
  </thead>
  <tbody>
  <% for(News n : listanews){ %>
    <tr>
      <th scope="row"><%= n.getData() %></th>
      <td><%= n.getTitolo() %></td>
      <td><%= n.getDescrizione() %></td>
     <%--  <td><a href="ModificaCliente?id=<%= n.getIdnews()%>">Modifica</a></td> --%>
      <td><a href="<%=request.getContextPath()%>/CancellaArticolo?id=<%= n.getIdnews()%>">Elimina</a></td>
    </tr>
   <%}}}} %>
  </tbody>
</table>

 <%@ include file="/footer.jsp"%>

</body>
</html>