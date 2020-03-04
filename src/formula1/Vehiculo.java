package formula1;

import java.awt.Color;

public abstract class Vehiculo {
	private String nombre;
	protected int posicion = 0;
	private Color color;
	private Pista pista;
	



	public Vehiculo(String nombre) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
		this.color = color;
		this.pista = pista;
	}
	
	public abstract void avanza () ;


	String getNombre() {
		return nombre;
	}


	void setNombre(String nombre) {
		this.nombre = nombre;
	}


	int getPosicion() {
		return posicion;
	}


	void setPosicion(int posicion) {
		this.posicion = posicion;
	}


	Color getColor() {
		return color;
	}


	void setColor(Color color) {
		this.color = color;
	}


	Pista getPista() {
		return pista;
	}


	void setPista(Pista pista) {
		this.pista = pista;
	}


	@Override
	public String toString() {
		return "Vehiculo [nombre=" + nombre + ", posicion=" + posicion + ", color=" + color + ", pista=" + pista + "]";
	}
	
	

}
