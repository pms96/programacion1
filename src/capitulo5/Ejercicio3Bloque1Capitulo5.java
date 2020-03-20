package capitulo5;

import javax.swing.JOptionPane;

public class Ejercicio3Bloque1Capitulo5 {

	public static void main(String[] args) {
				int numeros[] = new int[150];
				int numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Intorduce el digito que quieres buscar "));
				int i = 0, con = 0; 

		// Inicializaci�n de los valores del array
		for ( i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
			numeros [i] = (int) Math.round(Math.random() * 100);
			System.out.println(i + ": " + numeros[i]);
		}
			
			for ( i = numeros.length - 1 ; i > -1; i--) {			
			if (numeros[i] == numeroUsuario) {
				con++; 
			System.out.println("El numero " + numeroUsuario + " sale en las posición " + i);
			
			}
		
			}
			if (con == 0 ) {
				System.out.println("El numero " + numeroUsuario + " no ha salido ");
			}
	}
	}


