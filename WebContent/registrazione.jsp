<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrati</title>
</head>
<body>
<%@ include file="/header.jsp"%>

<div class="container-fluid">

 <h3> Registrati </h3>
     
     <form name="registrazione" action="RegistrazioneCliente" method="get">
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">Username</label>
      <input type="test" class="form-control" name="username" id="inputEmail4" placeholder="Username">
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">Password</label>
      <input type="password" class="form-control" name="password" id="inputPassword4" placeholder="Password">
    </div>
  </div>
    <div class="form-row">
    <div class="form-group col-md-6">
      <label for="input">Nome</label>
      <input type="text" class="form-control" name="nome" id="inputEmail4" placeholder="Nome">
    </div>
    <div class="form-group col-md-6">
      <label for="input">Cognome</label>
      <input type="text" class="form-control" name="cognome" id="inputPassword4" placeholder="Password">
    </div>
  </div>
  <div class="form-group">
    <label for="inputAddress">Indirizzo</label>
    <input type="text" class="form-control" name="indirizzo" id="inputAddress" placeholder="Indirizzo">
  </div>
    <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">Email</label>
      <input type="text" class="form-control" name="email" id="inputEmail4" placeholder="Email">
    </div>
    <div class="form-group col-md-6">
      <label for="input">Telefono</label>
      <input type="text" class="form-control" name="telefono" id="inputPassword4" placeholder="Telefono">
    </div>
  </div>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="input">CF o P.IVA</label>
      <input type="text" class="form-control" name="cf_piva" id="inputCity">
    </div>
    
    
  </div>
  <div class="form-group">
   
  </div>
  <button type="submit" class="btn btn-primary">Registrati</button>
</form>

</div>
<%@ include file="/footer.jsp"%>
</body>
</html>