<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="model.TblProducto" %>
    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>menu principal</title>
</head>
<body bgcolor="#c5dec9">
<h1 align="center">Listado de productos</h1>
<h2 align="center">
<a href="#" style="text-decoration: none">Registrar Producto</a>
</h2>
<table align="center" border=2>
<tr>
<td>Codigo</td>
<td>Producto</td>
<td>Precio</td>
<td>Cantidad</td>
<td>Total</td>
<td colspan="2">Acciones</td>
</tr>
<%
List<TblProducto> listadoproductos=(List<TblProducto>)request.getAttribute("listado");
// aplicamos una condicion
if(listadoproductos!=null){
	// aplicamos un bucle for
	for(TblProducto prod:listadoproductos) {
		%>
		<tr><td>
		<%=prod.getIdproducto() %>
		</td>
		<td>
		<%=prod.getNomprod() %>
		</td>
		<td>
		<%=prod.getPrecio() %>
		</td>
		<td>
		<%=prod.getCantidad() %>
		</td>
		<td>
		<%=prod.getTotal() %>
		</td>
		<td>ACTUALIZAR</td>
		<td>ELIMINAR</td>
		
		</tr>
		<%
	} // fin del bucle for
	 %>
	 <%
} // fin de la condicon
%>
</table>
</body>
</html>