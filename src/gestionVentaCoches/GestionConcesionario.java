package gestionVentaCoches;

import java.util.List;

import gestionVentaCoches.modelo.Concesionario;
import gestionVentaCoches.modelo.controladores.ControladorConcesionario;
import gestionVentaCoches.modelo.controladores.ErrorBBDDException;

public class GestionConcesionario {

	public static void MenuConcesionario () {
		
		int opcionE= -1;
		
		do {
			try {
				System.out.println("\n\t\t\tGESTÓN DE Concesionario");
				
				System.out.println("\n\t1.- Lista de Concesionarios.");
				System.out.println("\t2.- Alta de Concsesionario.");
				System.out.println("\t3.- Modificación de Concesionario.");
				System.out.println("\t4.- Baja de Concesionario.");
				System.out.println("\t0.- Salir");
				System.out.println("\n\tElija una opción: ");
				
				opcionE = Utils.getIntConsola(0, 4);
				
				switch (opcionE) {
				case 0:
					break;
				case 1:
					listadoCon(true);
					break;
				case 2: 
					altaCon();
					break;
				case 3: 
					modificacionCon();
					break;
				case 4: 
					bajaCon();
					break;
				}
			}catch (ErrorBBDDException e) {
				System.out.println("ups algo a pasado 'error de acceso a datos'");
			}
		} while (opcionE !=0);
				
	}
	

	private static void listadoCon(boolean pausafinal) throws ErrorBBDDException {
		List<Concesionario> concesionarios = ControladorConcesionario.getAll();
		System.out.println("\n\tListado de Concesionarios: \n");
		for (Concesionario con : concesionarios) {
			System.out.println("\t" + con.toString());
		}
		if (pausafinal) {
			System.out.println("\n\tPulse 'Intro' tecla para continuar");
			Utils.pausa();
		}
	}
	
	

	private static void altaCon () throws ErrorBBDDException {
		System.out.println("\n\tAlta de concesionario\n");
		
		Concesionario con = new Concesionario();
		System.out.print("\nIntroduzca 'CIF' del Concesionario: ");
		con.setCif(Utils.getStringConsola());
		System.out.print("\nIntroduzca 'Nombre' del Concesionario: ");
		con.setNombre(Utils.getStringConsola());
		
		ControladorConcesionario.almacenarCon(con);  

		System.out.println("\n\tInsertado correctamente!. Pulse 'Intro' para continuar");
		Utils.pausa();
	}



	private static void modificacionCon () throws ErrorBBDDException {
		System.out.println("\n\tModificación de concesionario\n");
		
		Concesionario con = seleccionPorUsuario();
		
		if (con != null) {		
			System.out.print("\nIntroduzca 'CIF' del concesionario ('Intro' para no modificar): ");
			String str = Utils.getStringConsola();
			if (!str.equals("")) 
				con.setCif(str);
			System.out.print("\nIntroduzca 'Nombre' del concesionario  ('Intro' para no modificar): ");
			str = Utils.getStringConsola();
			if (!str.equals("")) 
				con.setNombre(str);
		
			ControladorConcesionario.almacenarCon(con);  

			System.out.println("\n\tModificado correctamente!. Pulse 'Intro' para continuar");
			Utils.pausa();
		}
	}


	private static void bajaCon () throws ErrorBBDDException {
		System.out.println("\n\tModificación de Concesionario\n");
		
		Concesionario con = seleccionPorUsuario();
		
		if (con != null) {		
			System.out.print("\n¿Realmente desea eliminar el registro? (S/N): ");
			String str = Utils.getStringConsola();
			if (str.equalsIgnoreCase("S")) { 		 
				ControladorConcesionario.eliminar(con);
				System.out.println("\n\tEliminado correctamente!. Pulse 'Intro' para continuar");
				Utils.pausa();
			}
		}
	}


	private static Concesionario seleccionPorUsuario () throws ErrorBBDDException {
		Concesionario con = null;
		int id = -2;
		do {
			System.out.println("\n\tIntroduzca ID del Concesionario ('-1' - ver listado, '0' - salir): ");
			id = Utils.getIntConsola(-1);
			if (id == -1) {
				listadoCon(false);
			}
			else {
				if (id != 0) {
					con = ControladorConcesionario.get(id);
					if (con == null) {
						System.out.println("\tError. Ha especificado un ID inválido.");
					}
				}
			}
		} while (con == null && id != 0);
		return con;
	}
}
