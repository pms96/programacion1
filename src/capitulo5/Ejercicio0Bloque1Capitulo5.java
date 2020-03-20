package capitulo5;

public class Ejercicio0Bloque1Capitulo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaraci�n del array, a trav�s de la sentencia "new"
		int numeros[] = new int[150];
		float suma = 0, media = 0 ; 
		int mayor = -1 , menor = -1 ;
		
		
		
		// Inicializaci�n de los valores del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
			numeros [i] = (int) Math.round(Math.random() * 100);
			System.out.println(i + ": " + numeros[i]);
			suma += numeros [i];
		
			//primera vez
			if  (i == 0) {
				mayor = numeros [i];
				menor = numeros [i];
			}
			// Resto de iteraciones
			else {
				if (numeros [i] > mayor) mayor = numeros [i];
				if (numeros [i] < menor) menor = numeros [i];
			}
			
		}
		media = suma / numeros.length;
		System.out.println("LA SUMA DE TODOS LOS NUMROS ES : " + suma);
		System.out.println("EL MAYOR DE TODOS LOS NUMEROS ES : " + mayor);
		System.out.println("El MENOR DE TODOS LOS NUMEROS ES : " + menor);
		System.out.println("LA MEDIA ES : " + media);
		
	}

}
