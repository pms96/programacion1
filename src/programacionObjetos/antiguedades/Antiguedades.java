package programacionObjetos.antiguedades;

public class Antiguedades {
		private String nombre;
		private int aniofabricacion;
		private String origen;
		private float precio;
	
	public Antiguedades() {
		super();
		this.nombre = "patatin";
		this.aniofabricacion = 1;
		this.origen = "en algún lugar";
		this.precio = 0.01F;
	}

	public void Antigueades(String nombre, int aniofabricacion, String origen, float precio) {
		this.nombre = nombre;
		this.aniofabricacion = aniofabricacion;
		this.origen = origen;
		this.precio = precio;

	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the aniofabricacion
	 */
	public int getAniofabricacion() {
		return aniofabricacion;
	}

	/**
	 * @param aniofabricacion the aniofabricacion to set
	 */
	public void setAniofabricacion(int aniofabricacion) {
		this.aniofabricacion = aniofabricacion;
	}

	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * @return the precio
	 */
	public float getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Antigüedad: " + nombre + ", " + aniofabricacion + ", " + origen + ", " + precio;
	}
}