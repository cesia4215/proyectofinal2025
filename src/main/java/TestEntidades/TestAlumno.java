package TestEntidades;

import java.util.List;

import Dao.AlumnoJPA;
import Modelo.TblAlumno;

public class TestAlumno {

	public static void main(String[] args) {
	    
	        TblAlumno tblalumno = new TblAlumno();
	        AlumnoJPA alu = new AlumnoJPA();
	        
	        //metodo registrar
	        
	        tblalumno.setNomalumno("Ana Abigail");
	        tblalumno.setApealumno("Garcia Benites");
	        tblalumno.setDnialumno("26547894");
	        tblalumno.setEmaialumno("anaabi02@gmail.com");
	        tblalumno.setSexalumno("Femenino");
	        tblalumno.setFechaNacimiento("18/04/2011");
	        tblalumno.setGrado("5°");

	        alu.RegistrarAlumno(tblalumno);
	        System.out.println("Alumno registrado");
	        
	        //Metodo Actualizar
			/*
			  tblalumno.setIdalumno(1); 
			  tblalumno.setNomalumno("Pablo Hernan");
			  tblalumno.setApealumno("Perez Gonzales"); 
			  tblalumno.setDnialumno("77694832");
			  tblalumno.setEmaialumno("Pablo2345@gmail.com");
			  tblalumno.setSexalumno("Masculino");
			  tblalumno.setFechaNacimiento("20/02/2011"); tblalumno.setGrado("5°");
			  
			  alu.ActualizarAlumno(tblalumno); 
			  System.out.println("Alumno Actualizado");
			 */
	        
	        //metodo eliminar
			/*
			   tblalumno.setIdalumno(1); 
			   alu.EliminarAlumno(tblalumno);
			   System.out.println("Alumno eliminado");
			 */
		
		     //metodo listado
			
				/*
				  List<TblAlumno> listar=alu.ListadoAlumno(); for(TblAlumno lis:listar){
				  System.out.println("codigo: "+lis.getIdalumno()+" Nombres: "+
				  lis.getNomalumno()+" Apellidos: "+
				  lis.getApealumno()+" Dni: "+lis.getDnialumno()+" Email: "+lis.getEmaialumno()
				  +" Sexo: "+lis.getSexalumno()+" Fecha de nacimiento: "+lis.getFechaNacimiento
				  ()+" Grado: "+lis.getGrado()); }
				 */
			 
			  //metodo buscar
	        
				/*
				  tblalumno.setIdalumno(2); 
				  TblAlumno encontrado = alu.BuscarAlumno(tblalumno);
				  
				  if (encontrado != null) { System.out.println("Alumno encontrado:");
				  System.out.println("Nombre: " + encontrado.getNomalumno());
				  System.out.println("Apellido: " + encontrado.getApealumno());
				  System.out.println("DNI: " + encontrado.getDnialumno());
				  System.out.println("Correo: " + encontrado.getEmaialumno());
				  System.out.println("Sexo: " + encontrado.getSexalumno());
				  System.out.println("Fecha de nacimiento: " +
				  encontrado.getFechaNacimiento()); System.out.println("Grado: " +
				  encontrado.getGrado()); } else { System.out.println("Alumno no encontrado.");
				  }
				 */
	    
	}
	
} //fin de la clase..
