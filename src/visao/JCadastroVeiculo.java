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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

import controle.CClienteControl;
import controle.CVeiculoControl;
import modelo.MCliente;
import modelo.MVeiculo;
import visao.JCadastroCliente;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatter;

public class JCadastroVeiculo extends JFrame {

	private JPanel contentPane;
	private JTextField edPlaca;
	private JTextField edCor;
	private JTextField edMarca;
	private JTextField edFabricacao;
	private JTextField edID;
	private Boolean wEncontrou;
	public CVeiculoControl cv = new CVeiculoControl();
	public ArrayList<MVeiculo> Veiculos = cv.listaVeiculos();
	public MVeiculo mv = new MVeiculo();

	public JCadastroVeiculo() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 339);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		// Labels
		JLabel lbTitulo = new JLabel("Cadastro de Veiculo");
		lbTitulo.setBounds(182, 0, 142, 15);
		contentPane.add(lbTitulo);
		
		JLabel lbNome = new JLabel("Dono do Veiculo:");
		lbNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lbNome.setBounds(25, 69, 132, 15);
		contentPane.add(lbNome);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPlaca.setBounds(77, 96, 80, 15);
		contentPane.add(lblPlaca);
		
		JLabel lbTipoVeiculo = new JLabel("Tipo de Veiculo:");
		lbTipoVeiculo.setHorizontalAlignment(SwingConstants.RIGHT);
		lbTipoVeiculo.setBounds(25, 123, 132, 15);
		contentPane.add(lbTipoVeiculo);
		
		JLabel lbCor = new JLabel("Cor:");
		lbCor.setHorizontalAlignment(SwingConstants.RIGHT);
		lbCor.setBounds(118, 150, 39, 15);
		contentPane.add(lbCor);
		
		JLabel lbID = new JLabel("ID do Veiculo:");
		lbID.setHorizontalAlignment(SwingConstants.RIGHT);
		lbID.setBounds(25, 26, 132, 15);
		contentPane.add(lbID);
		
		JLabel lbMarca = new JLabel("Marca:");
		lbMarca.setHorizontalAlignment(SwingConstants.RIGHT);
		lbMarca.setBounds(104, 177, 53, 15);
		contentPane.add(lbMarca);
		
		JLabel lbCombustivel = new JLabel("Tipo de Combustivel:");
		lbCombustivel.setHorizontalAlignment(SwingConstants.RIGHT);
		lbCombustivel.setBounds(0, 210, 157, 15);
		contentPane.add(lbCombustivel);
		
		JLabel lbAnoFabricacao = new JLabel("Ano de Frabricação:");
		lbAnoFabricacao.setHorizontalAlignment(SwingConstants.RIGHT);
		lbAnoFabricacao.setBounds(12, 243, 145, 15);
		contentPane.add(lbAnoFabricacao);
		
		JLabel lbImg = new JLabel("New label");
		lbImg.setIcon(new ImageIcon(JCadastroVeiculo.class.getResource("/visao/2277327-200_resized.png")));
		lbImg.setBounds(378, 5, 102, 83);
		contentPane.add(lbImg);
		
		// ComboBox e CheckBox
		JComboBox<String> cbTipoVeiculo = new JComboBox();
		cbTipoVeiculo.setBounds(202, 119, 114, 23);
		cbTipoVeiculo.addItem("");
		cbTipoVeiculo.addItem("Carro");
		cbTipoVeiculo.addItem("Moto");
		cbTipoVeiculo.addItem("Caminhão");
		contentPane.add(cbTipoVeiculo);
		
		JComboBox<String> cbCombustivel= new JComboBox();
		cbCombustivel.setBounds(202, 206, 114, 23);
		cbCombustivel.addItem("");
		cbCombustivel.addItem("Gasolina");
		cbCombustivel.addItem("Etanol");
		cbCombustivel.addItem("Elétrico");
		contentPane.add(cbCombustivel);
		
		CClienteControl cC = CClienteControl.getInstancia();
		ArrayList<MCliente> listaClientes = cC.listaCliente();
		
		JComboBox cbDonoVeiculo = new JComboBox();
		cbDonoVeiculo.addItem(("Ana f - Mulher do Caua"));
		if (listaClientes.size() > 0 && listaClientes != null) {
			for (MCliente cCliente : listaClientes) {
				cbDonoVeiculo.addItem((cCliente));
		}
		}
		cbDonoVeiculo.setBounds(202, 65, 114, 23);
		contentPane.add(cbDonoVeiculo);
		
		JCheckBox ckFabicacao = new JCheckBox("Fabricação Nacional");
		ckFabicacao.setFont(new Font("FreeSans", Font.BOLD, 10));
		ckFabicacao.setBounds(202, 268, 133, 23);
		contentPane.add(ckFabicacao);
	
		// TextFiel
		
		edPlaca = new JTextField();
		edPlaca.setColumns(10);
		edPlaca.setBounds(202, 94, 114, 19);
		contentPane.add(edPlaca);
		
		edCor = new JTextField();
		edCor.setColumns(10);
		edCor.setBounds(202, 148, 114, 19);
		contentPane.add(edCor);
		
		edMarca = new JTextField();
		edMarca.setColumns(10);
		edMarca.setBounds(202, 175, 114, 19);
		contentPane.add(edMarca);
		
		edID = new JTextField();
		edID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
			private void jTextField1FocusLost(FocusEvent evt) {
				JOptionPane.showMessageDialog(null, "saiu");
				for (MVeiculo v : Veiculos) {
					if(edID.getText().equals(v.getwIDVeiculo())){
						edPlaca		 .setText		 (mv.getwPlaca());
		        		edCor		 .setText		 (mv.getwCor());
		        		edMarca		 .setText		 (mv.getwMarca());
						cbDonoVeiculo.setSelectedItem(mv.getwDonoVeiculo());
		        		cbTipoVeiculo.setSelectedItem(mv.getwTipoVeiculo());
					}
				}
			}
		});
		edID.setColumns(10);
		edID.setBounds(202, 27, 114, 19);
		contentPane.add(edID);
		
		edFabricacao = new JTextField();
		edFabricacao.setColumns(10);
		try {
			edFabricacao = new JFormattedTextField(new MaskFormatter("##/##/####"));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		edFabricacao.setBounds(202, 241, 114, 19);
		contentPane.add(edFabricacao);
		edFabricacao.setColumns(10);
		
		// Botões 
		JButton btGravar = new JButton("Gravar");
		btGravar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				CVeiculoControl cv = new CVeiculoControl();
				ArrayList<MVeiculo> Veiculos = cv.listaVeiculos();
				MVeiculo mv = new MVeiculo();
				
//				for (MVeiculo mVeiculo : Veiculos) {
//	        		if(edID.getText().equals(mVeiculo.getwIDVeiculo()) || wEncontrou == true){
//	        			JOptionPane.showMessageDialog(null, "Cliente já está cadastro, você pode deletar ou alterar os Dados dele");
//	        			wEncontrou = true;  
//	        		}
//	        	}
//				if (wEncontrou == true) {
//			        Integer prId = Integer.valueOf(edID.getText());
//			        cv.alterar(mv, prId);
//			        //wEncontrou = false;
//				} else { 

				Integer wID			= Integer.valueOf(edID.getText());	
				String wPlaca 		= edPlaca.		getText();
				String wCor 		= edCor.		getText();
				String wMarca 		= edMarca.		getText();
				String wCombustivel = cbCombustivel.getSelectedItem().toString();
				String wTipoVeiculo = cbTipoVeiculo.getSelectedItem().toString();	
				String wDonoVeiculo = cbDonoVeiculo.getSelectedItem().toString();
				LocalDate wAnoModelo= LocalDate.parse(edFabricacao.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				
				//String wNacional    = ckFabicacao.
				
				Integer contValidacao = 0;
				
				// Dados do ID
				if (wID == null) {
					JOptionPane.showInternalMessageDialog(null, "Cadastre um ID");
				} else {
					mv.setwIDVeiculo(wID);
					contValidacao ++;
				}
				
				// Dados do Dono do veiculo
				if (wDonoVeiculo == null || wDonoVeiculo.isEmpty()) {
					JOptionPane.showInternalMessageDialog(null, "Preencha o número da placa");
				} else {
					mv.setwDonoVeiculo(wDonoVeiculo);
					contValidacao ++;
				}
				
				// Dados da Placa 
				if (wPlaca == null || wPlaca.isEmpty()) {
					JOptionPane.showInternalMessageDialog(null, "Preencha o número da placa");
				} else {
					mv.setwPlaca(wPlaca);
					contValidacao ++;
				}
				
				// Dados da Cor 
				if (wCor == null || wCor.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha a cores");
				} else {
					mv.setwCor(wCor);
					contValidacao ++;
				}
				
				// Dados da Marca 
				if (wMarca == null || wMarca.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha a Marca");
				} else {
					mv.setwMarca(wMarca);
					contValidacao ++;
				}
				
				// Dados da Combustivel
				if (wCombustivel == null || wCombustivel.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha o Combustivel");
				} else {
					mv.setwCombustivel(wCombustivel);
					contValidacao ++;
				}				
				
				// Dados do TipoVeiculo
				if (wTipoVeiculo == null || wTipoVeiculo.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha o Tipo do veiculo");
				} else {
					mv.setwTipoVeiculo(wTipoVeiculo);
					contValidacao ++;
				}					
				
				// Dados do AnoModelo
				if (wAnoModelo == null) {
					JOptionPane.showMessageDialog(null, "Preencha o Ano do veiculo");
				} else {
					mv.setwAnoModelo(wAnoModelo);
					contValidacao ++;
				}
				
				CVeiculoControl TableVeiculo = CVeiculoControl.getInstacia();
				Boolean insert = TableVeiculo.inserir(mv);
				
				// laço confirmação dos Dados
				if (contValidacao == 8) {
					JOptionPane.showMessageDialog(null, "Dados confirmados");
					contValidacao = 0;
					JMenu m = new JMenu();
					m.setLocationRelativeTo(null);
					m.setVisible(true);
					dispose();
				}
			}
//			}
		});
		btGravar.setBounds(378, 121, 102, 23);
		contentPane.add(btGravar);
		
		
		JButton btLimpar = new JButton("Limpar");
		btLimpar.setBounds(378, 181, 102, 23);
		btLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				edID		 .setText("");
				cbCombustivel.setSelectedItem("");
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
		
		JButton btvoltar = new JButton("<");
		btvoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JMenu m = new JMenu();
				m.setLocationRelativeTo(null);
				m.setVisible(true);
				dispose();
			}
		});		
		btvoltar.setBounds(12, -5, 44, 25);
		contentPane.add(btvoltar);
		
		JButton btFechar = new JButton("Fechar");
		btFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		btFechar.setBounds(378, 212, 102, 23);
		contentPane.add(btFechar);
		
		JLabel lbStatus = new JLabel("<Aguardadando>");
		lbStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lbStatus.setBounds(378, 243, 102, 15);
		contentPane.add(lbStatus);
		
		JButton btExcluir = new JButton("Excuir");
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (MVeiculo v : Veiculos) {
					if (edID.getText().equals(v)) {
						Integer wID = Integer.valueOf(edID.getText());
						cv.deletar(v, wID);
					}
				}
			}
		});
		btExcluir.setBounds(378, 152, 102, 23);
		contentPane.add(btExcluir);

	}
}
