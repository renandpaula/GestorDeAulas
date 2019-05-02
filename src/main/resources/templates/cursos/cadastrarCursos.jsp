<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns:th="http://thymeleaf.org"
	  xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">

<head>
<meta charset="UTF-8">
<title>Gestor de Aulas</title>
</head>
<body>
	<h1>Cadastro de Cursos:</h1>
	<form method="post">
	<table>
	
	<tr>
	<td><label>Nome do Curso:</label></td>
	<td><input type="text" value="" size="40" maxlength="30" name="nomeCurso" id="nomeCurso"/></td>
	</tr>
	
	<tr>
	<td><label>Campus:</label></td>
	<td><input type="text" value="" size="40" maxlength="30" name="campusCurso" id="campusCurso"/></td>
	</tr>
	
	<tr>
	<td colspan='2'>
	<button type="submit">Cadastrar</button> 
	<button type="reset">Limpar</button> 
	</td>
	</tr>
	</table> 
	</form>

</body>
</html>