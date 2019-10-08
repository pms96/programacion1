package capitulo4;

import javax.swing.JOptionPane;

public class Ejercicio1Bloque3Capitulo3 {

	public static void main(String[] args) {
		
		int acumuladorSuma = 0;

		for (int i = 0; i >= 0; i++ ) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
			if (num > 0) {
				acumuladorSuma += num;
			}
				else { 
					if (num == 0){
					System.out.println("La suma es " + acumuladorSuma);
					return;	
				}
				}
			}
		
	}
		

	}

