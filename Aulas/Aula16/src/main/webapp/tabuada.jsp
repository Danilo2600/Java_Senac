<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@page import="java.util.List" %>
    <%@page import="java.util.ArrayList" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tabuada</title>
</head>
<body>
<table>
	<%
		List<Integer> resultado = new ArrayList<Integer>();
		Integer numero = (Integer)session.getAttribute("numero");
		Integer valor;
		
		resultado = (ArrayList<Integer>) session.getAttribute("tabuada");
		
		for(Integer n: resultado){
		valor = resultado.indexOf(n)+1;
			
		%>
			<tr>
				<td>
				<%=numero%>
				</td>
				
				<td>
				x
				</td>
				
				
				<td>
				<%=valor %>
				</td>
				
				<td>
				=
				</td>
				
				
				<td>
				<%=n %>
				</td>
				
				</tr>
		<% 	
		}
	
	
	%>
	</table>
</body>
</html>