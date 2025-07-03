<%@page import="Modelo.TblAlumno" %>
<%@page import="Dao.AlumnoJPA" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int id = Integer.parseInt(request.getParameter("id"));
    AlumnoJPA dao = new AlumnoJPA();
    TblAlumno alumno = new TblAlumno();
    alumno.setIdalumno(id);
    TblAlumno a = dao.BuscarAlumno(alumno);
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Editar Alumno</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body { background-color: #f0f4f8; }
        .card { background-color: #ffffff; border: 1px solid #dee2e6; }
        .card-header { background-color: #e3f2fd; color: #0d6efd; }
        .btn-success { background-color: #c3e6cb; color: #000000; border: none; }
        .btn-success:hover { background-color: #b1dfbb; }
        .btn-secondary { background-color: #e2e3e5; color: #000000; border: none; }
        .btn-secondary:hover { background-color: #d6d8db; }
    </style>
</head>

<body>
    <div class="container mt-5">
        <div class="card shadow">
            <div class="card-header">
                <h4 class="mb-0">Editar Datos del Alumno</h4>
            </div>
            <div class="card-body">
                <form action="ActualizarAlumnoServlet" method="post">
                    <input type="hidden" name="idalumno" value="<%= a.getIdalumno() %>">
                    <div class="mb-3">
                        <label class="form-label">Nombre</label>
                        <input type="text" name="nombre" class="form-control" value="<%= a.getNomalumno() %>" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Apellido</label>
                        <input type="text" name="apellido" class="form-control" value="<%= a.getApealumno() %>" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">DNI</label>
                        <input type="text" name="dni" class="form-control" value="<%= a.getDnialumno() %>" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Email</label>
                        <input type="email" name="email" class="form-control" value="<%= a.getEmaialumno() %>" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Sexo</label>
                        <input type="text" name="sexo" class="form-control" value="<%= a.getSexalumno() %>" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Fecha de Nacimiento</label>
                        <input type="text" name="fecnaci" class="form-control" value="<%= a.getFechaNacimiento() %>" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Grado</label>
                        <input type="text" name="grado" class="form-control" value="<%= a.getGrado() %>" required>
                    </div>
                    <div class="d-grid">
                        <button type="submit" class="btn btn-success">Guardar Cambios</button>
                    </div>
                </form>
            </div>
        </div>
        <div class="text-center mt-4">
            <a href="alumnosYMatriculas.jsp" class="btn btn-secondary">Volver</a>
        </div>
    </div>
</body>
</html>

