<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="it.techshop.dao.beans.Cliente" %>
    <%@ page import="java.util.Vector" %>
    <%@ page import="it.techshop.dao.beans.ClienteDAO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="/header.jsp"%>
<br>
<% Cliente cl = (Cliente)request.getAttribute("cliente"); 

 %>
<div class="container-fluid">
<form>
  <div class="form-row">
   <div class="form-group col-md-6">
      <label for="inputText">Nome</label>
      <input type="email" class="form-control" id="inputNome" placeholder=<%= cl.getNome() %>>
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">Cognome</label>
      <input type="password" class="form-control" id="inputCognome" placeholder=<%= cl.getCognome() %>>
    </div>
    <div class="form-group col-md-6">
      <label for="inputEmail4">Email</label>
      <input type="email" class="form-control" id="inputEmail4" placeholder=<%= cl.getEmail() %>>
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">Password</label>
      <input type="password" class="form-control" id="inputPassword4" placeholder=<%= cl.getPassword() %>>
    </div>
  </div>
  <div class="form-group">
    <label for="inputText">Address</label>
    <input type="text" class="form-control" id="inputAddress" placeholder=<%= cl.getIndirizzo() %>>
  </div>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputPhone">Telefono</label>
      <input type="text" class="form-control" id="inputCity" placeholder=<%= cl.getTelefono() %>>
    </div>
    <div class="form-group col-md-4">
      <label for="inputCF">Codice Fiscale o P.IVA</label>
    <input type="text" class="form-control" id="inputCity" placeholder=<%= cl.getCFPIVA() %>>
    </div>
  </div>
  <div class="form-group">
  
  </div>
  <button type="submit" class="btn btn-primary">Sign in</button>
</form>
    </div>
<%@ include file="/footer.jsp"%>
</div>
</body>
</html>