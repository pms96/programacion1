package formula1;

public class ManchaAceite extends Obstaculo {

	public ManchaAceite() {
		super();
	}
	// 

	@Override
	public void direccion() {
		this.direccion = (int)Math.round(Math.random()* -1 *(20 - 12) + 12);
	}
}
