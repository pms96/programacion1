package baseDatosAlumno;

import java.io.Serializable;

/**
 * Model class of hacen.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Hacen implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** alumnos. */
	private Alumnos alumnos;


	/** examenes. */
	private Examenes examenes;

	/** nota. */
	private Float nota;

	/**
	 * Constructor.
	 */
	public Hacen() {
	}

	/**
	 * Set the alumnos.
	 * 
	 * @param alumnos
	 *            alumnos
	 */
	public void setAlumnos(Alumnos alumnos) {
		this.alumnos = alumnos;
	}

	/**
	 * Get the alumnos.
	 * 
	 * @return alumnos
	 */
	public Alumnos getAlumnos() {
		return this.alumnos;
	}

	/**
	 * Set the examenes.
	 * 
	 * @param examenes
	 *            examenes
	 */
	public void setExamenes(Examenes examenes) {
		this.examenes = examenes;
	}

	/**
	 * Get the examenes.
	 * 
	 * @return examenes
	 */
	public Examenes getExamenes() {
		return this.examenes;
	}


	/**
	 * Set the nota.
	 * 
	 * @param nota
	 *            nota
	 */
	public void setNota(Float nota) {
		this.nota = nota;
	}

	/**
	 * Get the nota.
	 * 
	 * @return nota
	 */
	public Float getNota() {
		return this.nota;
	}


}
