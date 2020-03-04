
public class UtilsMatriz {


	/**
	 * 
	 * @param filas
	 * @param columnas
	 * @return
	 */
	public static int [] [] inicializarMatriz (int filas, int columnas) {
		int matriz [][] = new int[filas] [columnas];
		inicializarMatrizConValoresAzar(matriz, -100, 100);
		return matriz;
	}
	
	/**
	 * 
	 * @param limSuperior
	 * @param limInferior
	 * @return
	 */
	public static int numerosAzar (int limSuperior, int limInferior) {
		int num = (int) Math.round(Math.random()*(limSuperior - limInferior) + limInferior);
		return num;
	}
	
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static int [][] numerosAzarMatriz (int[][]matriz) {
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz.length; j++) {
				matriz[i][j] = numerosAzar(1,0);
			}
		}
		return matriz;
	}
	
	public static int mostarMatriz(int[][]matriz) {
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				
				
			}
		}
		
	}
}
