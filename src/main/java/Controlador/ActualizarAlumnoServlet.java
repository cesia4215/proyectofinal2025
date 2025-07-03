package Controlador;

import Dao.AlumnoJPA;
import Modelo.TblAlumno;
import Modelo.TblMatricula;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/ActualizarAlumnoServlet")
public class ActualizarAlumnoServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
        	TblAlumno alu = new TblAlumno();
        	alu.setIdalumno(Integer.parseInt(request.getParameter("idalumno")));
            alu.setNomalumno(request.getParameter("nombre"));
            alu.setApealumno(request.getParameter("apellido"));
            alu.setDnialumno(request.getParameter("dni"));
            alu.setEmaialumno(request.getParameter("email"));
            alu.setSexalumno(request.getParameter("sexo"));
            alu.setFechaNacimiento(request.getParameter("fecnaci"));
            alu.setGrado(request.getParameter("grado"));
           
            AlumnoJPA dao = new AlumnoJPA();
            dao.ActualizarAlumno(alu);

            response.sendRedirect("alumnosYMatriculas.jsp");

        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error al actualizar alumno: " + e.getMessage());
        }
    }
}
