package capitulo5;

public class Ejercicio5Bloque1Capitulo5 {


	public static void main(String[] args) {

		int numeros[] = new int[150];
		int i = 0, sumaPares = 0, sumaImpares = 0; 

		// Inicializaci�n de los valores del array
		for ( i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
			numeros [i] = (int) Math.round(Math.random() * 100);
			System.out.println(i + ": " + numeros[i]);
			if ( numeros[i] % 2 == 0) {
				sumaPares += numeros[i] ;
				System.out.println(sumaPares + " " + "+" + " " + numeros[i]);
			} 
			
		}
		System.out.println("La total de los numeros pares con resto 0 es: " + sumaPares);
	}
/**
 * 
 * @return
 */
private static int obtenerNumeroAleatorio () {
	return (int) Math.round(Math.random()*100);
}
	
	
	
}

