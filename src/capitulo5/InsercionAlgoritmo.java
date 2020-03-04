package capitulo5;

public class InsercionAlgoritmo {

	public static void main(String[] args) {
        int array[]= UtilsArrays.creaArrayNumerosAzar(20, 0, 50 );
        UtilsArrays.mostrarArray(array);
    	int i, j;
    	int aux;
    	
    	for (i = 1; i < array.length; i++) {
    		aux = array[i];
			for (j = i ; j > 0 && array[j-1] > aux ; j--) {
				array[j] = array[j - 1];
    	
    		}
			array[j]=aux;
		}
    	System.out.println();
     	UtilsArrays.mostrarArray(array);
    	}
}

