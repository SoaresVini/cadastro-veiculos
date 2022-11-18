package visao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JConsulta extends JFrame {

	private JPanel contentPane;
	private JTextField edNome;
	private JTextField edCpf;
	private JTextField edCnh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JConsulta frame = new JConsulta();
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
	public JConsulta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 247);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbTitulo = new JLabel("Consulta Cliente");
		lbTitulo.setBounds(154, 0, 134, 15);
		contentPane.add(lbTitulo);

		edNome = new JTextField();
		edNome.setEditable(false);
		edNome.setColumns(10);
		edNome.setBounds(100, 79, 207, 19);
		contentPane.add(edNome);

		JLabel lblNewLabel = new JLabel("CPF:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(12, 41, 70, 15);
		contentPane.add(lblNewLabel);

		edCpf = new JTextField();
		edCpf.setColumns(10);
		edCpf.setBounds(100, 39, 167, 19);
		contentPane.add(edCpf);

		JLabel lblNewLabel_1_1 = new JLabel("Veiculos:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(12, 136, 70, 15);
		contentPane.add(lblNewLabel_1_1);

		JComboBox cbVeiculos = new JComboBox();
		cbVeiculos.setBounds(100, 136, 114, 24);
		contentPane.add(cbVeiculos);

		edCnh = new JTextField();
		edCnh.setEditable(false);
		edCnh.setColumns(10);
		edCnh.setBounds(100, 102, 167, 19);
		contentPane.add(edCnh);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(21, 81, 61, 15);
		contentPane.add(lblNome);

		JLabel lblCnh = new JLabel("CNH:");
		lblCnh.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCnh.setBounds(12, 104, 70, 15);
		contentPane.add(lblCnh);

		JButton btEditar = new JButton("Editar");
		btEditar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		btEditar.setBounds(319, 78, 102, 23);
		contentPane.add(btEditar);

		JButton btLimpar = new JButton("Limpar");
		btLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				edCpf.setText("");

			}
		});
		btLimpar.setBounds(319, 54, 102, 23);
		contentPane.add(btLimpar);

		JButton btFechar = new JButton("Fechar");
		btFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();

			}
		});
		btFechar.setBounds(319, 137, 102, 23);
		contentPane.add(btFechar);

		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.setBounds(319, 102, 102, 23);
		contentPane.add(btnDeletar);

	}
}
