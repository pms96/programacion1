package bloque3ConWhile;

import javax.swing.JOptionPane;

public class Ejercicio1Bloque2Capitulo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, suma = 0;
		float media;
		int numUsuario = Integer.parseInt(JOptionPane.showInputDialog("introduce un digito para determinar la cantidad"
				+ " de digitos que va a introducir"));
		int i = 1;
		
		
		while ( i <= numUsuario) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número "));
			i++;
			if (numero > 0 ) {
				suma += numero; // suma números positivos
				
			}
		}
		media = (float) suma/numUsuario; // operación de la media
		
		System.out.println( "La media de todos los números es: " + media);
	}

}
