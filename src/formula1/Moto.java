package formula1;

import java.awt.Color;

public class Moto extends Vehiculo {

	public Moto(String nombre) {
		super(nombre);
		
	}

	@Override
	public void avanza() {
		this.posicion += (int)Math.round(Math.random() *  (6 - 3) + 3);

	}

}
