<%@page import="Modelo.TblMatricula" %>
<%@page import="Dao.MatriculaJPA" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int id = Integer.parseInt(request.getParameter("id"));
    MatriculaJPA dao = new MatriculaJPA();
    TblMatricula matricula = new TblMatricula();
    matricula.setIdMatricula(id);
    TblMatricula m = dao.BuscarMatricula(matricula);
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Editar Matrícula</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body { background-color: #f0f4f8; }
        .card { background-color: #ffffff; border: 1px solid #dee2e6; }
        .card-header { background-color: #e3f2fd; color: #0d6efd; }
        .btn-success { background-color: #c3e6cb; color: #155724; border: none; }
        .btn-success:hover { background-color: #b1dfbb; }
        .btn-secondary { background-color: #e2e3e5; color: #383d41; border: none; }
        .btn-secondary:hover { background-color: #d6d8db; }
    </style>
</head>

<body>
    <div class="container mt-5">
        <div class="card shadow">
            <div class="card-header">
                <h4 class="mb-0">Editar Matrícula</h4>
            </div>
            <div class="card-body">
                <form action="ActualizarMatriculaServlet" method="post">
                    <input type="hidden" name="idMatricula" value="<%= m.getIdMatricula() %>">
                    <div class="mb-3">
                        <label class="form-label">ID Alumno</label>
                        <input type="text" name="idAlumno" class="form-control" value="<%= m.getIdAlumno() %>" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Fecha Matrícula</label>
                        <input type="text" name="fecmatri" class="form-control" value="<%= m.getFechaMatricula() %>" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Modalidad</label>
                        <input type="text" name="modalidad" class="form-control" value="<%= m.getModalidad() %>" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Sección</label>
                        <input type="text" name="sec" class="form-control" value="<%= m.getSeccion() %>" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Monto Matrícula</label>
                        <input type="text" name="monmatri" class="form-control" value="<%= m.getMontoMatricula() %>" required>
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
