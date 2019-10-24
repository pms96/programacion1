package capitulo5;


public class Ejercicio1Bloque3Captitulo5 {

	public static void main(String[] args) {
	
	int array[] = Utils.crearUnArrayNumerosAzar(20, 1, 20);
	int i;
	for (i = 0; i < array.length; i++) {
		System.out.println(array[i]);
	}
	boolean cambioDeLugar = false;
	int pasoDeVariable = 0;
	int posActual;
	int intercambio;
	

	while (cambioDeLugar) {
		cambioDeLugar = true;
		pasoDeVariable++;
		for (posActual = 0; posActual < array.length - pasoDeVariable; posActual++ ) {
			if (array[posActual] > array[posActual + 1]) {
				cambioDeLugar = false;
				// cambio de posiciones
				intercambio = array[posActual];
				array[posActual] = array[posActual + 1];
				array[posActual + 1] = intercambio;
			}
		}
	}
	System.out.println(array[i]);
	}
	}


