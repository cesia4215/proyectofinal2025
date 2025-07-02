package Modelo;

import javax.persistence.*;

@Entity
@Table(name="tbl_alumno")
@NamedQuery(name="TblAlumno.findAll",query="Select t from TblAlumno t")
public class TblAlumno {
//declaramos sus atributos..
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int idalumno;
	@Column(name="nombre")
	private String nomalumno;
	@Column(name="apellido")
	private String apealumno;
	@Column(name="dni")
	private String dnialumno;
	@Column(name="email")
	private String emaialumno;
	@Column(name="sexo")
	private String sexalumno;
	@Column(name="fecnaci")
	private String fechaNacimiento;
	@Column(name="grado")
	private String grado;

	public TblAlumno(){
		
	} //fin del constructor vacio...

	public TblAlumno(int idalumno, String nomalumno, String apealumno, String dnialumno, String emaialumno,
			String sexalumno, String fechaNacimiento, String grado) {
		super();
		this.idalumno = idalumno;
		this.nomalumno = nomalumno;
		this.apealumno = apealumno;
		this.dnialumno = dnialumno;
		this.emaialumno = emaialumno;
		this.sexalumno = sexalumno;
		this.fechaNacimiento = fechaNacimiento;
		this.grado = grado;
	}

	public int getIdalumno() {
		return idalumno;
	}

	public void setIdalumno(int idalumno) {
		this.idalumno = idalumno;
	}

	public String getNomalumno() {
		return nomalumno;
	}

	public void setNomalumno(String nomalumno) {
		this.nomalumno = nomalumno;
	}

	public String getApealumno() {
		return apealumno;
	}

	public void setApealumno(String apealumno) {
		this.apealumno = apealumno;
	}

	public String getDnialumno() {
		return dnialumno;
	}

	public void setDnialumno(String dnialumno) {
		this.dnialumno = dnialumno;
	}

	public String getEmaialumno() {
		return emaialumno;
	}

	public void setEmaialumno(String emaialumno) {
		this.emaialumno = emaialumno;
	}

	public String getSexalumno() {
		return sexalumno;
	}

	public void setSexalumno(String sexalumno) {
		this.sexalumno = sexalumno;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

}//fin de la clase....
