package visao;

import java.awt.EventQueue;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import controle.CClienteControl;
import modelo.MCliente;

import controle.CVeiculoControl;
import modelo.MVeiculo;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;


public class JMenu extends JFrame {

	private ArrayList<MCliente> taMClientes;
	private MCliente DonoVeiculo = null;
	
	private JList<MVeiculo> listaVeiculo;
	private MVeiculo Veiculo = null;
	
	private JPanel contentPane;
	private boolean visible = false;
	private JTable table;
	private String nomeSelec;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JMenu frame = new JMenu();
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
	public JMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btCadastrarCliente = new JButton("Cadastrar Cliente");
		btCadastrarCliente.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				JCadastroCliente jcc = new JCadastroCliente();
				jcc.setLocationRelativeTo(null);
				jcc.setVisible(true);
				dispose();
			}
		});
		btCadastrarCliente.setBounds(352, 35, 180, 25);
		contentPane.add(btCadastrarCliente);
		
		JButton btCadastrarVeiculo = new JButton("Cadastrar Veiculo");
		btCadastrarVeiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCadastroVeiculo jcv = new JCadastroVeiculo();
				jcv.setLocationRelativeTo(null);
				jcv.setVisible(true);
				dispose();
			}
		});
		btCadastrarVeiculo.setBounds(352, 71, 180, 25);
		contentPane.add(btCadastrarVeiculo);
		
		JButton btExit = new JButton("Exit");
		btExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btExit.setBounds(352, 108, 180, 25);
		contentPane.add(btExit);
		
		JLabel lbTitulo = new JLabel("Pessoas Cadastradas");
		lbTitulo.setBounds(10, 11, 180, 14);
		contentPane.add(lbTitulo);
		
		JLabel lbTitulo2 = new JLabel("Veiculos Cadastrados");
		lbTitulo2.setBounds(10, 154, 167, 14);
		contentPane.add(lbTitulo2);
		
		CVeiculoControl cv = CVeiculoControl.getInstacia();
		JList<MVeiculo> taVeiculosCadastrados = new JList<>();
		
		taVeiculosCadastrados.setListData(new Vector<MVeiculo>(CVeiculoControl.getInstacia().listaVeiculos()));
		taVeiculosCadastrados.updateUI();
		listaVeiculo = new JList<MVeiculo>();
		listaVeiculo.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				Veiculo = listaVeiculo.getSelectedValue();
				if (Veiculo != null) {System.out.println(Veiculo);}}
		});
		
		taVeiculosCadastrados.setBounds(10, 179, 324, 109);
		contentPane.add(taVeiculosCadastrados);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 24, 314, 119);
		contentPane.add(scrollPane);
		
		CClienteControl cC = CClienteControl.getInstancia();
		ArrayList<MCliente> listaClientes = cC.listaCliente();
		
		JComboBox comboBox = new JComboBox();
		if ( listaClientes.size() > 0 &&listaClientes != null) {
			for (MCliente cCliente : listaClientes) {
				comboBox.addItem((cCliente.getwNome()));
			}
		}
		comboBox.setBounds(362, 144, 67, 22);
		contentPane.add(comboBox);
		
		MCliente Cliente = new MCliente();
		table = new JTable();
		DefaultTableModel modelo = new DefaultTableModel(new Object[][] {}, new String[] { "Nome", "CPF", "CNH"});
		table.setModel(modelo);
		
	
				 (comboBox.getSelectedItem());
				Cliente.setwNome(); 
				modelo.addRow(new Object[] { Cliente.getwNome(), Cliente.getwCpf(),Cliente.getwCarteiraMotorista() });
			
		
		scrollPane.setViewportView(table);
		scrollPane.setViewportView(table);
		

		
	}
}
