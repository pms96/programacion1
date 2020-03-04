package objetos;

import javax.swing.JOptionPane;

public class Persona {
	public String nombre;
	public String apellido;
	public String dni;
	public String direccion;
	public String telefono;
	
	public Persona( ) {
	}

	public void pedirUsuario () {
		nombre = JOptionPane.showInputDialog("Indique su nombre");
		apellido =JOptionPane.showInputDialog("Indique sus apellidos");
		dni = JOptionPane.showInputDialog("Diga su DNI");
		direccion = JOptionPane.showInputDialog("Indique su dirección");
		telefono = JOptionPane.showInputDialog("Introduzca su teléfono");
	}

	public void imprimir () {
		System.out.println(" Nombre: " + nombre
				+ "\n Apellido: " + apellido 
				+ "\n DNI: " + dni  
				+ "\n Dirección: " + direccion  
				+ "\n Teléfono: " + telefono);
	}	
}
