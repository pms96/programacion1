package bloque3ConWhile;

import javax.swing.JOptionPane;

public class Ejercicio2Bloque1Captitulo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int acumMayoresDeDiez = 0 ;
		
		// pedir al usuario la cantidad de numeros que quiere utilizar
		int numUsuario = Integer.parseInt(JOptionPane.showInputDialog("Introduce la candidad de numeros que vamos a utilizar "));
		int i= 0;
		
		while  ( i < numUsuario ) { 
			int numBucle = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE UN NÚMERO "));
			i++;
			if (numBucle >= 10) {
				acumMayoresDeDiez += numBucle;
			}
		
		}

		System.out.println("La suma de los mayores de 10 es: " + acumMayoresDeDiez);
	}

}
