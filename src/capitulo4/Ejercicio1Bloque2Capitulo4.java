package capitulo4;

import javax.swing.JOptionPane;

public class Ejercicio1Bloque2Capitulo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroMayor = 1, numeroMenor = 1;
		
		String str = JOptionPane.showInputDialog("Escribe la cantidad de números de los cuales deseas"
				+ " realizar la media");
		int cantidadDeNumerosParaMedia = Integer.parseInt(str);
		
		for (int i = 0; i < (cantidadDeNumerosParaMedia - 1); i++ ) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
			num = numeroMayor;
			num = numeroMenor;
			
			if (num >= numeroMayor ) {
				numeroMayor++;
			}
			else {
				if (num <= numeroMenor) { 
					numeroMenor++;
				
			}
			}
			}
			
		float resultadoMedia = (numeroMayor/numeroMenor);
		
		System.out.println("La media es: " + resultadoMedia);
			
			
		}
		
		
		
	}


