package formula1;

import java.awt.Color;

public class Coche extends Vehiculo {

	public Coche(String nombre) {
		super(nombre);
		
	}

	@Override
	public void avanza() {
		this.posicion += (int)Math.round(Math.random() *  (7 - 1) + 1);
	}

}
