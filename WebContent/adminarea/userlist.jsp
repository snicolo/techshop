<%@page import="javax.websocket.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*"%>

<%@ page import="it.techshop.dao.beans.Cliente"%>
<%@ page import="it.techshop.dao.beans.ClienteDAO"%>
<%@ page import="java.util.Vector"%>
<%@ page import="java.sql.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>utenti</title>
</head>
<body>
	<%@ include file="/header.jsp"%>
	<br>
	<div class="container">
		<input class="form-control mr-sm-2" type="search"
			placeholder="Cerca utente" aria-label="Search">
	</div>
	
	
<h3> ciao </h3>
	<br>
<%= request.getSession().getId() %>



	<%
 Cookie[] cookies=request.getCookies();
	if (cookies!=null)
		for(int i=0; i< cookies.length; i++)
			out.println(cookies[i].getName()+""+cookies[i].getValue());
	else
		out.println("nessun cookie presente");
				
			
 %> 


	<% 
 Vector<Cliente> listaclienti =(Vector<Cliente>) request.getAttribute("listaclienti");
 
	
	

  
 %>

 <div class="container-fluid">
 
  
 <br>
 <table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Username</th>
      
      <th scope="col">Nome</th>
      <th scope="col">Cognome</th>
      <th scope="col">Indirizzo</th>
      <th scope="col">CF/P.IVA</th>
      <th scope="col">Telefono</th>
      <th scope="col">E-Mail</th>
      <th scope="col"><i class="fa fa-pencil" aria-hidden="true"></i></th>
      <th scope="col"><i class="fa fa-minus-circle" aria-hidden="true"></i></th>
    </tr>
  </thead>
  
  <tbody>
   <% for(Cliente c : listaclienti){  %>
    <tr>
      <th scope="row"><%= c.getIdCliente() %></th>
      <td><%= c.getUsername() %></td>
      
      <td><%= c.getNome() %></td>
      <td><%= c.getCognome() %></td>
      <td><%= c.getIndirizzo() %></td>
      <td><%= c.getCFPIVA() %></td>
      <td><%= c.getTelefono() %></td>
      <td><%= c.getEmail() %></td>
      <td><a href="ModificaCliente?id=<% c.getIdCliente();%>">Modifica</a></td>
      <td><a href="RimuoviCliente?id=<% c.getIdCliente();%>">Elimina</a></td>
     </tr>
      <%} %>
 </tbody>

 </table>

</div>

	<%@ include file="/footer.jsp"%>

</body>
</html>