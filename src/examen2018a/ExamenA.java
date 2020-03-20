package examen2018a;

import javax.swing.JOptionPane;


public class ExamenA {

	public static void main(String[] args) {
	
		int suma=0, mayor=0, media=0;
		
		int array [] = crearUnArray100NumerosAlAzar (20, 0, 1000);
		imprimeArray(array);
		
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
			mayor = (array[i] > mayor)? array[i] : mayor;
		}
		media= suma / array.length;
		System.out.println("La Suma de todos los numeros es: " + suma);
		System.out.println("El mayor número es: " + mayor);
		System.out.println("La media de todos los numeros es: " + media);
		
		
//		int infe = Integer.parseInt(JOptionPane.showInputDialog("Introduce el límite inferior del array"));
//		int supe = Integer.parseInt(JOptionPane.showInputDialog("Introduce el límite superior del array"));
//				
//		int array2 [] = crearUnArray100NumerosAlAzar (20, infe, supe);
//		imprimeArray(array2);
//		
//		for (int i = array2.length -1; i > - 1; i--) {
//				System.out.print(array2[i] + "      ");
//		}
//		System.out.println("   ");
		
		int limSup=100, limInf=25;
		int array3[] = new int[20];
		for (int i = 0; i < array.length; i++) {
			do {
				array3[i] = (int) Math.round(Math.random()*(limSup - limInf)) + limInf;
			} while (array3[i] % 2 != 0);
			System.out.print(array3[i] + "      ");
		}
		
		System.out.println("   ");
		
		int array4[] = new int[20];
				
				for (int i = 0; i < array.length; i++) {
					int candidato; 
					boolean existeCandidatoEnArray;  
					candidato = obtenerNumeroAzar(0, 40);
					existeCandidatoEnArray = false;
					for (int j = 0; j < i; j++) {
						if (array4[j] == candidato) {
							existeCandidatoEnArray = true;
						}
					}
					if (existeCandidatoEnArray) {
						i = i - 1;
					}
					else {
						array4[i] = candidato;
			}			
		}
		
		imprimeArray(array4);
			
		int array5[] = new int[5];
		int array6[] = new int[5];
		int i;
		int j;
		int k;
		
		boolean existeCandidatoEnArray;  
		for ( i = 0; i < array5.length; i++) {
			int candidato; 
			candidato = obtenerNumeroAzar(0, 100);
			existeCandidatoEnArray = false;
			for (j = 0; j < i; j++) {
				if (array5[j] == candidato) {
					existeCandidatoEnArray = true;
				}
			}
			if (existeCandidatoEnArray) {
				i = i - 1;
			}
			else {
				array5[i] = candidato;
			}
				for(k = 0; k < array6.length; k++) {
					candidato = obtenerNumeroAzar(0, 100);
					existeCandidatoEnArray = false;
					for (int l = 0; l < k; l++) {
						if (array6[l] == candidato && array6[l]!= array5[i]) {
							existeCandidatoEnArray = true;
						}
						if (existeCandidatoEnArray) {
							k = k -1;
						}
						else {
							array6[k] = candidato;
						}
						
					}
				}
		}
		imprimeArray(array5);
		imprimeArray(array6);

		
}

	
	
	/**
	 * 
	 * @param longitud
	 * @param limInf
	 * @param limSup
	 * @return
	 */
	public static int [] crearUnArray100NumerosAlAzar (int longitud, int limInf, int limSup) {
		int array[] = new int[longitud];
		for (int i = 0; i < array.length; i++) {
			array[i] = obtenerNumeroAzar(limInf, limSup);
		}
		return array;
	}
	
	/**
	 * 
	 * @param limInf
	 * @param limSup
	 * @return
	 */
	public static int obtenerNumeroAzar (int limInf, int limSup) {
		return (int) Math.round(Math.random() * (limSup - limInf)) + limInf;
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void imprimeArray (int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}
}