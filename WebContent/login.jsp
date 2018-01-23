<%@page import="javax.websocket.Session"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%@ include file="/header.jsp"%>
  <%= request.getSession().getId() %>  
 
 <%
  Cookie[] cookies=request.getCookies();
	if (cookies!=null)
		for(int i=0; i< cookies.length; i++)
			response.sendRedirect("/techshop/adminarea.jsp"); 
%>
		
 <br>
  <div class="container-fluid">
  
 <form name="login" action="login" method="post">
  <div class="form-row">
    <div class="form-group col-md-6" action="login">
      <label for="inputEmail4">Email</label>
      <input type="text" class="form-control" name="nome" placeholder="username">
    </div>
    <div class="form-group col-md-6">
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
  <button type="submit" class="btn btn-primary">Sign in</button>
</form>

</div>
 <br> 
 
 <!--   <form name="login" action="login" method="post" >
	<input type="text" name="nome" text="Nome"></br>
	<input type="password" name="pass" text="Password"></br>
	<input type="checkbox" name="ridorda" value="1">Ricordami</br> 
			<input type="submit" value="Invia Nome" ></br>
	
		</form> -->
 
 

  <%@ include file="/footer.jsp"%>
</body>
</html>