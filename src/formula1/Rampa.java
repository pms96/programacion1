package formula1;

public class Rampa extends Obstaculo {

	public Rampa() {
		super();
	}

	@Override
	public void direccion() {
		this.direccion = (int)Math.round(Math.random()* (20 - 12) + 12);
	}
}
