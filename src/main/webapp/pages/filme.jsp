<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<head>

<title>Filmes - Listagem</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<c:set value="${pageContext.request.contextPath}" var="contextPath" />

<link href="${css}/bootstrap.css" rel="stylesheet">
<link href="${css}/small-business.css" rel="stylesheet">

</head>

<body>

	<!-- Header -->
	<nav class=" navbar-dark bg-dark fixed-top">
		<div class="container">
			<p class="navbar-brand">Lista de filmes</p>
		</div>
	</nav>



	<!-- Page Content -->
	<div class="container">
		<!-- Page Features -->

		<div class="row text-center pt-5 d-flex justify-content-center">
			<a href="${contextPath}/filme/form?page=produto-novo" class="btn btn-success w-50 mt-5">Adicionar novo
				filme</a>
		</div>

		<div class="row text-center pt-5">
			<c:forEach items="${filmes}" var="filme">
				<div class="col-lg-3 col-md-6 mb-4 mt-5">
					<div class="card h-100">
						<img class="card-img-top" src="${filme.imagemCartaz}" alt="">
						<div class="card-body">
							<h4 class="card-title">${filme.nome}</h4>
						</div>
						<div class="card-footer">
							<form:form action="${contextPath}/produto/${produto.id}"
								method="DELETE">
								<a href="${contextPath}/filme/${filme.id}"
									class="btn btn-primary">Editar</a>
								<input type="submit" value="Deletar" class="btn btn-danger">
							</form:form>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
		<!-- /.row 1-->
	</div>
	<!-- /.container -->

	<!-- Footer -->
	<nav class=" navbar-dark bg-dark fixed-bottom mt-5">
		<div class="container">
			<p class="navbar-brand"></p>
		</div>
	</nav>

	<!-- Bootstrap core JavaScript -->
	<script src="${jquery}/jquery.min.js"></script>
	<script src="${js}/bootstrap.bundle.min.js"></script>
</body>
</html>