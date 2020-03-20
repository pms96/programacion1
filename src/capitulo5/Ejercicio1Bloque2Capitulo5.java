package capitulo5;

public class Ejercicio1Bloque2Capitulo5 {

	public static void main(String[] args) {
	
		int numeros[] = new int[150];
		int i = 0;
	
	for ( i = 0; i < numeros.length; i++) {
			// Inicializaci�n de los valores del array
			numeros[i] = i + 1;
			numeros [i] = (int) Math.round(Math.random() * -100);
			System.out.println(i + ": " + numeros[i]);
			if ( numeros[i] > 0) {
				numeros[i] *= (-1) ;
			} 
			else {
				numeros[i] *= (-1);
			}
		}
		
	}
				
	}


