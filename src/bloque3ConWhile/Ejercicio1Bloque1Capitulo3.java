package bloque3ConWhile;

import javax.swing.JOptionPane;

public class Ejercicio1Bloque1Capitulo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int acumMayoresDeDiez = 0 ;
int i = 0;
		while ( i < 4) { 
			int a = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE UN NÚMERO "));
			i++;
			if (a >= 10) {
				acumMayoresDeDiez += a;
				
			}
		}
		System.out.println("La suma de los mayores de 10 es: "+ acumMayoresDeDiez);
		
	}

}
