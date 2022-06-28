<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta content='width=device-width' name='viewport'/>
<meta content='width=device-width.initial-scale=1.0' name='viewport'/>
<meta content='IE=edge'htpps-equiv='X-UA-Compatible'/>
    <title>Quiz 5</title>
    <link rel="stylesheet" href="estilo.css">

    
     
</head>
<body>
   
    <br>
    <br>
    <div id="imagem">
        <h2>O que tem na imagem?</h2>
    <img src="imagem/Burj khalifa Dificl.jpg" alt=""  width="800px">  <br> <br>

</div>
<form action="Resposta5Servlet" method="post">

<div id="botao">
    <input class="text" type="text" name="resposta5" id="resposta5" placeholder="Resposta">
    <input class="botao" type="submit" value="Pronto" > 
    </div>

</form>

    
</body>
</html>