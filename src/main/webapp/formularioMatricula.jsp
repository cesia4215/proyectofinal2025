<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulario de Matrícula</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">Registrar Matrícula</h2>
    
    <form action="MatriculaServlet" method="post">
        <div class="mb-3">
            <label for="idAlumno" class="form-label">ID del Alumno</label>
            <input type="number" class="form-control" id="idAlumno" name="idAlumno" required>
        </div>

        <div class="mb-3">
            <label for="fecmatri" class="form-label">Fecha de Matrícula</label>
            <input type="date" class="form-control" name="fecmatri" required>
        </div>

        <div class="mb-3">
            <label for="modalidad" class="form-label">Modalidad</label>
            <select class="form-select" name="modalidad" required>
                <option value="">Seleccione</option>
                <option value="Presencial">Presencial</option>
                <option value="Virtual">Virtual</option>
                <option value="Semi-presencial">Semi-presencial</option>
            </select>
        </div>

        <div class="mb-3">
            <label for="sec" class="form-label">Sección</label>
            <input type="text" class="form-control" name="sec" required>
        </div>

        <div class="mb-3">
            <label for="monmatri" class="form-label">Monto de Matrícula</label>
            <input type="number" step="0.01" class="form-control"  name="monmatri" required>
        </div>

        <button type="submit" class="btn btn-primary">Registrar Matrícula</button>
    </form>
</div>
</body>
</html>

