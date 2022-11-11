package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jCadastroVeiculo extends JFrame {

	private JPanel contentPane;
	private JTextField edPlaca;
	private JTextField edCor;
	private JTextField edMarca;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jCadastroVeiculo frame = new jCadastroVeiculo();
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
	public jCadastroVeiculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 419, 384);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lbTitulo = new JLabel("Cadastro de Veiculo");
		lbTitulo.setBounds(127, 0, 142, 15);
		contentPane.add(lbTitulo);
		
		JLabel lbNome = new JLabel("Dono do Veiculo:");
		lbNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lbNome.setBounds(62, 43, 95, 15);
		contentPane.add(lbNome);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPlaca.setBounds(115, 86, 42, 15);
		contentPane.add(lblPlaca);
		
		JLabel lbTipoVeiculo = new JLabel("Tipo de Veiculo:");
		lbTipoVeiculo.setHorizontalAlignment(SwingConstants.RIGHT);
		lbTipoVeiculo.setBounds(62, 120, 95, 15);
		contentPane.add(lbTipoVeiculo);
		
		JLabel lbCor = new JLabel("Cor:");
		lbCor.setHorizontalAlignment(SwingConstants.RIGHT);
		lbCor.setBounds(118, 158, 39, 15);
		contentPane.add(lbCor);
		
		JLabel lbMarca = new JLabel("Marca:");
		lbMarca.setHorizontalAlignment(SwingConstants.RIGHT);
		lbMarca.setBounds(104, 185, 53, 15);
		contentPane.add(lbMarca);
		
		JComboBox<String> cbTipoVeiculo = new JComboBox();
		cbTipoVeiculo.setBounds(202, 114, 114, 23);
		cbTipoVeiculo.addItem("");
		cbTipoVeiculo.addItem("Carro");
		cbTipoVeiculo.addItem("Moto");
		cbTipoVeiculo.addItem("Caminhão");
		contentPane.add(cbTipoVeiculo);
		
		JComboBox cbDonoVeiculo = new JComboBox();
		cbDonoVeiculo.setBounds(202, 37, 114, 23);
		contentPane.add(cbDonoVeiculo);
		
		JCheckBox ckFabicacao = new JCheckBox("Fabricação Nacional");
		ckFabicacao.setFont(new Font("FreeSans", Font.BOLD, 10));
		ckFabicacao.setBounds(199, 280, 133, 23);
		contentPane.add(ckFabicacao);
		
		edPlaca = new JTextField();
		edPlaca.setColumns(10);
		edPlaca.setBounds(202, 82, 114, 19);
		contentPane.add(edPlaca);
		
		edCor = new JTextField();
		edCor.setColumns(10);
		edCor.setBounds(202, 154, 114, 19);
		contentPane.add(edCor);
		
		edMarca = new JTextField();
		edMarca.setColumns(10);
		edMarca.setBounds(202, 181, 114, 19);
		contentPane.add(edMarca);
		
		JComboBox<String> cbCombustivel= new JComboBox();
		cbCombustivel.setBounds(202, 212, 114, 23);
		cbCombustivel.addItem("");
		cbCombustivel.addItem("Gasolina");
		cbCombustivel.addItem("Etanol");
		cbCombustivel.addItem("Elétrico");
		contentPane.add(cbCombustivel);
		
		JLabel lbCombustivel = new JLabel("Tipo de Combustivel:");
		lbCombustivel.setHorizontalAlignment(SwingConstants.RIGHT);
		lbCombustivel.setBounds(41, 218, 116, 15);
		contentPane.add(lbCombustivel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(202, 254, 114, 19);
		contentPane.add(textField);
		
		JLabel lbAnoFabricacao = new JLabel("Ano de Frabricação:");
		lbAnoFabricacao.setHorizontalAlignment(SwingConstants.RIGHT);
		lbAnoFabricacao.setBounds(41, 258, 116, 15);
		contentPane.add(lbAnoFabricacao);
		
		JButton btFechar = new JButton("Fechar");
		btFechar.setBounds(304, 312, 89, 23);
		contentPane.add(btFechar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(163, 312, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btGravar = new JButton("Gravar");
		btGravar.setBounds(25, 312, 89, 23);
		contentPane.add(btGravar);
	}
}
