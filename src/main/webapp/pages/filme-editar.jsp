<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Filmes - Editar</title>

<c:set value="${pageContext.request.contextPath}" var="contextPath" />

<link href="${css}/bootstrap.css" rel="stylesheet">
<link href="${css}/small-business.css" rel="stylesheet">
</head>
<body>

	<!-- Header -->
	<nav class=" navbar-dark bg-dark fixed-top">
		<div class="container">
			<p class="navbar-brand">Editar Filme</p>
		</div>
	</nav>

	<!-- Page Content -->
	<div class="container">

		<!-- Page Features -->
		<div class="row text-center pt-5">

			<div class="col-md-6 mb-4 mt-4">
				<div class="card h-100">
					<img class="card-img-top"
						src="${filme.imagemCartaz}"
						alt="">
				</div>
			</div>

			<div class="col-md-6 mb-4 mt-4">
				<div class="card h-100">
					<div class="card-body text-left">
						<form:form modelAttribute="filmeModel"
							action="${contextPath}/filme/${filmeModel.id}" method="put">

							<spring:hasBindErrors name="filmeModel">
								<div class="alert alert-danger" role="alert">
									<form:errors path="*" class="has-error" />
								</div>
							</spring:hasBindErrors>

							<div class="form-group mb-2">
								<label for="nome" class="mb-2">Nome do filme</label>
								
							</div>
							<div class="form-group mb-2">
								<label for="anoLancamento" class="mb-2">Ano de
									lançamento</label> <input type="number" class="form-control "
									id="anoLancamento" value="2014">
							</div>
							<div class="form-group mb-2">
								<label for="classificacaoIndicativa" class="mb-2">Classificação
									indicativa</label> <input type="number" class="form-control "
									id="classificacaoIndicativa" value="10">
							</div>
							<div class="form-group mb-2">
								<label for="duracao" class="mb-2">Duração</label> <input
									type="text" class="form-control " id="duracao" value="2h49min">
							</div>
							<div class="form-group mb-2">
								<label for="generos" class="mb-2">Generos</label> <input
									type="text" class="form-control " id="generos"
									value="Adventure, Drama, Sci-Fi">
							</div>
							<div class="form-group mb-2">
								<label for="diretores" class="mb-2">Diretores</label> <input
									type="text" class="form-control " id="diretores"
									value="Christopher Nolan">
							</div>
							<div class="form-group mb-2">
								<label for="atoresPrincipais" class="mb-2">Atores
									principais</label> <input type="text" class="form-control "
									id="atoresPrincipais"
									value="Matthew McConaughey, Anne Hathaway, Jessica Chastain">
							</div>
							<div class="form-group mb-2">
								<label for="notaImdb" class="mb-2">Nota Imdb</label> <input
									type="number" step="0.1" class="form-control " id="notaImdb"
									value="8,6">
							</div>
							<div class="form-group mb-2">
								<label for="sinopse" class="mb-2">Sinopse</label>
								<textarea class="form-control " id="sinopse">A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.</textarea>
							</div>
							<div class="form-group">
								<input type="text" id="imagemCartaz"
									value="https://m.media-amazon.com/images/M/MV5BZjdkOTU3MDktN2IxOS00OGEyLWFmMjktY2FiMmZkNWIyODZiXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SY1000_SX675_AL_.jpg"
									hidden>
							</div>
							<button type="submit" class="btn btn-lg btn-primary btn-block">Alterar</button>
						</form:form>
					</div>
				</div>
			</div>
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
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>
</html>