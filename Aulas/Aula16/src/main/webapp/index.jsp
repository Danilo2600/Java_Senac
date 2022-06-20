<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tabuada</title>

<style>

body{
display: flex;
justify-content: center;
}

.formulario{
display:flex;
widh: 30%;
background-color: gray;
justify-content: center;
margin: 100px;
padding: 20px;
border-radius: 2em;

}
.titulo{
color:white;
font-family: Arial;
font-size: 16px:
}


</style>
</head>
<body>

<div class="formulario">
	<form action="CalcularServlet" method="post">
	<div style="margin-bottom: 15px;">
	<label class="titulo">Quer calcular a tabuada de qual número ?</label>
	</div>
	<input type="number" name="numero" id="numero" requerid/>
	<input type="submit" value="Calcular"/> 
	</form>
	</div>
</body>
</html>