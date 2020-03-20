package capitulo5;

public class Pruebas {

public static void main(String[] args) {
        int array[]= UtilsArrays.creaArrayNumerosAzar(10, 0, 50 );
        UtilsArrays.mostrarArray(array);
    	int i, j;
    	
    	for (j = 0; j < array.length; j++) {
			for (i = 0; i < array.length-1; i++) {
    		if (array[i] > array[i+1]) {
    				 int aux = array [i];
                     array[i]= array[i+1];
                     array[i+1]= aux;
    			}
    		}
		}
    	System.out.println();
     	UtilsArrays.mostrarArray(array);
    	}
}


	                
	               