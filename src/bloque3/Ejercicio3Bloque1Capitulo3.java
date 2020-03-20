package bloque3;

import javax.swing.JOptionPane;

public class Ejercicio3Bloque1Capitulo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumaPositivos = 0, sumaNegativos = 0;
		
		//pedir los numeros a introducir
		int numUsuario = Integer.parseInt(JOptionPane.showInputDialog("Introduce el digito de la cantidad de numeros que quieres contar"));
		
		for (int i = 0; i < numUsuario; i++ ) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("introduce un número"));
			if (num < 0) {
				sumaNegativos++;
			}
			else {
				sumaPositivos++;
			}
		}
		System.out.println("Números positivos introducidos: " + sumaPositivos + "   Números negativos introducidos: " + sumaNegativos);
	}

}
