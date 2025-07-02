package TestEntidades;

import java.util.List;

import Dao.AlumnoJPA;
import Modelo.TblAlumno;

public class TestAlumno {

	public static void main(String[] args) {
	    
	        TblAlumno tblalumno = new TblAlumno();
	        AlumnoJPA alu = new AlumnoJPA();
	        
	        //metodo registrar
	        
	   /*   tblalumno.setNomalumno("Sofia Cielo");
	        tblalumno.setApealumno("Jorge Hernan");
	        tblalumno.setDnialumno("24587619");
	        tblalumno.setEmaialumno("SofiaCIe25@gmail.com");
	        tblalumno.setSexalumno("Femenino");
	        tblalumno.setFechaNacimiento("14/05/2011");
	        tblalumno.setGrado("5°");

	        alu.RegistrarAlumno(tblalumno);
	        System.out.println("Alumno registrado");*/
	        
	        //Metodo Actualizar
			/*
			  tblalumno.setIdalumno(1); tblalumno.setNomalumno("Pablo Hernan");
			  tblalumno.setApealumno("Perez Gonzales"); tblalumno.setDnialumno("77694832");
			  tblalumno.setEmaialumno("Pablo2345@gmail.com");
			  tblalumno.setSexalumno("Masculino");
			  tblalumno.setFechaNacimiento("20/02/2010"); tblalumno.setGrado("4°");
			  
			  alu.ActualizarAlumno(tblalumno); System.out.println("Alumno Actualizado");
			 */
	        
	        //metodo eliminar
			/*
			   tblalumno.setIdalumno(1); 
			   alu.EliminarAlumno(tblalumno);
			   System.out.println("Alumno eliminado");
			 */
		
		     //metodo listado
			
			  List<TblAlumno> listar=alu.ListadoAlumno(); for(TblAlumno lis:listar){
			  System.out.println("codigo: "+lis.getIdalumno()+" Nombres: "+
			  lis.getNomalumno()+" Apellidos: "+
			  lis.getApealumno()+" Dni: "+lis.getDnialumno()+" Email: "+lis.getEmaialumno()
			  +" Sexo: "+lis.getSexalumno()+" Fecha de nacimiento: "+lis.getFechaNacimiento
			  ()+" Grado: "+lis.getGrado()); }
			 
	    
	}
	
} //fin de la clase..
