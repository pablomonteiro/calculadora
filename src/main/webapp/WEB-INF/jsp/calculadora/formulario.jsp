<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculadora</title>
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
</head>
<body>
	<form action="${linkTo[CalculadoraController].calcula}" method="post">
		<p style="color:blue">
			${mensagem}
		</p>
		<h2>Calcula Valores:</h2>
			<select name="operacao">
			  <c:forEach items="${operacoes}" var="operacao">
				  	<option value="${operacao}">${operacao}</option>
			  </c:forEach> 
			</select>
		Valor 1: <input type="text" name="valor1" />
		Valor 2: <input type="text" name="valor2" />
		<input id="idButton" type="submit" name="Calcular" />
	</form>
</body>
</html>