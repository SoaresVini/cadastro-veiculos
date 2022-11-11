package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class jCadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	jMenu menu = new jMenu();
	private boolean visible = false;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jCadastroCliente frame = new jCadastroCliente();
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
	public jCadastroCliente() {
		
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro Cliente");
		lblNewLabel.setBounds(116, 11, 109, 14);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF :  ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(55, 130, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome : ");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(46, 52, 55, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("CNH :  ");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setBounds(55, 165, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Telefone :  ");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1.setBounds(36, 201, 65, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Gmail :  ");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_1.setBounds(46, 236, 55, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		textField = new JTextField();
		textField.setBounds(126, 49, 222, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(126, 162, 220, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(126, 127, 222, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(126, 198, 148, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(126, 233, 222, 20);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_2 = new JLabel("Sexo :   ");
		lblNewLabel_2.setBounds(66, 281, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(126, 86, 86, 20);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_1_3 = new JLabel("Data :  ");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3.setBounds(55, 89, 46, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JComboBox<String>cbSexo = new JComboBox();
		cbSexo.setBounds(126, 277, 86, 22);
		cbSexo.addItem("");
		cbSexo.addItem("masculino");
		cbSexo.addItem("Feminino");
		contentPane.add(cbSexo);
		
		JButton btFechar = new JButton("Fechar");
		btFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		btFechar.setBounds(406, 232, 89, 23);
		contentPane.add(btFechar);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(jCadastroCliente.class.getResource("/visao/149071_resized.png")));
		lblNewLabel_3.setBounds(393, 24, 102, 105);
		contentPane.add(lblNewLabel_3);
		
		JButton btGravar = new JButton("Gravar");
		btGravar.setBounds(406, 174, 89, 23);
		contentPane.add(btGravar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(406, 197, 89, 23);
		contentPane.add(btnCancelar);
	}
}
