package examen2018a;

public class Arraydelateatras {

	public static void main(String[] args) {

		int array[] = new int[100];
		int cuentaatras = 99;
		for (int i = 0; i < array.length; i++) {
			 array[i]=cuentaatras;
			 cuentaatras--;
			System.out.print(array[i] + " ");

		}
	}

}
