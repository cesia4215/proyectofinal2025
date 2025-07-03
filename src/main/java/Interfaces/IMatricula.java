package Interfaces;

import java.util.List;

import Modelo.TblMatricula;

public interface IMatricula {
	void RegistrarMatricula(TblMatricula matricula);
	void ActualizarMatricula(TblMatricula matricula);
	void EliminarMatricula(TblMatricula matricula);
	List<TblMatricula> ListadoMatricula();
	TblMatricula BuscarMatricula(TblMatricula matricula);
}//fin de la interface
