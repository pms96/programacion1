package programacionObjetos.examen2018;

public class Baraja {
	Carta barajas[] = new Carta[52];
	int contador = 0;

	public Baraja() {

		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 13; i++) {

				if (j == 0) {
					contador++;
					System.out.println(i + 1 + " Picas " + contador);
				}

				if (j == 1) {
					contador++;
					System.out.println(i + 1 + " Corazones " + contador);
				}

				if (j == 2) {
					contador++;
					System.out.println(i + 1 + " Treboles " + contador);
				}

				if (j == 3) {
					contador++;
					System.out.println(i + 1 + " Diamantes " + contador);
				}
			}
		}

	}
/**
 * 
 */
	public  void AbajoArriba() {
		
		
		Carta aux = barajas[0];
		for (int j = 0; j > barajas.length; j++) {
			barajas[j] = barajas[j-1];
		}
		barajas[barajas.length - 1] = aux;

	}
	/**
	 * 
	 */
	public void imprimir () {
		System.out.println("Baraja");
		for (int j = 0; j < barajas.length; j++) {
			System.out.println(barajas[j]);
		}
	}

}
