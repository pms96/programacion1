package capitulo5;

import javax.swing.JOptionPane;

public class Ejercicio1Bloque1Capitulo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = new int[150];
		int rangoMenor = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número menor de un rango: ")); 
		int rangoMayor = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número menor de un rango: "));
		int rango = rangoMayor - rangoMenor ;
		
		
		// Inicializaci�n de los valores del array
				for (int i = 0; i < numeros.length; i++) {
					numeros[i] = i + 1;
					numeros [i] = (int) Math.round(Math.random()*rango + rangoMenor );
					System.out.println(i + ": " + numeros[i]);
	}
	}
}
