<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Servlet</title>
</head>
<body>
<a href="MyServlet"><b>Llamar GET - Click Here</b></a>
<br><br>
<form action="MyServlet" method="post">
<b>Enter User name: </b><input type="text" name="username">
<b>Enter Password: </b><input type="text" name="password">
<br><br>
 <label for="nombre"><b>Inserte Nombre:</b></label>
 <input type="text" id="nombre" name="nombre" required>
 <label for="apellido"><b>InserteApellido:</b></label>
<input type="text" id="apellido" name="apellido" required>
<br><br>
<label for="numeroDocumento"><b># de Documento:</b></label>
<input type="number" id="numeroDocumento" name="numeroDocumento" required>
<label for="telefono"><b>Inserte Teléfono:</b></label>
<input type="tel" id="telefono" name="telefono" required>
<br><br>
<input type="submit" value="Guardar">
</form>
</body>
</html>