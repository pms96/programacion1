package bloque3;

import javax.swing.JOptionPane;

public class NumeroFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int factorial = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número para factoriarlo"));
		
		
		for (int i = factorial - 1; i > 1; i--) {
			
		factorial = factorial * i;
		
		}
		System.out.println("El valor del fatorial equivale a " + factorial);
		
	}

}
