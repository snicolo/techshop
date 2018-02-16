<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="it.techshop.dao.beans.Cliente" %>
   
    <%@ page import="it.techshop.dao.beans.ClienteDAO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modifica Cliente</title>
</head>
<body>
<%@ include file="/header.jsp"%>
<br>
<% Cliente cl = (Cliente)request.getAttribute("cliente"); 

 %>
<div class="container-fluid">
<form name="aggiornacliente" action="<%=request.getContextPath()%>/AggiornaCliente?id=<%= cl.getIdCliente()%>" method="post">
  <div class="form-row">
   <div class="form-group col-md-6">
   
      <label for="inputText">Username</label>
      <input type="text" class="form-control" id="inputUsername" name="username" value=<%= cl.getUsername() %>>
    </div>
   <div class="form-group col-md-6">
   
      <label for="inputText">Nome</label>
      <input type="text" class="form-control" id="inputNome" name="nome" value=<%= cl.getNome() %>>
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">Cognome</label>
      <input type="text" class="form-control" id="inputCognome" name="cognome" value=<%= cl.getCognome() %>>
    </div>
    <div class="form-group col-md-6">
      <label for="text">Email</label>
      <input type="text" class="form-control" id="inputEmail4" name="email" value=<%= cl.getEmail() %>>
    </div>
    <div class="form-group col-md-6">
      <label for="text">Password</label>
      <input type="text" class="form-control" id="inputPassword4" name="password" value=<%= cl.getPassword() %>>
    </div>
  </div>
  <div class="form-group">
    <label for="text">Address</label>
    <input type="text" class="form-control" name="indirizzo" id="inputAddress" value=<%= cl.getIndirizzo() %>>
  </div>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="text">Telefono</label>
      <input type="text" class="form-control" name="telefono" id="inputTel" value=<%= cl.getTelefono() %>>
    </div>
    <div class="form-group col-md-4">
      <label for="tect">Codice Fiscale o P.IVA</label>
    <input type="text" class="form-control" name="cf_piva" id="inputCF" value=<%= cl.getCFPIVA() %>>
    </div>
  </div>
  <div class="form-group">
  
  </div>
  <button type="submit" class="btn btn-primary"  href="ModificaCliente?id=<%= cl.getIdCliente()%>">Aggiorna</button>
</form>
    </div>
<%@ include file="/footer.jsp"%>
</div>
</body>
</html>