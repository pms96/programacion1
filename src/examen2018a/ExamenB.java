package examen2018a;

public class ExamenB {

	public static void main(String[] args) {
		   int v[] = new int[20];
		    int posicion=0;

		    //hallando un numero primo
		    int divisibles;
		    for(int i=0;posicion<v.length;i++){ //no sale de este for sino esta lleno el vector
		        divisibles=0;
		        for(int j=1;j<=i;j++){ // aqui este for, recorre todos los numeros detras de el
		            if(i%j==0){ //los numero primos solo son divisible por 1 y por ellos mismo
		                divisibles++;
		            }
		        }
		        if(divisibles==2){ //si es divisible por el y por 1 entrara
		            v[posicion]=i; // guardo numero el en vector
		            posicion++; // aumento una posicion para el sgte numero
		        }
		    }


		    for(int i=0;i<v.length;i++) {
		        System.out.println("" + v[i]);
		    }
		
	}

	/**
	 * 
	 * @param longitud
	 * @return
	 */
	public static int [] inicializarArray (int longitud) {
		int array[] = new int[longitud];
		for (int i = 0; i < array.length; i++) {
		}
		return array;
	}
		
/**
 * 
 * @param longitud
 * @param limInf
 * @param limSup
 * @return
 */
public static int [] crearUnArray100NumerosAlAzar (int longitud, int limInf, int limSup) {
	int array[] = new int[longitud];
	for (int i = 0; i < array.length; i++) {
		array[i] = obtenerNumeroAzar(limInf, limSup);
	}
	return array;
}

/**
 * 
 * @param limInf
 * @param limSup
 * @return
 */
public static int obtenerNumeroAzar (int limInf, int limSup) {
	boolean primo;
	int numero =(int) Math.round(Math.random() * (limSup - limInf)) + limInf;
	int contador = 2;
	primo=true;
	 
	while ((primo) && (contador!=numero)){
	  if (numero % contador == 0)
	    primo = false;
	  contador++;
	}
	return numero;
}

/**
 * 
 * @param array
 */
public static void imprimeArray (int array[]) {
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i] + "\t");
	}
	System.out.println();
}

/**
 * 
 * @param numero
 * @return
 */
public static boolean esPrimo(int numero){
	  int contador = 2;
	  boolean primo=true;
	  while ((primo) && (contador!=numero)){
	    if (numero % contador == 0)
	      primo = false;
	    contador++;
	  }
	  return primo;
	}
}

