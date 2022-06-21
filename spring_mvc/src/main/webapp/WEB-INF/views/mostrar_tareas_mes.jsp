<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Index</title>
</head>
<body>
	<h1>Tareas del Mes</h1>


<table class="table table-striped">
<tr>
 <th scope="col">FECHA</th>
 <th scope="col">HORA</th>
 <th scope="col">TITULO</th>
 <th scope="col">DETALLE</th>
 <th scope="col">ACCION</th>
</tr>
	<c:forEach items="${listaTareas}" var="tarea">
	<tr>
	    <td>${tarea.fecha}</td>
	    <td>${tarea.hora}</td>
	    <td>${tarea.titulo}</td>
	    <td>${tarea.detalle}</td>
	    <td><a href="/formtareas?id=${tarea.id}">Modificar</a></td>
    </tr>
	</c:forEach>
</table>
<form action="" method="GET">
<button>volver</button>
</form>
</body>
</html>