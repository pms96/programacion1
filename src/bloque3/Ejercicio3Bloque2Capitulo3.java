package bloque3;

import javax.swing.JOptionPane;

public class Ejercicio3Bloque2Capitulo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int factor = Integer.parseInt(JOptionPane.showInputDialog("Inserrte el numero de la tabla que quiera multiplicar "));
		int limite = 100; 
		
		for (int i = 1; i <= limite; i++ ) {
			int resultado = i * factor;
			System.out.println( i + " x " + factor + " = " + resultado);
			
			if (resultado >=100) {
				System.out.println("Fin");
				return;
			}
		}
	}

}
