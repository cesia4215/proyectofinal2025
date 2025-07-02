package Modelo;

import javax.persistence.*;

@Entity
@Table(name="tbl_matricula")
@NamedQuery(name="TblMatricula.findAll",query="Select t from TblMatricula t")
public class TblMatricula {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int idMatricula;
	@Column(name="idAlumno")
    private int idAlumno;
	@Column(name="fecmatri")
    private String fechaMatricula;
	@Column(name="modalidad")
    private String modalidad; 
	@Column(name="sec")
    private String seccion;
	@Column(name="monmatri")
    private double montoMatricula;

    public TblMatricula() {
    	
    }

	public TblMatricula(int idMatricula, int idAlumno, String fechaMatricula, String modalidad, String seccion,
			double montoMatricula) {
		super();
		this.idMatricula = idMatricula;
		this.idAlumno = idAlumno;
		this.fechaMatricula = fechaMatricula;
		this.modalidad = modalidad;
		this.seccion = seccion;
		this.montoMatricula = montoMatricula;
	}

	public int getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(int idMatricula) {
		this.idMatricula = idMatricula;
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(String fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public double getMontoMatricula() {
		return montoMatricula;
	}

	public void setMontoMatricula(double montoMatricula) {
		this.montoMatricula = montoMatricula;
	}
    
} //fin de la clase...
