package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.tools.Tool;;

public class VentanaPrincipalGUI extends JFrame {
	
	//creamos los botones, las etiquetas y las cajas de texto
	
	private JTextField cajaTexto, cajaTexto2;
	
	private JButton boton1, boton2, boton3,boton4, boton5, boton6;
	
	private JLabel etiqueta, etiqueta2, etiqueta3;
	
	
	
	
	
	public VentanaPrincipalGUI() {
		//salir de la aplicación
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//damos el tamaño a la ventana
		setSize(500, 500);
		//coloca la pantalla en el centro
		setLocationRelativeTo(null);
		//desactivamos el organizador
		setLayout(null);
		//método para inicializar los componentes 
		inicializarComponentes();
		//el usuario no la puede redimensionar
		setResizable(false);
		setTitle("Calculadora");
		
		//esta instrucción tiene que ir la última para evitar que de problemas
		setVisible(true);
		
	}
	
	private void inicializarComponentes() {
		
		//Lo que hay que hacer es crearlas, ubicarlas y añadirlas a la ventana
		
		
		//creamos la etiqueta 
		etiqueta = new JLabel("Número 1");
		etiqueta.setBounds(250,50,100,40);
		
		
		//importante añadirla porque sino no aparecerá
		add(etiqueta);
		
		//creamos la caja de texto
		cajaTexto = new JTextField();
		cajaTexto.setBounds(350,50,100,40);
		cajaTexto.requestFocus();
		
		
		
		add(cajaTexto);
		
		
	 
		etiqueta2 = new JLabel("Número 2:");
		etiqueta2.setBounds(250,100,100,40);
		
				
		add(etiqueta2);
				
			
		cajaTexto2 = new JTextField();
		cajaTexto2.setBounds(350,100,100,40);
		
				
		add(cajaTexto2);
		
		etiqueta3 = new JLabel("Resultado : ");
		etiqueta3.setBounds(250,300,100,40);
		
		
		add(etiqueta3);
		
		
		
		
		
		
		
		
		
		boton1 = new JButton("1");
		//método al que se le pasan las coordenadas y el ancho y el alto
		boton1.setBounds(50, 50, 100, 40);
		boton1.setText("Sumar");
		
		boton2 = new JButton("2");
		boton2.setBounds(50, 100, 100, 40);
		boton2.setText("Restar");
		
		boton3 = new JButton("3");
		boton3.setBounds(50, 150, 100, 40);
		boton3.setText("Multiplicar");
		
		boton4 = new JButton("4");
		boton4.setBounds(50, 200, 100, 40);
		boton4.setText("Dividir");
		
		boton5 = new JButton("5");
		boton5.setBounds(50, 250, 100, 40);
		boton5.setText("Raiz 2");
		
		boton6 = new JButton("6");
		boton6.setBounds(50, 300, 100, 40);
		boton6.setText("Raiz 3");
		
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
		add(boton5);
		add(boton6);
		
		
		boton1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int suma = Integer.parseInt(cajaTexto.getText())+ Integer.parseInt(cajaTexto2.getText());
				etiqueta3.setText("Resultado : "+ suma);
				
			}
			
			
		});
		
		
		boton2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int resta = Integer.parseInt(cajaTexto.getText()) - Integer.parseInt(cajaTexto2.getText());
				etiqueta3.setText("Resultado : "+ resta);
				
			}
			
			
		});
		
		
		
		boton3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int multiplicacion = Integer.parseInt(cajaTexto.getText()) * Integer.parseInt(cajaTexto2.getText());
				etiqueta3.setText("Resultado : "+ multiplicacion);
				
			}
			
			
		});
		

		boton4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int division = Integer.parseInt(cajaTexto.getText()) / Integer.parseInt(cajaTexto2.getText());
				etiqueta3.setText("Resultado : "+ division);
				
			}
			
			
		});
		

		boton5.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(boton5, "Funcionalidad no disponible");
				
			}
			
			
		});
		

		boton6.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setTitle(boton6.getText());
				
			}
			
			
		});
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
