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
			<p class="navbar-brand">Novo Filme</p>
		</div>
	</nav>

	<!-- Page Content -->
	<div class="container">

		<!-- Page Features -->
		<div class="row text-center pt-5">

			<div class="col-md-6 mb-4 mt-4">
				<div class="card h-100">
					<div class="card-body text-left">
						<form:form modelAttribute="filmeModel"
							action="${contextPath}/filme" method="post">

							<spring:hasBindErrors name="filmeModel">
								<div class="alert alert-danger" role="alert">
									<form:errors path="*" class="has-error" />
								</div>
							</spring:hasBindErrors>

							<div class="form-group mb-2">
								<label for="nome" class="mb-2">Nome do filme</label>
								<form:input type="text" path="nome" id="nome"
									class="form-control" maxlength="100" size="100" />
							</div>
							<div class="form-group mb-2">
								<label for="imagemCartaz" class="mb-2">URL da Imagem</label>
								<form:input type="text" path="imagemCartaz" id="imagemCartaz"
									class="form-control"/>
							</div>
							<div class="form-group mb-2">
								<label for="anoLancamento" class="mb-2">Ano de
									lançamento</label>
								<form:input type="number" path="anoLancamento" id="anoLancamento"
									class="form-control" />
								<font color="red"><form:errors path="anoLancamento" /></font><br />
							</div>
							<div class="form-group mb-2">
								<label for="classificacaoIndicativa" class="mb-2">Classificação
									indicativa</label>
								<form:input type="text" path="classificacaoIndicativa"
									id="classificacaoIndicativa" class="form-control" value="12"
									 />
								<font color="red"><form:errors
										path="classificacaoIndicativa" /></font><br />
							</div>
							<div class="form-group mb-2">
								<label for="duracao" class="mb-2">Duração</label>
								<form:input type="text" path="duracao" id="duracao"
									class="form-control"  />
								<font color="red"><form:errors path="duracao" /></font><br />
							</div>
							<div class="form-group mb-2">
								<label for="generos" class="mb-2">Generos</label>
								<form:input type="text" path="generos" id="generos"
									class="form-control" maxlength="200" size="200" />
								<font color="red"><form:errors path="generos" /></font><br />
							</div>
							<div class="form-group mb-2">
								<label for="diretores" class="mb-2">Diretores</label>
								<form:input type="text" path="diretores" id="diretores"
									class="form-control" maxlength="200" size="200" />
								<font color="red"><form:errors path="diretores" /></font><br />
							</div>
							<div class="form-group mb-2">
								<label for="atoresPrincipais" class="mb-2">Atores
									principais</label>
								<form:input type="text" path="atoresPrincipais"
									id="atoresPrincipais" class="form-control" maxlength="200"
									size="200" />
								<font color="red"><form:errors path="atoresPrincipais" /></font><br />
							</div>
							<div class="form-group mb-2">
								<label for="notaImdb" class="mb-2">Nota Imdb</label>
								<form:input type="number" step="0.1" path="notaImdb"
									id="notaImdb" class="form-control" />
								<font color="red"><form:errors path="notaImdb" /></font><br />
							</div>
							<div class="form-group mb-2">
								<label for="sinopse" class="mb-2">Sinopse</label>
								<form:textarea id="sinopse" class="form-control" path="sinopse"
									rows="6" cols="100" />
								<font color="red"><form:errors path="sinopse" /></font><br />
							</div>
							<div class="form-group">
								<input type="text" id="imagemCartaz"
									value="https://m.media-amazon.com/images/M/MV5BZjdkOTU3MDktN2IxOS00OGEyLWFmMjktY2FiMmZkNWIyODZiXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SY1000_SX675_AL_.jpg"
									hidden>
							</div>
							<button type="submit" class="btn btn-lg btn-primary btn-block">Cadastrar</button>
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
	<script src="${jquery}/jquery.min.js"></script>
	<script src="${js}/bootstrap.bundle.min.js"></script>

</body>
</html>