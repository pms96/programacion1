package bloque3;

import javax.swing.JOptionPane;

public class Ejercicio1Bloque3Capitulo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, suma = 0;
		float media;
		int numUsuario = Integer.parseInt(JOptionPane.showInputDialog("introduce un digito para determinar la cantidad"
				+ " de digitos que va a introducir"));
		
		
		for (int i =1; i <= numUsuario; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número "));
			
			if (numero > -100 ) {
				suma += numero; // suma números positivos		
			}
			else { 
				numero = 0;
				System.out.println("acabó");
				
			}
		}
		
		System.out.println( "La suma de todos los números es: " + suma);
	}

}
