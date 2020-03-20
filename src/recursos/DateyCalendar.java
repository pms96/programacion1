package recursos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class DateyCalendar {
	
	
	private static void ejercicioFechas () {
		
		String fechaUsuario = JOptionPane.showInputDialog("Introduce una fecha formato dd/MM/aaaa");
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		Date fechaparseada = null;
		try {
			fechaparseada = sdf.parse("rafa");
		} catch (ParseException e) {
			System.out.println ("Error en el parseo de la fecha");
			e.printStackTrace();
		}
		System.out.println("Fecha parseada: " + sdf.format(fechaParseada));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
