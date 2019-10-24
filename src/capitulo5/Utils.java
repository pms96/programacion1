package capitulo5;

import javax.swing.JOptionPane;

public class Utils {

	public static void main(String[] args) {

	}

	/**
	 * 
	 * @param limiteSuperior
	 * @param limiteInferior
	 * @return
	 */
	public static int obtenerNumerosAleatorios (int limiteSuperior, int limiteInferior) {
		int rango = limiteSuperior - limiteInferior;
		int numeroAzar = (int) Math.round(Math.random() * rango + limiteInferior);
		return numeroAzar; 
	}
	
	/**
	 * 
	 * @param longitud
	 * @param limInf
	 * @param limSup
	 * @return
	 */
	public static int[] crearUnArrayNumerosAzar( int longitud, int limInf, int limSup) {
		int array [] = new int [longitud];
		for (int i = 0; i < array.length; i++) {
			array [i] = obtenerNumerosAleatorios (limInf, limSup);
		}
		return array;
	}
	
	/**
	 * 
	 * @return
	 */
	public static int obtenerNumUsuario () {
		int num = obtenerNumUsuario ( "Introduce un numero: ");
		return num;
	}
	
	/**
	 * 
	 * @param mensaje
	 * @return
	 */
	public static int obtenerNumUsuario (String mensaje) {
		int num = obtenerNumUsuario ( mensaje, -2147483648, 2147483647);
		return num;
	}
	
	/**
	 * 
	 * @param mensaje
	 * @param minimo
	 * @param maximo
	 * @return
	 */
	public static int obtenerNumUsuario (String mensaje, int minimo, int maximo) {
		int num;
		String mensajeError = "";
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog(mensajeError + mensaje ));
			if (num < minimo || num > maximo) {
				mensajeError = "El numero debe de estar entre: " + minimo + " y " + maximo;
			}
		} while(num < minimo || num > maximo ) ;
		return num;
	}

}

