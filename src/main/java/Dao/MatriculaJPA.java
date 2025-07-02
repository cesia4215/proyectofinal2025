package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IMatricula;
import Modelo.TblMatricula;

public class MatriculaJPA implements IMatricula{

	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoJPAMysqlMiercoles");
	
	@Override
	public void RegistrarMatricula(TblMatricula matricula) {
	    EntityManager em = emf.createEntityManager();
	    try {
	        em.getTransaction().begin();
	        em.persist(matricula);
	        em.getTransaction().commit();
	    } catch (RuntimeException e) {
	        System.out.println("Error al registrar matrícula: " + e.getMessage());
	    } finally {
	        em.close();
	    }
	}

	@Override
	public void ActualizarMatricula(TblMatricula matricula) {
	       EntityManager em = emf.createEntityManager();
	        try {
	            em.getTransaction().begin();
	            em.merge(matricula);
	            em.getTransaction().commit();
	        } catch (RuntimeException e) {
	            System.out.println("Error al actualizar matrícula: " + e.getMessage());
	        } finally {
	            em.close();
	        }
	}

	@Override
	public void EliminarMatricula(TblMatricula matricula) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            TblMatricula m = em.find(TblMatricula.class, matricula.getIdMatricula());
            if (m != null) {
                em.remove(m);
                em.getTransaction().commit();
            }
        } catch (RuntimeException e) {
            System.out.println("Error al eliminar matrícula: " + e.getMessage());
        } finally {
            em.close();
        }
	}

	@Override
	public List<TblMatricula> ListadoMatricula() {
        EntityManager em = emf.createEntityManager();
        List<TblMatricula> lista = null;
        try {
            em.getTransaction().begin();
            lista = em.createQuery("SELECT m FROM TblMatricula m", TblMatricula.class).getResultList();
            em.getTransaction().commit();
        } catch (RuntimeException e) {
            System.out.println("Error al listar matrículas: " + e.getMessage());
        } finally {
            em.close();
        }
        return lista;
	}

	@Override
	public TblMatricula BuscarAlumno(TblMatricula alumno) {
		EntityManager em = emf.createEntityManager();
        TblMatricula resultado = null;
        try {
            resultado = em.find(TblMatricula.class, alumno.getIdMatricula());
        } catch (RuntimeException e) {
            System.out.println("Error al buscar matrícula: " + e.getMessage());
        } finally {
            em.close();
        }
        return resultado;
	}

}
