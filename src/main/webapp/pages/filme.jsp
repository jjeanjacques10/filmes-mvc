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

<spring:url value="/resources/css" var="css" />
<spring:url value="/resources/js" var="js" />

<c:set value="${pageContext.request.contextPath}" var="contextPath" />

<link href="${css}/bootstrap.css" rel="stylesheet">
<link href="${css}/small-business.css" rel="stylesheet">

</head>

<body>

	<!-- Header -->
	<nav class=" navbar-dark bg-dark fixed-top">
		<div class="container">
			<p class="navbar-brand ml-5 pt-2" style="font-weight: bold">FIAPLIX
			</p>
			<p class="navbar-brand">Lista de filmes</p>
		</div>
	</nav>



	<!-- Page Content -->
	<div class="container">
		<!-- Page Features -->

		<div class="row text-center pt-5 d-flex justify-content-center">
			<a href="${contextPath}/filme/form?page=filme-novo"
				class="btn btn-success w-50 mt-5">Adicionar novo filme</a>
		</div>

		<div class="row text-center">
			<c:forEach items="${filmes}" var="filme">
				<div class="col-lg-3 col-md-6 mb-4 mt-5">
					<a href="${contextPath}/filme/${filme.id}">
						<div class="card h-100">
							<img class="card-img-top" src="${filme.imagemCartaz}" alt="">
							<div class="card-body">
								<h4 class="card-title">${filme.nome}</h4>
							</div>
							<div class="card-footer">
								<form:form action="${contextPath}/filme/${filme.id}"
									method="DELETE">
									<a
										href="${contextPath}/filme/form/?page=filme-editar&id=${filme.id}"
										class="btn btn-primary">Editar</a>
									<input type="submit" value="Excluir"
										class="btn btn-danger btn-xs">
								</form:form>
							</div>
						</div>
					</a>
				</div>
			</c:forEach>
		</div>
		<!-- /.row 1-->
	</div>
	<!-- /.container -->

	<!-- Footer -->
	<nav class=" navbar-dark bg-dark fixed-bottom mt-5">
		<div class="container" style="text-align: center;">
			<p class="navbar-brand" style="font-size: 12px;">Desenvolvido por: Jean Jacques Barros | Ahalan Windson
				| Gabriel Petillo | Vitor Rico | Matheus Barros</p>

		</div>
	</nav>

	<!-- Bootstrap core JavaScript -->
	<script src="${jquery}/jquery.min.js"></script>
	<script src="${js}/bootstrap.bundle.min.js"></script>
</body>
</html>