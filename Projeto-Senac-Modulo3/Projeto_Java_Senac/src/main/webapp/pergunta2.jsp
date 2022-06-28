<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta content='width=device-width' name='viewport'/>
<meta content='width=device-width.initial-scale=1.0' name='viewport'/>
<meta content='IE=edge'htpps-equiv='X-UA-Compatible'/>
    <title>Quiz 2</title>
    <link rel="stylesheet" href="estilo.css">
</head>


<body>
   
    <br>
    <br>
    <div id="imagem">
        <h2>O que tem na imagem?</h2>
    <img src="imagem/coreia_do_norte.jpg" alt=""  width="750px" height="530px"  > <br> <br>

</div>
<form action="Resposta2Servlet" method="post">

<div id="botao">
    <input class="text" type="text" name="resposta2" id="resposta2" placeholder="Resposta">
    <input  class="botao" type="submit" value="Pronto">
    </div>
    
  </form>
</body>
</html>