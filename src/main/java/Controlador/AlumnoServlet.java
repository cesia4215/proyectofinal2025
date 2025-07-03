package Controlador;

import java.io.IOException;


import Dao.AlumnoJPA;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import Modelo.TblAlumno;

@WebServlet("/AlumnoServlet")
public class AlumnoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			
			String nombre = request.getParameter("nomalumno");
			String apellido = request.getParameter("apealumno");
			String dni = request.getParameter("dnialumno");
			String correo = request.getParameter("emaialumno");
			String sexo = request.getParameter("sexalumno");
			String fechaNacimiento = request.getParameter("fechaNacimiento");
			String grado = request.getParameter("grado");

			TblAlumno alumno = new TblAlumno();
			alumno.setNomalumno(nombre);
			alumno.setApealumno(apellido);
			alumno.setDnialumno(dni);
			alumno.setEmaialumno(correo);
			alumno.setSexalumno(sexo);
			alumno.setFechaNacimiento(fechaNacimiento);
			alumno.setGrado(grado);

			AlumnoJPA dao = new AlumnoJPA();
			dao.RegistrarAlumno(alumno);

			response.sendRedirect("registroExitoso.jsp");

		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().println("Error al registrar alumno: " + e.getMessage());
		}
	}
}

