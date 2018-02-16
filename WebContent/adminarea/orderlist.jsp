<%@page import="javax.websocket.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="it.techshop.dao.ordine.ListaOrdiniQuery"%>
<%@ page import="it.techshop.dao.ordine.ListaOrdiniQueryDAO"%>
<%@ page import="java.util.Vector"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista Ordini</title>
</head>
<body>
 <%@ include file="/header.jsp"%>
 
		<%
		Cookie[] ck = request.getCookies();
		if (ck != null) {
			for (int i = 0; i < ck.length; i++) {
				String name = ck[i].getName();
				String value = ck[i].getValue();
				if (name.equals("admin")) {
				
					
	%>
 
				
			
 
 
 
 
 

 
 <% 
 Vector<ListaOrdiniQuery> listaordini =(Vector<ListaOrdiniQuery>) request.getAttribute("listaordini");
 
	
	

  
 %>
 <br>
 <div class="container-fluid">
 
  
 <br>
 <table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Data</th>
      
      <th scope="col">IDCliente</th>
       <th scope="col">Username</th>
      <th scope="col">Nome</th>
      <th scope="col">Cognome</th>
      <th scope="col">Importo</th>

      <th scope="col"><i class="fa fa-pencil" aria-hidden="true"></i></th>
      <th scope="col"><i class="fa fa-trash" aria-hidden="true"></i></th>
    
    </tr>
  </thead>
  
  <tbody>
   <% for(ListaOrdiniQuery L : listaordini){  %>
    <tr>
      <th scope="row"><%= L.getIdordine() %></th>
      <td><%= L.getDataordine() %></td> 
      
      <td><%= L.getIdcliente() %></td>
       <td><%= L.getUsername() %></td> 
       <td><%= L.getNome() %></td> 
        <td><%= L.getCognome() %></td> 
    <td><%= L.getImportoordine() %></td>
 
      <td><a href="DettagliOrdine?id=<%= L.getIdcliente()%>">Dettagli</a></td>
      <td><a href="ModificaCliente?id=<%= L.getIdcliente()%>">Eimina</a></td>
     
     </tr>
      <%} %>
 </tbody>

 </table>
 <% }}} %>
</div>
 <%@ include file="/footer.jsp"%>

</body>
</html>