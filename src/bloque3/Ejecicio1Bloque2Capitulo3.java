package bloque3;

import javax.swing.JOptionPane;

public class Ejecicio1Bloque2Capitulo3 {

	public static void main(String[] args) {
		int numero, suma = 0;
		float media;
		int numUsuario = Integer.parseInt(JOptionPane.showInputDialog("introduce un digito para determinar la cantidad"
				+ " de digitos que va a introducir"));
		
		
		for (int i =1; i <= numUsuario; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número "));
			
			if (numero > 0 ) {
				suma += numero; // suma números positivos
				
			}
		}
		media = (float) suma/numUsuario; // operación de la media
		
		System.out.println( "La media de todos los números es: " + media);

	}
}