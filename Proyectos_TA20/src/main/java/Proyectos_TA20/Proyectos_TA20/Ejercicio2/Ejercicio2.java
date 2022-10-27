package Proyectos_TA20.Proyectos_TA20.Ejercicio2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Ejercicio2() {
		setTitle("Ventana con interaccion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Boton1");
		
		
		
		btnNewButton.setBounds(188, 125, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Boton2");
		btnNewButton_1.setBounds(302, 125, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Has pulsado el boton");
		lblNewLabel.setBounds(35, 57, 118, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(35, 104, 100, 14);
		contentPane.add(lblNewLabel_1);
		
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_1.setText("Boton1");
			}
		});
		
		
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_1.setText("Boton2");
			}
		});
	}

}
