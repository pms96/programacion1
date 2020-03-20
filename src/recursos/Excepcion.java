package recursos;

import java.util.Scanner;

public class Excepcion extends Exception {

	
	private static int getNumeroImpar() throws NumeroImparException {
		System.out.println("Introduce numero impar");
		Scanner sc = new Scanner (System.in);
		int numero = sc.nextInt();
		
	}
	
	
	private static String getFraseBombilla () {
		Scanner sc = new Scanner (System.in);
		String frase = sc.next();
		
		
		if (frase.trim().equals(" ")) {
			
		}
		
		
	}
	public static void main(String[] args) {
	

	}

}
