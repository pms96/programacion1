package capitulo5;

import javax.swing.JOptionPane;

public class Ejercicio3Bloque1Capitulo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numeros[] = new int[20];
int numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Intorduce el digito que quieres buscar "));
		
		// Inicializaci�n de los valores del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
			numeros [i] = (int) Math.round(Math.random() * 100);
			System.out.println(i + ": " + numeros[i]);
		}
			
			for (int i = numeros.length - 1; i > -1; i--) {			
			if (numeros[i] == numeroUsuario) {
			System.out.println("El numero " + numeroUsuario + " sale en las posición " + i);
			
			}
			else {
				if(numeros [i] != numeroUsuario) {
			System.out.println("El numero " + numeroUsuario + " no aparece en la lista");
			}
			}
	}
	}
}
