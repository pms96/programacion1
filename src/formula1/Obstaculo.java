package formula1;

public abstract class Obstaculo {
	
	private int posicion;
	protected int direccion;
	


	public Obstaculo() {
		super();
		this.posicion = (int)Math.round(Math.random()* (99 - 1) + 1);
		this.direccion = direccion;
	}
	
	
	public  abstract void direccion ();


	int getPosicion() {
		return posicion;
	}


	void setPosicion(int posicion) {
		this.posicion = posicion;
	}


	int getDireccion() {
		return direccion;
	}


	void setDireccion(int direccion) {
		this.direccion = direccion;
	}


	@Override
	public String toString() {
		return "Obstaculo [posicion=" + posicion + ", direccion=" + direccion + "]";
	}
	
	

}	