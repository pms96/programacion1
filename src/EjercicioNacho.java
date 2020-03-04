


public class EjercicioNacho {

	public static void main(String[] args) {
		
		int matriz[][] =  new int [10][10];
		int subMatriz [][] = new int [3][3];
		int suma = 1;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = suma;
				suma++;
				System.out.print(matriz[i][j] + "\t" );
			}
			System.out.println();
		
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {	
			}
		}
		

	}
	
	private static int [][] esquinaSuperiorIzquierda(){
		
	}
	
	private static int [][] esquinaSuperiorDerecha(){
		
	}
	
	private static int [][] esquinaInferiorIzquierda(){
		
	}
	
	private static int [][] esquinaInferiorDerecha(){
		
	}
	
	private static int [][] bordeSuperior(){
		
	}
	
	private static int [][] bordeInferior(){
		
	}
	
	private static int [][] bordeIzquierdo(){
		
	}
	
	private static int [][] bordeDerecho(){
		
	}
}