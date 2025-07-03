<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registrar Alumno</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .btn-volver { margin-top: 30px; text-align: center; }
        .btn-volver button {
            background-color: #e2e3e5;
            color: #383d41;
            padding: 10px 20px;
            font-size: 16px;
        }
        .btn-volver button:hover {
            background-color: #d6d8db;
        }
    </style>
    
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">Registrar de Alumno</h2>

    <form action="AlumnoServlet" method="post">
        <div class="mb-3">
            <label for="nomalumno" class="form-label">Nombres</label>
            <input type="text" class="form-control" name="nomalumno" required>
        </div>

        <div class="mb-3">
            <label for="apealumno" class="form-label">Apellidos</label>
            <input type="text" class="form-control" name="apealumno" required>
        </div>

        <div class="mb-3">
            <label for="dnialumno" class="form-label">DNI</label>
            <input type="text" class="form-control" name="dnialumno" required maxlength="8">
        </div>

        <div class="mb-3">
            <label for="emaialumno" class="form-label">Correo Electrónico</label>
            <input type="email" class="form-control" name="emaialumno" required>
        </div>

        <div class="mb-3">
            <label for="sexalumno" class="form-label">Sexo</label>
            <select class="form-select" name="sexalumno" required>
                <option value="">Seleccione</option>
                <option value="Masculino">Masculino</option>
                <option value="Femenino">Femenino</option>
                <option value="Otro">Otro</option>
            </select>
        </div>

        <div class="mb-3">
            <label for="fechaNacimiento" class="form-label">Fecha de Nacimiento</label>
            <input type="date" class="form-control" name="fechaNacimiento" required>
        </div>

        <div class="mb-3">
            <label for="grado" class="form-label">Grado Escolar</label>
            <input type="text" class="form-control" id="grado" name="grado" placeholder="Ej. 1°, 2°, 3°" required>
        </div>

        <button type="submit" class="btn btn-primary">Registrar Alumno</button>
    </form>
</div>

<div class="btn-volver">
    <form action="index.jsp">
        <button type="submit">&larr; Volver a la página principal</button>
    </form>
</div>

</body>
</html>
