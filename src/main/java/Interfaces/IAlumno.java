package Interfaces;

import java.util.List;

import Modelo.TblAlumno;

public interface IAlumno {
	void RegistrarAlumno(TblAlumno alumno);
	void ActualizarAlumno(TblAlumno alumno);
	void EliminarAlumno(TblAlumno alumno);
	List<TblAlumno> ListadoAlumno();
	TblAlumno BuscarAlumno(TblAlumno alumno);
}//fin de la interface...
