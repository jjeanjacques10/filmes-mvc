<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>

<title>Filmes - Listagem</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>

<body>

	<h1 style="font-size: 16px">Filmes</h1>
	<table class="table table-dark">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">imagemCartaz</th>
				<th scope="col">nome</th>
				<th scope="col">anoLancamento</th>
				<th scope="col">classificacaoIndicativa</th>
				<th scope="col">duracao</th>
				<th scope="col">generos</th>
				<th scope="col">diretores</th>
				<th scope="col">atoresPrincipais</th>
				<th scope="col">notaImdb</th>
				<th scope="col">sinopse</th>
				<th scope="col">botao</th>
			</tr>
		</thead>
		<c:forEach items="${filmes}" var="filme">
			<tr>
				<td scope="row">${filme.id}</td>
				<td><img src="${filme.imagemCartaz}" width="120" height="auto" alt="Minha Figura"></td>
				<td>${filme.nome}</td>
				<td>${filme.anoLancamento}</td>
				<td>${filme.classificacaoIndicativa}</td>
				<td>${filme.duracao}</td>
				<td>${filme.generos}</td>
				<td>${filme.diretores}</td>
				<td>${filme.atoresPrincipais}</td>
				<td>${filme.notaImdb}</td>
				<td>${filme.sinopse}</td>
				<td><button>Editar</button><button>Excluir</button></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>