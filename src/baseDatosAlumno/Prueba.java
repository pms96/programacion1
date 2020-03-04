package baseDatosAlumno;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Prueba {

	private JFrame frame;
	private JTextField numAlumno;
	private JTextField nombre;
	private JTextField grupo;
	private Alumnos listaAlumnos[] = new Alumnos [10];
	private int indiceAlumno = 0; 
	private int cantAlum = -1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba window = new Prueba();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Prueba() {
		initialize();
		
	}
	
	private void mostrarAlumno (int indice) {
		
		numAlumno.setText(listaAlumnos[indice].getNumalumnos());
		nombre.setText(listaAlumnos[indice].getNombre());
		grupo.setText(listaAlumnos[indice].getGrupo());

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numAlumno.setText("");
				nombre.setText("");
				grupo.setText("");
			}
		});
		btnNuevo.setBounds(304, 37, 117, 29);
		frame.getContentPane().add(btnNuevo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Alumnos aux = new Alumnos();
				
				aux.setNombre(nombre.getText());
				aux.setNumalumnos(numAlumno.getText());
				aux.setGrupo(grupo.getText());
				
				listaAlumnos[indiceAlumno] = aux;
				indiceAlumno++;
				cantAlum++;
				
			}
		});
		btnGuardar.setBounds(304, 90, 117, 29);
		frame.getContentPane().add(btnGuardar);
		
		JButton btnAtrs = new JButton("atrás");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(indiceAlumno > 0 ) {
					indiceAlumno --;
					numAlumno.setText(listaAlumnos[indiceAlumno].getNumalumnos());
					nombre.setText(listaAlumnos[indiceAlumno].getNombre());
					grupo.setText(listaAlumnos[indiceAlumno].getGrupo());
				}
			}
		});
		btnAtrs.setBounds(30, 215, 117, 29);
		frame.getContentPane().add(btnAtrs);
		
		JButton btnNext = new JButton("next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(indiceAlumno < cantAlum) {
					indiceAlumno++;
					numAlumno.setText(listaAlumnos[indiceAlumno].getNumalumnos());
					nombre.setText(listaAlumnos[indiceAlumno].getNombre());
					grupo.setText(listaAlumnos[indiceAlumno].getGrupo());
					
				}
			}
		});
		btnNext.setBounds(159, 215, 117, 29);
		frame.getContentPane().add(btnNext);
		
		numAlumno = new JTextField();
		numAlumno.setBounds(146, 37, 130, 26);
		frame.getContentPane().add(numAlumno);
		numAlumno.setColumns(10);
		
		nombre = new JTextField();
		nombre.setBounds(146, 90, 130, 26);
		frame.getContentPane().add(nombre);
		nombre.setColumns(10);
		
		grupo = new JTextField();
		grupo.setBounds(146, 147, 130, 26);
		frame.getContentPane().add(grupo);
		grupo.setColumns(10);
		
		JLabel lblNewLa = new JLabel("Num Alumno");
		lblNewLa.setBounds(50, 42, 61, 16);
		frame.getContentPane().add(lblNewLa);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(50, 95, 61, 16);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblGrupo = new JLabel("Grupo");
		lblGrupo.setBounds(50, 152, 61, 16);
		frame.getContentPane().add(lblGrupo);
		
		JLabel lblCrearAlumno = new JLabel("Crear Alumno");
		lblCrearAlumno.setBounds(169, 6, 103, 16);
		frame.getContentPane().add(lblCrearAlumno);
	}
}
