package Proyectos_TA20.Proyectos_TA20.Ejercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JTextArea;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowStateListener;

public class Ejercicio4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio4 window = new Ejercicio4();
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
	public Ejercicio4() {
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
		
		JLabel lblNewLabel = new JLabel("Eventos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(20, 121, 71, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(127, 24, 285, 213);
		frame.getContentPane().add(textArea);
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowOpened(WindowEvent e) {
				textArea.append("Ventana creada\n");
			}
			public void windowActivated(WindowEvent e) {
				textArea.append("Ventana abierta\n");
			}
			public void windowClosed(WindowEvent e) {
				textArea.append("Ventana cerrada\n");
			}
			public void windowClosing(WindowEvent e) {
				textArea.append("Ventana cerrandose...\n");
			}
		});
		
		frame.addWindowFocusListener(new WindowFocusListener() {
			public void windowGainedFocus(WindowEvent e) {
				textArea.append("Ventana en primer plano\n");
			}
			public void windowLostFocus(WindowEvent e) {
				textArea.append("Ventana en segundo plano\n");
			}
		});
		
		frame.addWindowStateListener(new WindowStateListener() {
			public void windowStateChanged(WindowEvent e) {
				textArea.append("Estado de ventana cambiado\n");
			}
		});
	}
}
