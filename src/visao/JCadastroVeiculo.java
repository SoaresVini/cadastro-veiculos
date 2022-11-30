package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

import controle.CVeiculoControl;
import modelo.MVeiculo;
import visao.JCadastroCliente;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatter;

public class JCadastroVeiculo extends JFrame {

	private JPanel contentPane;
	private JTextField edPlaca;
	private JTextField edCor;
	private JTextField edMarca;
	private JTextField cbDonoVeiculo;
	private JTextField edFabricacao;


	public JCadastroVeiculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 339);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lbTitulo = new JLabel("Cadastro de Veiculo");
		lbTitulo.setBounds(202, 0, 142, 15);
		contentPane.add(lbTitulo);
		
		JLabel lbNome = new JLabel("Dono do Veiculo:");
		lbNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lbNome.setBounds(25, 43, 132, 15);
		contentPane.add(lbNome);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPlaca.setBounds(77, 76, 80, 15);
		contentPane.add(lblPlaca);
		
		JLabel lbTipoVeiculo = new JLabel("Tipo de Veiculo:");
		lbTipoVeiculo.setHorizontalAlignment(SwingConstants.RIGHT);
		lbTipoVeiculo.setBounds(25, 109, 132, 15);
		contentPane.add(lbTipoVeiculo);
		
		JLabel lbCor = new JLabel("Cor:");
		lbCor.setHorizontalAlignment(SwingConstants.RIGHT);
		lbCor.setBounds(118, 140, 39, 15);
		contentPane.add(lbCor);
		
		JLabel lbMarca = new JLabel("Marca:");
		lbMarca.setHorizontalAlignment(SwingConstants.RIGHT);
		lbMarca.setBounds(104, 171, 53, 15);
		contentPane.add(lbMarca);
		
		JComboBox<String> cbTipoVeiculo = new JComboBox();
		cbTipoVeiculo.setBounds(202, 103, 114, 23);
		cbTipoVeiculo.addItem("");
		cbTipoVeiculo.addItem("Carro");
		cbTipoVeiculo.addItem("Moto");
		cbTipoVeiculo.addItem("Caminhão");
		contentPane.add(cbTipoVeiculo);
		
		JCheckBox ckFabicacao = new JCheckBox("Fabricação Nacional");
		ckFabicacao.setFont(new Font("FreeSans", Font.BOLD, 10));
		ckFabicacao.setBounds(198, 259, 133, 23);
		contentPane.add(ckFabicacao);
		
		edPlaca = new JTextField();
		edPlaca.setColumns(10);
		edPlaca.setBounds(202, 72, 114, 19);
		contentPane.add(edPlaca);
		
		edCor = new JTextField();
		edCor.setColumns(10);
		edCor.setBounds(202, 136, 114, 19);
		contentPane.add(edCor);
		
		edMarca = new JTextField();
		edMarca.setColumns(10);
		edMarca.setBounds(202, 167, 114, 19);
		contentPane.add(edMarca);
		
		edFabricacao = new JTextField();
		edFabricacao.setColumns(10);
		try {
			edFabricacao = new JFormattedTextField(new MaskFormatter("##/##/####"));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		edFabricacao.setBounds(202, 231, 114, 19);
		contentPane.add(edFabricacao);
		edFabricacao.setColumns(10);
		
		JComboBox<String> cbCombustivel= new JComboBox();
		cbCombustivel.setBounds(202, 198, 114, 23);
		cbCombustivel.addItem("");
		cbCombustivel.addItem("Gasolina");
		cbCombustivel.addItem("Etanol");
		cbCombustivel.addItem("Elétrico");
		contentPane.add(cbCombustivel);
		
		
		JLabel lbCombustivel = new JLabel("Tipo de Combustivel:");
		lbCombustivel.setHorizontalAlignment(SwingConstants.RIGHT);
		lbCombustivel.setBounds(0, 204, 157, 15);
		contentPane.add(lbCombustivel);
		
		JLabel lbAnoFabricacao = new JLabel("Ano de Frabricação:");
		lbAnoFabricacao.setHorizontalAlignment(SwingConstants.RIGHT);
		lbAnoFabricacao.setBounds(12, 237, 145, 15);
		contentPane.add(lbAnoFabricacao);
		
		JButton btFechar = new JButton("Fechar");
		btFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});

		JButton btGravar = new JButton("Gravar");
		btGravar.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
				String wPlaca 		= edPlaca.		getText();
				String wCor 		= edCor.		getText();
				String wMarca 		= edMarca.		getText();
				String wNome		= cbDonoVeiculo.getText();
				String wCombustivel = cbCombustivel.getSelectedItem().toString();
				String wTipoVeiculo = cbTipoVeiculo.getSelectedItem().toString();	
				LocalDate wAnoModelo= LocalDate.parse(edFabricacao.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				//String wNacional    = ckFabicacao.
				
				Integer contValidacao = 0;
				
				MVeiculo Mv = new MVeiculo();
				
				// Dados da Placa 
				if (wPlaca == null || wPlaca.isEmpty()) {
					JOptionPane.showInternalMessageDialog(null, "Preencha o número da placa");
				} else {
					Mv.setwPlaca(wPlaca);
					contValidacao ++;
				}
				
				// Dados da wCor 
				if (wCor == null || wCor.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha a cores");
				} else {
					Mv.setwCor(wCor);
					contValidacao ++;
				}
				
				// Dados da wMarca 
				if (wMarca == null || wMarca.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha a Marca");
				} else {
					Mv.setwMarca(wMarca);
					contValidacao ++;
				}
				
				// Dados da wNome
				if (wNome == null || wNome.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha o Nome");
				} else {
					Mv.setwMarca(wMarca);
					contValidacao ++;
				}
				
				// Dados da wCombustivel
				if (wCombustivel == null || wCombustivel.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha o Combustivel");
				} else {
					Mv.setwCombustivel(wCombustivel);
					contValidacao ++;
				}				
				
				// Dados do wTipoVeiculo
				if (wTipoVeiculo == null || wTipoVeiculo.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha o Tipo do veiculo");
				} else {
					Mv.setwTipoVeiculo(wTipoVeiculo);
					contValidacao ++;
				}					
				
				// Dados do AnoModelo
				if (wAnoModelo == null) {
					JOptionPane.showMessageDialog(null, "Preencha o Ano do veiculo");
				} else {
					Mv.setwAnoModelo(wAnoModelo);
					contValidacao ++;
				}
				
				CVeiculoControl TableVeiculo = CVeiculoControl.getInstacia();
				Boolean insert = TableVeiculo.inserir(Mv);
				
				if (contValidacao == 7) {
					contValidacao = 0;
					JOptionPane.showMessageDialog(null, "Dados confirmados");
					dispose();
				}
			}
		});
		
		btGravar.setBounds(369, 167, 102, 23);
		contentPane.add(btGravar);
		
		btFechar.setBounds(369, 229, 102, 23);
		contentPane.add(btFechar);
		
		JButton btLimpar = new JButton("Limpar");
		btLimpar.setBounds(369, 198, 102, 23);
		btLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				cbCombustivel.setSelectedItem("");
				cbDonoVeiculo.setText("");
				cbTipoVeiculo.setSelectedItem("");
				edCor.		  setText("");
				edFabricacao. setText("");
				edMarca.      setText("");
				edPlaca.      setText("");	
			}
		});
		contentPane.add(btLimpar);
		
		
		/*
		 * Imagem Temporaria só para vizualização do layout
		*/
		
		JLabel lbImg = new JLabel("New label");
		lbImg.setIcon(new ImageIcon(JCadastroVeiculo.class.getResource("/visao/2277327-200_resized.png")));
		lbImg.setBounds(369, 26, 102, 83);
		contentPane.add(lbImg);
		
		cbDonoVeiculo = new JTextField();
		cbDonoVeiculo.setBounds(202, 41, 114, 19);
		contentPane.add(cbDonoVeiculo);
		cbDonoVeiculo.setColumns(10);

	}
}
