<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset = "UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Esta es una lista de Tareas de un día concreto" />
    <title>Tareas del Día</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <link rel="stylesheet" href="./css/styles.css"
</head>

<body>
<h1>Tus tareas de hoy</h1>



<ul class="list-group list-group-flush">

  <c:forEach items="${tareasXDia}" var="laTarea">
    <div class="card; mx-auto" style="width: 20rem; >

        <li class="list-group-item; text-primary">Agenda: ${laTarea.agenda.nombre}</li>
        <li class="list-group-item"><h3 class="card-title; p-3 mb-2 bg-info text-white">${laTarea.titulo}</h3></li>
        <li class="list-group-item">Fecha: ${laTarea.fecha}</li>
        <li class="list-group-item">Hora: ${laTarea.hora}</li>
        <li class="list-group-item"><h4 class="card-subtitle mb-2 text-muted">${laTarea.detalle}</h4></li>


    </c:forEach>

</ul>
<div/>

</body>
</html>