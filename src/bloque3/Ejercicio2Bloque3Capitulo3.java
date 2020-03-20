package bloque3;

import javax.swing.JOptionPane;

public class Ejercicio2Bloque3Capitulo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, suma = 0;
		float media;
		int numUsuario = Integer.parseInt(JOptionPane.showInputDialog("introduce un digito para determinar la cantidad"
				+ " de digitos que va a introducir"));
		
		
		for (int i =1; i <= numUsuario; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número "));
			
			if (numero > 0 ) {
				suma += numero; // suma números positivos
			}
			else { 
				if (numero == 0); // finalizar programa en 0
				break;
			}
		}
		media = (float) suma/numUsuario; // operación de la media
		
		System.out.println( "La media de todos los números es: " + media);
	}

}
