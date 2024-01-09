<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Listado de Recetas</title>
</head>
<body>
    <h1>Listado de Recetas</h1>
    
    <%-- Imprimir información sobre las recetas --%>
    <p>Recetas disponibles:</p>
    <ul>
        <c:forEach items="${recetas}" var="receta">
            <li>ID: ${receta.id}, Nombre: ${receta.nombre}, Dificultad: ${receta.dificultad.dificultad}</li>
        </c:forEach>
    </ul>
</body>
</html>

