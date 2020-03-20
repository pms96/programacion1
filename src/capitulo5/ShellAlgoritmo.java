package capitulo5;

public class ShellAlgoritmo {

	public static void main(String[] args) {
        int array[]= UtilsArrays.creaArrayNumerosAzar(20, 0, 50 );
        UtilsArrays.mostrarArray(array);
    	int i, j;
    	int aux;
    	int pivote= array.length/2;
    
    	
    	while (pivote > 0) {
    		for (i=pivote; i < array.length; i++) {
    			j = i;
    			aux = array[i];
    			while (j >= pivote && aux < array[j - pivote]) {
    				array[j] = array[j - pivote];
    				j = j - pivote;
    			}
    			array[j] = aux;
    			}
    		if(pivote ==2) {
    			pivote = 1;
    		}else {
    		 pivote /=2;
    				
    		}
	}
    	System.out.println();
     	UtilsArrays.mostrarArray(array);
	}
}
