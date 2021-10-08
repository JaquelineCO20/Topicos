package ejercicio;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;

public class VentanaSerie extends JFrame {

	private JPanel contentPane;
	private JTextField inpNumero1;
	private JTextField inpNumero2;
	private JTextField inpIteraciones;
	private JTextArea varSerie;

	public static void main(String[] args) {
		VentanaSerie frame = new VentanaSerie();
		frame.setVisible(true);
	}

	public VentanaSerie() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(267, 265, 89, 23);
		contentPane.add(btnSalir);
		
		inpNumero1 = new JTextField();
		inpNumero1.setBounds(173, 11, 86, 20);
		contentPane.add(inpNumero1);
		inpNumero1.setColumns(10);
		
		JLabel lblNumero1 = new JLabel("Numero Inicial 1");
		lblNumero1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumero1.setBounds(34, 11, 108, 17);
		contentPane.add(lblNumero1);
		
		JLabel lblNumero2 = new JLabel("Numero Inicial 2");
		lblNumero2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumero2.setBounds(34, 50, 108, 20);
		contentPane.add(lblNumero2);
		
		inpNumero2 = new JTextField();
		inpNumero2.setBounds(173, 47, 86, 20);
		contentPane.add(inpNumero2);
		inpNumero2.setColumns(10);
		
		inpIteraciones = new JTextField();
		inpIteraciones.setBounds(173, 89, 86, 20);
		contentPane.add(inpIteraciones);
		inpIteraciones.setColumns(10);
		
		JLabel lblIteraciones = new JLabel("Iteraciones");
		lblIteraciones.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIteraciones.setBounds(34, 89, 89, 17);
		contentPane.add(lblIteraciones);
		
		JButton btnGenerar = new JButton("Generar Serie");
		btnGenerar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String varNumero1S = inpNumero1.getText();
				String varNumero2S= inpNumero2.getText();
				String varIteraS= inpIteraciones.getText();
				String cadena="";
				
				int iterador=0;
				int Suma=0;
				int varNumero1I = Integer.parseInt(varNumero1S);
				int varNumero2I = Integer.parseInt(varNumero2S);
				int varIteraI = Integer.parseInt(varIteraS);
				cadena=cadena+varNumero1S+" "+varNumero2S;
				  while (iterador<varIteraI)
		        {
		            Suma= varNumero1I+varNumero2I;
		            varNumero1I=varNumero2I;
		            varNumero2I=Suma;
		            iterador++;
		            cadena=cadena+"  "+Suma;
		        }
				  varSerie.setText(cadena);
			}
		});
		btnGenerar.setBounds(90, 265, 120, 23);
		contentPane.add(btnGenerar);
		
		varSerie = new JTextArea();
		varSerie.setBounds(63, 120, 317, 81);
		contentPane.add(varSerie);
	}
}
