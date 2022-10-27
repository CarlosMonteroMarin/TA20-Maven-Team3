package Proyectos_TA20.Proyectos_TA20.Ejercicio7;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Ejercicio7 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the frame.
	 */
	public Ejercicio7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad a convertir:");
		lblNewLabel.setBounds(10, 11, 121, 14);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(121, 8, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado:");
		lblNewLabel_1.setBounds(217, 11, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(280, 8, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Euros a pesetas");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(20, 40, 111, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Cambiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lblNewLabel_2.getText() == "Euros a pesetas") {
					lblNewLabel_2.setText("Pesetas a euros");
				}
				else {
					lblNewLabel_2.setText("Euros a pesetas");
				}
			}
		});
		btnNewButton.setBounds(141, 36, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Calcular");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lblNewLabel_2.getText() == "Euros a pesetas") {
					textField_2.setText(String.valueOf(Double.parseDouble(textField_1.getText())*166.386));
				}
				else {
					textField_2.setText(String.valueOf(Double.parseDouble(textField_1.getText())/166.386));
				}
			}
		});
		btnNewButton_1.setBounds(258, 36, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
		
	}

}
