import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class MatrizNacho {

	private JFrame frame;
	private int cordX = 90;
	private int cordY = 90;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatrizNacho window = new MatrizNacho();
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
	public MatrizNacho() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				final JButton button = new JButton ("1");
				button.setBounds(cordX, cordY, 50, 50);
				frame.getContentPane().add(button);
				cordX += 50;
			}
			cordY += 50;
			cordX = 90;
		}
		
	}
}
