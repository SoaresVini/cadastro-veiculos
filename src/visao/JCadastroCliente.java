package visao;

import java.awt.EventQueue; 

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.CClienteControl;
import modelo.MCliente;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class JCadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField edNome;
	private JTextField edCnh;
	private JTextField edCpf;
	private JTextField edTelefone;
	private JTextField edGmail;
	private JTextField edData;
	JMenu menu = new JMenu();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCadastroCliente frame = new JCadastroCliente();
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
	public JCadastroCliente() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbTitulo = new JLabel("Cadastro Cliente");
		lbTitulo.setBounds(174, 0, 158, 14);
		lbTitulo.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(lbTitulo);

		JLabel lbCpf = new JLabel("CPF :  ");
		lbCpf.setHorizontalAlignment(SwingConstants.RIGHT);
		lbCpf.setBounds(55, 130, 46, 14);
		contentPane.add(lbCpf);

		JLabel lbNome = new JLabel("Nome : ");
		lbNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lbNome.setBounds(46, 52, 55, 14);
		contentPane.add(lbNome);

		JLabel lbCnh = new JLabel("CNH :  ");
		lbCnh.setHorizontalAlignment(SwingConstants.RIGHT);
		lbCnh.setBounds(55, 165, 46, 14);
		contentPane.add(lbCnh);

		JLabel lbTelefone = new JLabel("Telefone :  ");
		lbTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
		lbTelefone.setBounds(12, 201, 89, 14);
		contentPane.add(lbTelefone);

		JLabel lbGmail = new JLabel("Gmail :  ");
		lbGmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lbGmail.setBounds(22, 236, 79, 14);
		contentPane.add(lbGmail);

		JLabel lbData = new JLabel("Data :  ");
		lbData.setHorizontalAlignment(SwingConstants.RIGHT);
		lbData.setBounds(12, 89, 89, 14);
		contentPane.add(lbData);

		JLabel lbImg = new JLabel("New label");
		lbImg.setIcon(new ImageIcon(JCadastroCliente.class.getResource("/visao/149071_resized.png")));
		lbImg.setBounds(393, 24, 102, 105);
		contentPane.add(lbImg);

		JLabel lbSexo = new JLabel("Sexo :   ");
		lbSexo.setBounds(50, 277, 62, 18);
		contentPane.add(lbSexo);

		edNome = new JTextField();
		edNome.setBounds(126, 49, 222, 20);
		contentPane.add(edNome);
		edNome.setColumns(10);

		edCnh = new JTextField();
		edCnh.setColumns(10);
		edCnh.setBounds(126, 162, 220, 20);
		contentPane.add(edCnh);

		edCpf = new JTextField();
		edCpf.setColumns(10);
		edCpf.setBounds(126, 127, 222, 20);
		contentPane.add(edCpf);

		edTelefone = new JTextField();
		edTelefone.setColumns(10);
		edTelefone.setBounds(126, 198, 148, 20);
		contentPane.add(edTelefone);

		edGmail = new JTextField();
		edGmail.setColumns(10);
		edGmail.setBounds(126, 233, 222, 20);
		contentPane.add(edGmail);

		edData = new JTextField();
		edData.setColumns(10);
		edData.setBounds(126, 86, 148, 20);
		contentPane.add(edData);

		JComboBox<String> cbSexo = new JComboBox();
		cbSexo.setBounds(126, 277, 148, 22);
		cbSexo.addItem("");
		cbSexo.addItem("Masculino");
		cbSexo.addItem("Feminino");
		contentPane.add(cbSexo);

		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();

			}
		});
		btnFechar.setBounds(393, 227, 102, 23);
		contentPane.add(btnFechar);

		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String nome = edNome.getText();
				String cpf = edCpf.getText();
				String cnh = edCnh.getText();
				String Sexo = cbSexo.getSelectedItem().toString();
				String gmail = edGmail.getText();
				String telefone = edTelefone.getText();
				//String data = edData.getText();

				//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				//LocalDate date = LocalDate.parse(data, formatter);
				
				MCliente Mc = new MCliente();
				
				if ( nome == null || nome.isEmpty()) {
					JOptionPane.showMessageDialog(null, "cafe");
				}else {
					Mc.setWNome(nome);
				}
				
				Mc.setwCarteiraMotorista(cnh);
				Mc.setwCpf(cpf);
				Mc.setwGmail(gmail);
				Mc.setwNumeroTelefone(telefone);
				Mc.setwSexo(Sexo);
				//Mc.setwDataNascimento(date);
				
				CClienteControl TableCliente = CClienteControl.getIntancia();
				Boolean insert = TableCliente.inserir(Mc);
				
				dispose();   

			}
		});
		btnGravar.setBounds(393, 159, 102, 23);
		contentPane.add(btnGravar);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				cbSexo.setSelectedItem("");
				edCpf.setText("");
				edNome.setText("");
				edCnh.setText("");
				edData.setText("");
				edGmail.setText("");
				edTelefone.setText("");

			}
		});
		btnLimpar.setBounds(393, 194, 102, 23);
		contentPane.add(btnLimpar);

	}
}
