package formula1;

public class main {

	public static void main(String[] args) {

		String nombresCoche[] = new String[] { "Alonso", "Sainz", "Vettel", "Raiconen" };
		String nombresMoto[] = new String[] { "G.Lorenzo", "Marc Marquez", "Pedrosa", "Rossi" };

		Vehiculo vehiculos[] = new Vehiculo[4];

		for (int i = 0; i < vehiculos.length; i++) {
			int cocheMoto = (int) Math.round(Math.random() * (1 - 0) + 0);
			if (cocheMoto == 0) {
				vehiculos[i] = new Moto(nombresMoto[i]);
			}
			if (cocheMoto == 1) {
				vehiculos[i] = new Coche(nombresCoche[i]);
			}
			System.out.println("participante numero " + i + " con " + vehiculos[i]);
		}

	}

}
