package objetos;

import javax.swing.JOptionPane;

public class CrearPersona {

	public static void main(String[] args) {
		int crearPersona = Integer.parseInt(JOptionPane.showInputDialog(" ¿Quieres crear un usuario nuevo? "
				+ "\n 1 = Si"
				+ "\n 0 = No"));
		
		if( crearPersona == 1 ) {
			Persona datos [] = new Persona[1] ;
			datos[0]= new Persona ();
			datos[0].pedirUsuario();
			datos[0].imprimir();
		}
		else {
			return;
		}
		
	}

}

