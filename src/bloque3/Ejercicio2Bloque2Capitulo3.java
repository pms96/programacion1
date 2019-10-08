package bloque3;

import javax.swing.JOptionPane;

public class Ejercicio2Bloque2Capitulo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, max = 0, min = 0;
		int numUsuario = Integer.parseInt(JOptionPane.showInputDialog("introduce la cantidad de números que quieras que tenga tu lista")); 
		
	    for (int i = 1; i <= numUsuario; i++) {
	        num = Integer.parseInt(JOptionPane.showInputDialog("introduzca un número?"));
	        if (min != 0 && max != 0) {
	            if (num > max) {
	                max = num;
	            }
	            if (num < min) {
	                min = num;
	            }
	        } else {
	            min = num;
	            max = num;
	        }
	    }
	    System.out.println("Numero Maximo: " + max);
	    System.out.println("Numero Minimo: " + min);
	}
	}

