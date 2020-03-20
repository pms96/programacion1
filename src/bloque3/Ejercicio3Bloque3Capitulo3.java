package bloque3;

import javax.swing.JOptionPane;

public class Ejercicio3Bloque3Capitulo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = -1, min = 0;
		
	    for (int i = 0; num != 0; i++) {
	        num = Integer.parseInt(JOptionPane.showInputDialog("introduzca un número"));
	        if (i == 0)
	        	min = num;
	        else {
	            if (num < min && num !=0) {
	                min = num;
	         
		        }
	        	
	        }
	        	
	    }
	    System.out.println("Numero Maximo: " + min);
	}

}
