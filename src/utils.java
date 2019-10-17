
public class utils {

	public static void main(String[] args) {
			}

	
	public static int obtenerNumerosAleatorios (int limiteSuperior, int limiteInferior) {
		int rango = limiteSuperior - limiteInferior;
		int numeroAzar = (int) Math.round(Math.random() * rango + limiteInferior);
		return numeroAzar; 
	}
	
	
	public static int[] crearUnArrayNumerosAzar( int longitud, int limInf, int limSup) {
		int array [] = new int [longitud];
		for (int i = 0; i < array.length; i++) {
			array [i] = obtenerNumerosAleatorios (limInf, limSup);
		}
		return array;
	}
	
	public static void mostrarArray (int [] array) {
		System.out.println("Contenido Array ");
		System.out.println( crearUnArrayNumerosAzar(longitud, limInf, limSup) + " ");
	}

}
