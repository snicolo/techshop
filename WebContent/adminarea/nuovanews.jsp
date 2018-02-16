<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserisci News</title>
</head>
<body>
  <%@ include file="/header.jsp"%>
   <div class="container-fluid">
   
  <form name="aggiungiarticolo" action="<%=request.getContextPath()%>/NuovoArticolo" method="get">
  <div class="form-group mx-sm-3 mb-2">
    <label for="exampleFormControlInput1">Parola Chiave</label>
    <input type="text" class="form-control" name="id">
  </div>
 <div class="form-group">
    <label for="exampleFormControlInput1">Titolo</label>
    <input type="text" class="form-control" name="title">
  </div>
 
  <div class="form-group">
    <label for="exampleFormControlTextarea1">Descrizione</label>
    <textarea class="form-control" name="desc" rows="5"></textarea>
  </div>
  <button type="submit" class="btn btn-primary mb-1">Invia</button>
</form>
  
  </div>
   <%@ include file="/footer.jsp"%>
</body>
</html>