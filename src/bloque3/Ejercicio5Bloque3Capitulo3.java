package bloque3;

import javax.swing.JOptionPane;

public class Ejercicio5Bloque3Capitulo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = -1, max = 0, min = 0;
		
	    for (int i = 0; num != 0; i++) {
	        num = Integer.parseInt(JOptionPane.showInputDialog("introduzca un número"));
	        if (i == 0)
	        	max = num;
	        else {
	            if (num > max) {
	                max = num;
	         
		        }
	        	
	        }
	        	
	    }
	    System.out.println("Numero Maximo: " + max);
	    System.out.println("Numero Maximo: " + min);

	}

}
