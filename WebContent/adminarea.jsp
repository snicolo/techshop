<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="it.techshop.dao.beans.Admin"%>
<%@page import="javax.websocket.Session"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="/header.jsp"%>
	<br>


 

 
 
 <% Cookie[] cookies=request.getCookies();
	if (session!=null){ %>
 




	<div class="card" style="width: 20, 5rem">
		<div class="col-12">
			<div class="float-md-left">
				<h2>Benvenuto</h2>
			</div>

		</div>
	</div>
	<br>
	<div class="container">
		<div class="row">


			<div class="col-12 col-sm-12 col-md-3 col-xl-3">
				<div class="card" style="width: 20, 5rem;">test</div>
			</div>

			<div class="col-12 col-sm-12 col-md-9 col-xl-9">
				<div class="card">







					<a href="./adminarea/orderlist.jsp" class="btn btn-primary btn-lg"
						role="button" aria-pressed="false"><i class="fa fa-list"
						aria-hidden="true"></i> Lista Ordini</a><br> <a
						href="VisualizzaClienti" class="btn btn-primary btn-lg"
						role="button" aria-pressed="false"><i class="fa fa-user"
						aria-hidden="true"></i> Utenti</a><br> <a
						href="./adminarea/catalogue.jsp" class="btn btn-primary btn-lg"
						role="button" aria-pressed="false"><i class="fa fa-laptop"
						aria-hidden="true"></i> Catalogo</a><br> <a
						href="./adminarea/newslist.jsp" class="btn btn-primary btn-lg"
						role="button" aria-pressed="false"><i
						class="fa fa-newspaper-o" aria-hidden="true"></i> News</a><br> <a
						href="./adminarea/coupon.jsp" class="btn btn-primary btn-lg"
						role="button" aria-pressed="false"><i class="fa fa-gift"
						aria-hidden="true"></i> Codici Sconto</a><br> <a
						href="./adminarea/documents.jsp" class="btn btn-primary btn-lg"
						role="button" aria-pressed="false"><i class="fa fa-file-text"
						aria-hidden="true"></i> Documenti Fiscali</a>
				</div>
			</div>
		</div>
	</div>

<%}; %>

	<%@ include file="/footer.jsp"%>
</body>
</html>