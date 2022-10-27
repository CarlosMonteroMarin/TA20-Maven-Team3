package Proyectos_TA20.Proyectos_TA20.Ejercicio4;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowStateListener;

public class Ejercicio4 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Ejercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Eventos");
		lblNewLabel.setBounds(10, 128, 54, 14);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(71, 11, 353, 239);
		contentPane.add(textArea);
		
		addWindowListener(new WindowAdapter() {
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
		
		addWindowFocusListener(new WindowFocusListener() {
			public void windowGainedFocus(WindowEvent e) {
				textArea.append("Ventana en primer plano\n");
			}
			public void windowLostFocus(WindowEvent e) {
				textArea.append("Ventana en segundo plano\n");
			}
		});
		
		addWindowStateListener(new WindowStateListener() {
			public void windowStateChanged(WindowEvent e) {
				textArea.append("Estado de ventana cambiado\n");
			}
		});
		
	}

}
