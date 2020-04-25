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

	<h1>Filmes</h1>
	<table border="1">
		<c:forEach items="${filmes}" var="filme">
			<tr>
				<td>${filme.id}</td>
				<td><img src="${filme.imagemCartaz}" width="120" height="120" alt="Minha Figura"></td>
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