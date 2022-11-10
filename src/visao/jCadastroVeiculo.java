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
		setBounds(100, 100, 398, 384);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lbTitulo = new JLabel("Cadastro de Veiculo");
		lbTitulo.setBounds(127, 0, 142, 15);
		contentPane.add(lbTitulo);
		
		JLabel lbNome = new JLabel("Dono do Veiculo:");
		lbNome.setBounds(60, 39, 133, 15);
		contentPane.add(lbNome);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setBounds(136, 84, 54, 15);
		contentPane.add(lblPlaca);
		
		JLabel lbTipoVeiculo = new JLabel("Tipo de Veiculo:");
		lbTipoVeiculo.setBounds(67, 116, 121, 15);
		contentPane.add(lbTipoVeiculo);
		
		JLabel lbCor = new JLabel("Cor:");
		lbCor.setBounds(150, 154, 34, 15);
		contentPane.add(lbCor);
		
		JLabel lbMarca = new JLabel("Marca:");
		lbMarca.setBounds(130, 181, 54, 15);
		contentPane.add(lbMarca);
		
		JComboBox<String> cbTipoVeiculo = new JComboBox();
		cbTipoVeiculo.setBounds(202, 113, 114, 23);
		cbTipoVeiculo.addItem("");
		cbTipoVeiculo.addItem("Carro");
		cbTipoVeiculo.addItem("Moto");
		cbTipoVeiculo.addItem("Caminhão");
		contentPane.add(cbTipoVeiculo);
		
		JComboBox cbDonoVeiculo = new JComboBox();
		cbDonoVeiculo.setBounds(202, 35, 114, 23);
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
		edCor.setBounds(202, 152, 114, 19);
		contentPane.add(edCor);
		
		edMarca = new JTextField();
		edMarca.setColumns(10);
		edMarca.setBounds(202, 183, 114, 19);
		contentPane.add(edMarca);
		
		JComboBox<String> cbCombustivel= new JComboBox();
		cbCombustivel.setBounds(202, 214, 114, 23);
		cbCombustivel.addItem("");
		cbCombustivel.addItem("Gasolina");
		cbCombustivel.addItem("Etanol");
		cbCombustivel.addItem("Elétrico");
		contentPane.add(cbCombustivel);
		
		JLabel lbCombustivel = new JLabel("Tipo de Combustivel:");
		lbCombustivel.setBounds(35, 214, 163, 15);
		contentPane.add(lbCombustivel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(202, 252, 114, 19);
		contentPane.add(textField);
		
		JLabel lbAnoFabricacao = new JLabel("Ano de Frabricação:");
		lbAnoFabricacao.setBounds(39, 254, 149, 15);
		contentPane.add(lbAnoFabricacao);
	}
}
