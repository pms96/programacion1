package bloque3;

import javax.swing.JOptionPane;

public class Ejercicio2Bloque1Capitulo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int acumMayoresDeDiez = 0 ;
		
		// pedir al usuario la cantidad de numeros que quiere utilizar
		int numUsuario = Integer.parseInt(JOptionPane.showInputDialog("Introduce la candidad de numeros que vamos a utilizar "));
		
		
		for (int i = 0; i < numUsuario; i++) { 
			int numBucle = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE UN NÚMERO "));
			if (numBucle >= 10) {
				acumMayoresDeDiez += numBucle;
			}
		
		}

		System.out.println("La suma de los mayores de 10 es: " + acumMayoresDeDiez);
	}

}