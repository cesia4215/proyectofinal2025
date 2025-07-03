<%@page import="Modelo.TblAlumno"%>
<%@page import="Modelo.TblMatricula"%>
<%@page import="Dao.AlumnoJPA"%>
<%@page import="Dao.MatriculaJPA"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Gestión de Alumnos y Matrículas</title>
    <style>
        body { font-family: Arial, sans-serif; padding: 20px; background-color: #f9f9f9; }
        table { border-collapse: collapse; width: 100%; margin-top: 20px; }
        th, td { border: 1px solid #ccc; padding: 10px; text-align: left; }
        th { background-color: #cce5ff; color: #004085; }
        tr:nth-child(even) { background-color: #f8f9fa; }
        h2 { background-color: #dee2e6; color: #212529; padding: 10px; border-radius: 5px; }
        form { margin-top: 20px; }
        input[type="submit"], button {
            background-color: #d4edda;
            border: none;
            color: #155724;
            padding: 6px 12px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 14px;
            margin: 2px 1px;
            cursor: pointer;
            border-radius: 4px;
        }
        input[type="submit"]:hover, button:hover {
            background-color: #c3e6cb;
        }
        input[type="text"] {
            padding: 6px;
            border-radius: 4px;
            border: 1px solid #ccc;
        }
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
<%
    AlumnoJPA daoAlumno = new AlumnoJPA();
    MatriculaJPA daoMatricula = new MatriculaJPA();

    String mensaje = "";

    // Acciones para alumno
    String accion = request.getParameter("accion");
    if ("eliminarAlumno".equals(accion)) {
        TblAlumno a = new TblAlumno();
        a.setIdalumno(Integer.parseInt(request.getParameter("id")));
        daoAlumno.EliminarAlumno(a);
        mensaje = "Alumno eliminado.";
    }

    // Acciones para matrícula
    String accionMat = request.getParameter("accionMat");
    if ("eliminarMatricula".equals(accionMat)) {
        TblMatricula m = new TblMatricula();
        m.setIdMatricula(Integer.parseInt(request.getParameter("idMatricula")));
        daoMatricula.EliminarMatricula(m);
        mensaje = "Matrícula eliminada.";
    }

    List<TblAlumno> alumnos = daoAlumno.ListadoAlumno();
    List<TblMatricula> matriculas = daoMatricula.ListadoMatricula();
%>

<h2>📘 Gestión de Alumnos</h2>
<%= mensaje %>

<!-- Formulario de búsqueda de alumno por DNI -->
<form method="get">
    Buscar por DNI: <input type="text" name="dniBuscar">
    <input type="submit" value="Buscar Alumno">
</form>

<table>
    <tr><th>ID</th><th>Nombre</th><th>Apellido</th><th>DNI</th><th>Email</th><th>Sexo</th><th>Fecha</th><th>Grado</th><th>Acción</th></tr>
    <% for (TblAlumno a : alumnos) {
        String filtro = request.getParameter("dniBuscar");
        if (filtro == null || a.getDnialumno().contains(filtro)) { %>
    <tr>
        <td><%= a.getIdalumno() %></td>
        <td><%= a.getNomalumno() %></td>
        <td><%= a.getApealumno() %></td>
        <td><%= a.getDnialumno() %></td>
        <td><%= a.getEmaialumno() %></td>
        <td><%= a.getSexalumno() %></td>
        <td><%= a.getFechaNacimiento() %></td>
        <td><%= a.getGrado() %></td>
        <td>
            <form method="post" style="display:inline;">
                <input type="hidden" name="accion" value="eliminarAlumno">
                <input type="hidden" name="id" value="<%= a.getIdalumno() %>">
                <input type="submit" value="Eliminar">
            </form>
            <form action="editarAlumno.jsp" method="get" style="display:inline;">
			    <input type="hidden" name="id" value="<%= a.getIdalumno() %>">
			    <input type="submit" value="Editar">
			</form>
            
        </td>
    </tr>
    <% }} %>
</table>

<h2>🧾 Gestión de Matrículas</h2>

<!-- Formulario de búsqueda de matrícula por ID Alumno -->
<form method="get">
    Buscar Matrícula por ID Alumno: <input type="text" name="idAlumnoBuscar">
    <input type="submit" value="Buscar Matrícula">
</form>

<table>
    <tr><th>ID Matrícula</th><th>ID Alumno</th><th>Fecha</th><th>Modalidad</th><th>Sección</th><th>Monto</th><th>Acción</th></tr>
    <% for (TblMatricula m : matriculas) {
        String filtroMat = request.getParameter("idAlumnoBuscar");
        if (filtroMat == null || String.valueOf(m.getIdAlumno()).equals(filtroMat)) { %>
    <tr>
        <td><%= m.getIdMatricula() %></td>
        <td><%= m.getIdAlumno() %></td>
        <td><%= m.getFechaMatricula() %></td>
        <td><%= m.getModalidad() %></td>
        <td><%= m.getSeccion() %></td>
        <td><%= m.getMontoMatricula() %></td>
        <td>
            <form method="post" style="display:inline;">
                <input type="hidden" name="accionMat" value="eliminarMatricula">
                <input type="hidden" name="idMatricula" value="<%= m.getIdMatricula() %>">
                <input type="submit" value="Eliminar">
            </form>
            <form action="editarMatricula.jsp" method="get" style="display:inline;">
			    <input type="hidden" name="id" value="<%= m.getIdMatricula() %>">
			    <input type="submit" value="Editar">
			</form>

            
        </td>
    </tr>
    <% }} %>
</table>

<div class="btn-volver">
    <form action="index.jsp">
        <button type="submit">&larr; Volver a la página principal</button>
    </form>
</div>

</body>
</html>

