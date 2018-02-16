<%@page import="org.apache.jasper.tagplugins.jstl.core.Catch"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <!--  bootstrap e fontawsome icon -->
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
 <script src="https://use.fontawesome.com/9c4745d90f.js"></script>
 <link rel="stylesheet" href="/assets/css/seb.css">
<title>Insert title here</title>
</head>
<body>

<!--  navbar responsive -->
<nav class="navbar navbar-expand-lg navbar-dark" style="background-color: #3270cf;">
  <a class="navbar-brand" href="#">TechShop</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href=".">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="<%=request.getContextPath()%>/shop.jsp">Negozio</a>
      </li>
        <li class="nav-item">
        <a class="nav-link" href="<%=request.getContextPath()%>/ListaNews?action=user">News</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Area Riservata
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="<%=request.getContextPath()%>/login.jsp">Profilo</a>
           <div class="dropdown-divider"></div>
          <% 
          HttpSession session=request.getSession(false);
          if (session!=null){ %>
             <a class="dropdown-item" href="logout">Logout</a>
<%} else { %>
        <a class="dropdown-item" href="<%=request.getContextPath()%>/login.jsp">Login</a>
        <%} %>
          
        </div>
      </li>
      <li class="nav-item">

      
      
      
      
      
      


      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-light my-2 my-sm-0" type="submit">Search</button>
    </form>
    
  </div>
</nav>
</body>
</html>