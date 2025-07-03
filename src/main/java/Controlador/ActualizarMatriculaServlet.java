package Controlador;

import java.io.IOException;


import Dao.MatriculaJPA;
import Modelo.TblMatricula;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/ActualizarMatriculaServlet")
public class ActualizarMatriculaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            TblMatricula mat = new TblMatricula();
            mat.setIdMatricula(Integer.parseInt(request.getParameter("idMatricula")));
            mat.setIdAlumno(Integer.parseInt(request.getParameter("idAlumno")));
            mat.setFechaMatricula(request.getParameter("fecmatri"));
            mat.setModalidad(request.getParameter("modalidad"));
            mat.setSeccion(request.getParameter("sec"));
            mat.setMontoMatricula(Double.parseDouble(request.getParameter("monmatri")));

            MatriculaJPA dao = new MatriculaJPA();
            dao.ActualizarMatricula(mat);

            response.sendRedirect("alumnosYMatriculas.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error al actualizar: " + e.getMessage());
        }
    }
}

