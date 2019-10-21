package capitulo5;

import javax.swing.JOptionPane;

public class Ejercicio4Bloque3Capitulo5 {

	public static void main(String[] args) {
		int numeros[] = new int[150];
		int i = 0, sumaPares = 0, sumaImpares = 0; 

	for ( i = 0; i < numeros.length; i++) {
			// Inicializaci�n de los valores del array
			numeros[i] = i + 1;
			numeros [i] = (int) Math.round(Math.random() * 100);
			System.out.println(i + ": " + numeros[i]);
			if ( numeros[i] % 2 == 0) {
				sumaPares += numeros[i] ;
			} 
			else {
				sumaImpares += numeros[i];
			}
		}
		
		//suma de positivos y negativos
		//for ( i = numeros.length - 1 ; i > -1; i--) {			
			
			
		//}

		System.out.println("La suma de los numeros positivos es: " + sumaPares);
		System.out.println("La suma de los numeros negativos es: " + sumaImpares);
	}

}
