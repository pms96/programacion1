package bloque3;

import javax.swing.JOptionPane;

public class Ejercico1Bloque1Capitulo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int acumMayoresDeDiez = 0 ;
		
		for (int i = 0; i < 4; i++) { 
			int a = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE UN NÚMERO "));
			if (a >= 10) {
				acumMayoresDeDiez += a;
			}
		}
		System.out.println("La suma de los mayoures de 10 es: "+ acumMayoresDeDiez);
		
	}

}
