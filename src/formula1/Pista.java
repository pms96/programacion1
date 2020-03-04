package formula1;

public class Pista {
	
	private Obstaculo obstaculos[] = new Obstaculo[4];

	public Pista() {
		
		for (int i=0; i>obstaculos.length; i++) {
			int numero = (int)Math.round(Math.random()* (1 - 0) + 0);
			if (numero == 0) {
				obstaculos[i] = new Rampa();
			}
			if (numero == 1 ) {
				obstaculos[i] = new ManchaAceite();
			}
		}
		
	}

}
