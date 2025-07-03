package TestEntidades;

import java.util.List;

import Dao.MatriculaJPA;

import Modelo.TblMatricula;

public class TestMatricula {

	public static void main(String[] args) {
		
		TblMatricula tblmatricula=new TblMatricula();
		MatriculaJPA mat=new MatriculaJPA();
		
		//metodo registrar
		
		  tblmatricula.setIdAlumno(1); 
		  tblmatricula.setFechaMatricula("08/03/2026");
		  tblmatricula.setModalidad("Virtual"); 
		  tblmatricula.setSeccion("C");
		  tblmatricula.setMontoMatricula(508.00);
		  
		  mat.RegistrarMatricula(tblmatricula);
		  System.out.println("Matricula registrado");
		 
		
        //Metodo Actualizar
		/*
		  tblmatricula.setIdMatricula(2);
		  tblmatricula.setIdAlumno(3);
		  tblmatricula.setFechaMatricula("02/03/2026");
		  tblmatricula.setModalidad("Virtual"); tblmatricula.setSeccion("C");
		  tblmatricula.setMontoMatricula(585.00);
		  
		  mat.ActualizarMatricula(tblmatricula);
		  System.out.println("Matricula Actualizada");
		 */
        
        //metodo eliminar
		
		/*
		  tblmatricula.setIdMatricula(1); 
		  mat.EliminarMatricula(tblmatricula);
		  System.out.println("Matricula eliminada");
		 */
		 
	
	     //metodo listado
			
			/*
			  List<TblMatricula> listar=mat.ListadoMatricula(); 
			  for(TblMatricula lis:listar){
			  System.out.println("codigo: "+lis.getIdMatricula()+" Codigo Alumno: "+lis.
			  getIdAlumno()+
			  " Fecha Matricula: "+lis.getFechaMatricula()+" Modalidad: "+lis.getModalidad(
			  ) +" Sección: " +lis.getSeccion()+" Monto: "+lis.getMontoMatricula()); }
			 */
			 
			  //metodo buscar
			  
				/*
				  tblmatricula.setIdMatricula(2); TblMatricula encontrado =
				  mat.BuscarAlumno(tblmatricula);
				  
				  if (encontrado != null) { System.out.println("Matrícula encontrada:");
				  System.out.println("ID Matrícula: " + encontrado.getIdMatricula());
				  System.out.println("ID Alumno: " + encontrado.getIdAlumno());
				  System.out.println("Fecha: " + encontrado.getFechaMatricula());
				  System.out.println("Modalidad: " + encontrado.getModalidad());
				  System.out.println("Sección: " + encontrado.getSeccion());
				  System.out.println("Monto: " + encontrado.getMontoMatricula()); } else {
				  System.out.println("Matrícula no encontrada."); }
				 */
		        
	} //fin del metodo principal.....

}//fin de la clase...
