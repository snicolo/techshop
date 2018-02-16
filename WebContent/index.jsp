<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
 <%@ include file="/header.jsp"%>
 

      
   
   <!--  slider -->
   <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img class="d-block w-100" src="image/slide-2.jpg" alt="First slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="image/slide-1.jpg" alt="Second slide">
    </div>
  
  </div>
  <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<br>

<h2>Discover</h2>
<div class="card-deck">
<a href="<%=request.getContextPath()%>/ListaNews?action=user">
  <div class="card">
    <img class="card-img-top" src="image/news-1.png" alt="Card image cap">
    <div class="card-body">
      <h5 class="card-title">Vai alle News</h5>
      <p class="card-text">Rimani aggiornato sulle novità e promozioni</p>
     
    </div></a>
  </div>
  <a href="<%=request.getContextPath()%>/shop.jsp">
  <div class="card">
    <img class="card-img-top" src="image/shop-1.png" alt="Card image cap">
    <div class="card-body">
      <h5 class="card-title">Visita il nostro Shop</h5>
      <p class="card-text">Cerca tra i nostri prodotti</p>
     
    </div></a>
  </div>
  <a href="<%=request.getContextPath()%>/login.jsp"><div class="card">
    <img class="card-img-top" src="image/accedi-1.png" alt="Card image cap">
    <div class="card-body">
      <h5 class="card-title">Accedi</h5>
      <p class="card-text">Effettua l'accesso e vai all'area riservata</p>
    </div>
  </div></a>
</div>


  <%@ include file="/footer.jsp"%>
</body>
</html>