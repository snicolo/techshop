<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="it.techshop.dao.beans.Cliente" %>
   
    <%@ page import="it.techshop.dao.beans.ClienteDAO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cliente</title>
</head>
<body>
<%@ include file="/header.jsp"%>


<% Cliente cl = (Cliente)request.getAttribute("cliente"); 

%>

<div class="container-fluid">

    
    
 

<br>

<h4>Utente: <%= cl.getUsername()%></h4>

<table class="table">

  <tbody>
    <tr>
      
      <td><b>Nome:</b></td>
      <td><%= cl.getNome() %></td>
     
    </tr>
    <tr>
     
      <td><b>Cognome:</b></td>
      <td><%= cl.getCognome() %></td>
      
    </tr>
    <tr>
      
      <td><b>Indirizzo:</b></td>
      <td><%= cl.getIndirizzo() %></td>
   
    </tr>
    
      <tr>
      
      <td><b>Telefono:</b></td>
      <td><%= cl.getTelefono() %></td>
   
    </tr>
    
      <tr>
      
      <td><b>Email:</b></td>
      <td><%= cl.getEmail() %></td>
   
    </tr>
  </tbody>
</table>
</div>

<%@ include file="/footer.jsp"%>

</body>
</html>