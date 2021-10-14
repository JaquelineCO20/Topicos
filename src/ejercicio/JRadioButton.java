package ejercicio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;


public class JRadioButton extends JFrame {

	private JPanel contentPane;
	private JLabel lblPregunta;
	private javax.swing.JRadioButton rdbVerdadero;
	private javax.swing.JRadioButton rdbFalso;
	private JButton btnAnterior;
	private JButton btnSiguiente;
	private JButton btnEvaluar;
	private JButton btnSalir;
	private int contador=0;
	private int Respuesta=0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioButton frame = new JRadioButton();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JRadioButton() {
		setTitle("Quizz POO   jaqueline cruz obreg\u00F3n 19100162");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		btnAnterior = new JButton("<-- Anterior");
		btnAnterior.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contador--;
				if(contador==0) {
					lblPregunta.setText("1. El diseño descendente también es conocido como técnica Top-Down");
					rdbVerdadero.setText("Verdadero");
					rdbFalso.setText("Falso");
				}else 
				{
					if(contador==1) {
						lblPregunta.setText("2. Las Especificaciones de Entrada se definen en la etapa de Análisis del Problema");
						rdbVerdadero.setText("Verdadero");
						rdbFalso.setText("Falso");
					}else {
						if(contador==2) {
							lblPregunta.setText("3. Las Especificaciones de Salida se definen en la etapa de Diseno del Algoritmo");
							rdbVerdadero.setText("Verdadero");
							rdbFalso.setText("Falso");
						}else {
							if(contador==3) {
							lblPregunta.setText("4. Las Herramientas de Programación se utilizan en la fase de Análisis del Problema");
							rdbVerdadero.setText("Verdadero");
							rdbFalso.setText("Falso");
							}else {
								if(contador==4) {
								lblPregunta.setText("5. El Refinamiento por Pasos se realiza en la etapa de Diseno del Algoritmo");
								rdbVerdadero.setText("Verdadero");
								rdbFalso.setText("Falso");
								}
							}
						}
					}
				}
			}
		});
		btnAnterior.setBounds(10, 185, 125, 36);
		contentPane.add(btnAnterior);
		
		lblPregunta = new JLabel("1. El dise\u00F1o descendente tambi\u00E9n es conocido como t\u00E9cnica Top-Down");
		lblPregunta.setBounds(35, 28, 524, 14);
		contentPane.add(lblPregunta);
		
		rdbVerdadero = new javax.swing.JRadioButton("Verdadero");
		rdbVerdadero.setBounds(26, 67, 109, 23);
		contentPane.add(rdbVerdadero);
		
		rdbFalso = new javax.swing.JRadioButton("Falso");
		rdbFalso.setBounds(26, 105, 109, 23);
		contentPane.add(rdbFalso);
		
		btnSiguiente = new JButton("Siguiente -->");
		btnSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contador++;
				if(contador==0) {
					lblPregunta.setText("1. El diseño descendente también es conocido como técnica Top-Down");
					rdbVerdadero.setText("Verdadero");
					rdbFalso.setText("Falso");
					if(rdbVerdadero.isSelected()) {
						Respuesta++;
					}
				}else 
				{
					if(contador==1) {
						lblPregunta.setText("2. Las Especificaciones de Entrada se definen en la etapa de Análisis del Problema");
						rdbVerdadero.setText("Verdadero");
						rdbFalso.setText("Falso");
						if(rdbVerdadero.isSelected()) {
							Respuesta++;
						}
					}else {
						if(contador==2) {
							lblPregunta.setText("3. Las Especificaciones de Salida se definen en la etapa de Diseno del Algoritmo");
							rdbVerdadero.setText("Verdadero");
							rdbFalso.setText("Falso");
							if(rdbFalso.isSelected()) {
								Respuesta++;
							}
						}else {
							if(contador==3) {
							lblPregunta.setText("4. Las Herramientas de Programación se utilizan en la fase de Análisis del Problema");
							rdbVerdadero.setText("Verdadero");
							rdbFalso.setText("Falso");
							if(rdbFalso.isSelected()) {
								Respuesta++;
							}
							}else {
								if(contador==4) {
								lblPregunta.setText("5. El Refinamiento por Pasos se realiza en la etapa de Diseno del Algoritmo");
								rdbVerdadero.setText("Verdadero");
								rdbFalso.setText("Falso");
								if(rdbVerdadero.isSelected()) {
									Respuesta++;
								}
								}
							}
						}
					}
				}
			}
		});
		btnSiguiente.setBounds(172, 185, 131, 36);
		contentPane.add(btnSiguiente);
		
		btnEvaluar = new JButton("Evaluar");
		btnEvaluar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(contentPane,"Su puntuaje es: "+ Respuesta + " puntos");;
			}
		});
		btnEvaluar.setBounds(338, 185, 119, 36);
		contentPane.add(btnEvaluar);
		
		btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(482, 185, 77, 36);
		contentPane.add(btnSalir);
	}
}
