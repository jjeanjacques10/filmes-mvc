<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

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
      <p class="navbar-brand" >Editar Filme</p>
    </div>
  </nav>

  <!-- Page Content -->
  <div class="container">

    <!-- Page Features -->
    <div class="row text-center pt-5">

      <div class="col-md-6 mb-5 mt-4">
        <div class="card h-100 mt-3 pb-4">
          <img class="card-img-top" src="${filme.imagemCartaz}" alt="">
        </div>
      </div>

      <div class="col-md-6 mt-4">
        <div class="card h-100">
          <div class="card-body text-left mt-4 inline">	  
			<p>Nome do filme: </p>
			<h3><b>${filme.nome}</b></h3>
			<br>
			<br>
			<p>Ano de lançamento: <b>${filme.anoLancamento}</b></p>
			<br>
			<p>Classificação indicativa: <b>${filme.classificacaoIndicativa}</b></p>
			<br>
			<p>Duração: <b>${filme.duracao}</b></p>
			<br>
			<p>Generos: <b>${filme.generos}</b></p>
			<br>
			<p>Diretores: <b>${filme.diretores}</b></p>
			<br>
			<p>Atores principais: <b>${filme.atoresPrincipais}</b></p>
			<br>
			<p>Nota Imdb: <b>${filme.notaImdb}</b></p>
			<br>
			<p>Sinopse: <b>${filme.sinopse}</b></p>
			<br>
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
      <p class="navbar-brand" ></p>
    </div>
  </nav>

	<!-- Bootstrap core JavaScript -->
	<script src="${jquery}/jquery.min.js"></script>
	<script src="${js}/bootstrap.bundle.min.js"></script>

</body>

</html>