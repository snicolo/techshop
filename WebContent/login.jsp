<%@page import="javax.websocket.Session"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
 <%@ include file="/header.jsp"%>

  <%-- se già loggati reindirizza all'area amministrazione --%>
  <%
	Cookie[] ck = request.getCookies();
	if (ck != null) {
		for (int i = 0; i < ck.length; i++) {
			String name = ck[i].getName();
			String value = ck[i].getValue();
			if (name.equals("admin")) {
					response.sendRedirect("adminarea.jsp");
					break; // exit the loop and continue the page
				}}}
	
		
	%>
 	
 <br>
  <div class="container-fluid">
  


<div class="container-fluid">

  <div class="row">
  <br>
    <div class="col">
    <h3>Effettua il Login</h3>
      <br> 
 <form name="login" action="login" method="post">
  <div class="form-group">
    <div class="form-group col-md-8" action="login">
      <label for="inputEmail4">Username</label>
      <input type="text" class="form-control" name="nome" placeholder="username">
    </div>
    <div class="form-group col-md-8">
      <label for="inputPassword4">Password</label>
      <input type="password" class="form-control" name="pass" placeholder="Password">
    </div>
  </div>
    <div class="form-group">
    <div class="form-check">
      <label class="form-check-label">
        <input class="form-check-input" name="ricorda" type="checkbox"> Ricordami </input>
      </label>
    </div>
  </div>
  <button type="submit" class="btn btn-primary">Entra</button>
</form>
     
    </div>
    <div class="col">
   <h3>Non hai un account?</h3>
   <h4><a href="<%=request.getContextPath()%>/registrazione.jsp">Registrati</a></h4>
    
    </div>
  </div>
 
 </div>

 <br> 
 
 
 

  <%@ include file="/footer.jsp"%>
</body>
</html>