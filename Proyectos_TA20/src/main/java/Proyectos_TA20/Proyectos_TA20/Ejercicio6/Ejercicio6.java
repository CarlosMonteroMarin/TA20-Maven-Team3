package Proyectos_TA20.Proyectos_TA20.Ejercicio6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Ejercicio6 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf_altura;
	private JTextField tf_peso;
	private JTextField tf_resultado;


	/**
	 * Create the frame.
	 */
	public Ejercicio6() {
		setTitle("Indice de masa corporal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Altura (metros)");
		lblNewLabel.setBounds(43, 66, 97, 14);
		contentPane.add(lblNewLabel);
		
		tf_altura = new JTextField();
		tf_altura.setBounds(150, 63, 71, 20);
		contentPane.add(tf_altura);
		tf_altura.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Peso(kg)");
		lblNewLabel_1.setBounds(254, 66, 58, 14);
		contentPane.add(lblNewLabel_1);
		
		tf_peso = new JTextField();
		tf_peso.setBounds(322, 63, 86, 20);
		contentPane.add(tf_peso);
		tf_peso.setColumns(10);
		
		JButton btn_calcular = new JButton("Calcular IMC");
		
		btn_calcular.setBounds(80, 136, 108, 23);
		contentPane.add(btn_calcular);
		
		JLabel lblNewLabel_2 = new JLabel("IMC");
		lblNewLabel_2.setBounds(223, 140, 34, 14);
		contentPane.add(lblNewLabel_2);
		
		tf_resultado = new JTextField();
		tf_resultado.setEditable(false);
		tf_resultado.setBounds(267, 137, 86, 20);
		contentPane.add(tf_resultado);
		tf_resultado.setColumns(10);
		
		
		btn_calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double altura= Double.parseDouble(tf_altura.getText());
				double peso= Double.parseDouble(tf_peso.getText());
				double resultado=peso/Math.pow(altura, 2);
				DecimalFormat  df = new DecimalFormat("#.00");
				
				tf_resultado.setText(df.format(resultado));
				
			}
		});
	}
}
