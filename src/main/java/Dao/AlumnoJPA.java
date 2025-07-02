package Dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IAlumno;
import Modelo.TblAlumno;

public class AlumnoJPA implements IAlumno {
	
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoJPAMysqlMiercoles");
	
	@Override
	public void RegistrarAlumno(TblAlumno alumno) {
		EntityManager em=emf.createEntityManager();
		try{
		em.getTransaction().begin();
		em.persist(alumno);
		em.getTransaction().commit();
		}catch(RuntimeException e){
			System.out.println("Error al registrar: " + e.getMessage());
		}finally{
		em.close();
		}
	}

	@Override
	public void ActualizarAlumno(TblAlumno alumno) {
		EntityManager em=emf.createEntityManager();
		try{
		em.getTransaction().begin();
		em.merge(alumno);
		em.getTransaction().commit();
		}catch(RuntimeException e){
			System.out.println("Error al actualizar: " + e.getMessage());
		}finally{
		em.close();
		}
		
	}

	@Override
	public void EliminarAlumno(TblAlumno alumno) {
		EntityManager em=emf.createEntityManager();
		try{
			em.getTransaction().begin();
			TblAlumno codelim=em.find(TblAlumno.class, alumno.getIdalumno());
			if(codelim!=null){
				em.remove(codelim);
				em.getTransaction().commit();				
			}//fin
		}catch(RuntimeException ex){
			System.out.println("Error al eliminar: " + ex.getMessage());			
		}finally{
			em.close();
		}		
	}

	@Override
	public List<TblAlumno> ListadoAlumno() {
		EntityManager em=emf.createEntityManager();
		List<TblAlumno> listado=null;
		try{
			em.getTransaction().begin();
			listado=em.createQuery("select c from TblAlumno c",TblAlumno.class).getResultList();
			em.getTransaction().commit();
		}catch(RuntimeException ex){
			System.out.println("Error al listar: " + ex.getMessage());
		}finally{
			em.close();
		}
		return listado;
	}

	@Override
	public TblAlumno BuscarAlumno(TblAlumno alumno) {
        EntityManager em = emf.createEntityManager();
        TblAlumno resultado = null;
        try {
            resultado = em.find(TblAlumno.class, alumno.getIdalumno());
        } catch (RuntimeException ex) {
            System.out.println("Error al buscar: " + ex.getMessage());
        } finally {
            em.close();
        }
        return resultado;
	}

}//fin de la clase....
