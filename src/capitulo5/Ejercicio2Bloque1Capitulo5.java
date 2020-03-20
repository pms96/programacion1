package capitulo5;

public class Ejercicio2Bloque1Capitulo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = new int[150];

		
		
		
		// Inicializaci�n de los valores del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
			numeros [i] = (int) Math.round(Math.random() * 100);
			System.out.println(i + ": " + numeros[i]);
			
	}
		System.out.println("---------------");
		for (int i = numeros.length - 1; i > -1; i--) {
			System.out.println(i + ": " + numeros[i]);
		}		
	}
}

// for (int i = 149; i < numeros.length; i--)
//	numeros[i]= numeros.length -1;
//	System.out.println(i + ": " + numeros[i]);