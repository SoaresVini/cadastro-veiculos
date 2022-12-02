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
	private String cpf;
	private JComboBox<MCliente> comboBox;
	private JTable table_1;

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

		comboBox = new JComboBox<>();
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

		CVeiculoControl cv = CVeiculoControl.getInstacia();
		listaVeiculo = new JList<MVeiculo>();
		listaVeiculo.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				Veiculo = listaVeiculo.getSelectedValue();
				if (Veiculo != null) {
					System.out.println(Veiculo);
				}
			}
		});

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 24, 314, 119);
		contentPane.add(scrollPane);

		CClienteControl cC = CClienteControl.getInstancia();
		ArrayList<MCliente> listaClientes = cC.listaCliente();

		if (listaClientes.size() > 0 && listaClientes != null) {
			for (MCliente cCliente : listaClientes) {
				comboBox.addItem((cCliente));
			}
		}
		comboBox.setBounds(352, 150, 125, 22);
		contentPane.add(comboBox);

		table = new JTable();
		DefaultTableModel modelo = new DefaultTableModel(new Object[][] {}, new String[] { "Nome", "CPF" });
		for (MCliente mCliente : listaClientes) {
			modelo.addRow(new Object[] { mCliente.getwNome(), mCliente.getwCpf() });
		}
		table.setModel(modelo);

		scrollPane.setViewportView(table);

		JButton btConsult = new JButton("Consultar");
		btConsult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atualizarJTable();
			}
		});

		btConsult.setBounds(352, 191, 180, 25);
		contentPane.add(btConsult);
		
		JLabel lblPessoaConsultada = new JLabel("Pessoa Consultada");
		lblPessoaConsultada.setBounds(10, 177, 180, 14);
		contentPane.add(lblPessoaConsultada);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 195, 332, 62);
		contentPane.add(scrollPane_1);
		
		////////////////////////////////////////////////////////////////
		
		table_1 = new JTable();
		DefaultTableModel modelo2 = new DefaultTableModel(new Object[][] {}, new String[] { "Nome" });
		MCliente Cliente = new MCliente();
		
			modelo2.addRow(new Object[] {comboBox.getSelectedItem() });
		
		table_1.setModel(modelo2);
		
		scrollPane_1.setViewportView(table_1);
		
	
	}

	protected void atualizarJTable() {
		DefaultTableModel modelo2 = new DefaultTableModel(new Object[][] {}, new String[] { "Nome"});

		MCliente Cliente = new MCliente();
		
		modelo2.addRow(new Object[] {comboBox.getSelectedItem() , Cliente.getwCpf() });
	
	    table_1.setModel(modelo2);
	

		}
	}

