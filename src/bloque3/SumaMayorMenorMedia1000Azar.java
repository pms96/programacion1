package bloque3;

import javax.swing.JOptionPane;

public class SumaMayorMenorMedia1000Azar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Obtenemos el valor aleatorio entre el 1 y el 1000
		
		int mayor = 0, menor = 0, suma = 0, media = 0;
		
		for (int i =1; i <= 1000; i++) {
		int numero = (int)Math.round(Math.random()*(1000 - 0)+ 0);
			
			if (numero > -1 ) {
				suma += numero; // suma números positivos
			}
			if (menor != -1 && mayor != -1) {
	            if (numero > mayor) {
	                mayor = numero;
	            }
	            if (numero < menor) {
	                menor = mayor;
	            }
	        } else {
	            menor = mayor;
	            mayor = menor;
	        }
		}
		media = suma / 1000;
		System.out.println( "La suma de todos los números es: " + suma);
		System.out.println( " La media de todos los números es: " + media);
		
		
		
	    
	    System.out.println("Numero Maximo: " + mayor);
	    System.out.println("Numero Minimo: " + menor);
		}

		
	
		
			
	}

