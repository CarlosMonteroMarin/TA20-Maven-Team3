package Proyectos_TA20.Proyectos_TA20.Ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio3 extends JFrame {
	int cont=1;
	int cont2=1;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Ejercicio3() {
		setTitle("Ventana con más interacción");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("Boton 1");
		
		btn1.setBounds(81, 113, 89, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Boton 2");
		
		
		btn2.setBounds(264, 113, 89, 23);
		contentPane.add(btn2);
		JLabel txt_btn1 = new JLabel("Boton 1: 0 veces");
		txt_btn1.setBounds(81, 46, 116, 14);
		contentPane.add(txt_btn1);
		
		JLabel txt_btn2 = new JLabel("Boton 2: 0 veces ");
		txt_btn2.setBounds(264, 46, 124, 14);
		contentPane.add(txt_btn2);
		
		
		//EVENTOS
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_btn1.setText("Boton 1: "+cont+" veces");
				cont++;
			
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_btn2.setText("Boton 2: "+cont2+" veces");
				cont2++;
				
			}
		});
	}
}
