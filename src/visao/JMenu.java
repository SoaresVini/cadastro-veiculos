package visao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controle.CClienteControl;
import modelo.MCliente;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;


public class JMenu extends JFrame {

	private JList<MCliente> listaCliente;
	private MCliente DonoVeiculo = null;
	private JPanel contentPane;
	private boolean visible = false;
	
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
				new JCadastroCliente().setVisible(true);
				
			}
		});
		btCadastrarCliente.setBounds(352, 35, 180, 25);
		contentPane.add(btCadastrarCliente);
		
		JButton btConsulta = new JButton("Consulta");
		btConsulta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new JConsulta().setVisible(true);
				
			}
		});
		btConsulta.setBounds(352, 107, 180, 25);
		contentPane.add(btConsulta);
		
		JButton btCadastrarVeiculo = new JButton("Cadastrar Veiculo");
		btCadastrarVeiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new JCadastroVeiculo().setVisible(true);
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
		btExit.setBounds(352, 143, 180, 25);
		contentPane.add(btExit);
		
		JLabel lbTitulo = new JLabel("Pessoas Cadastradas");
		lbTitulo.setBounds(10, 11, 139, 14);
		contentPane.add(lbTitulo);
		
		JLabel lbTitulo2 = new JLabel("Veiculos Cadastrados");
		lbTitulo2.setBounds(10, 154, 139, 14);
		contentPane.add(lbTitulo2);
		
		CClienteControl cc = CClienteControl.getInstancia(); 
		JList<MCliente> taPessoasCadastradas = new JList<>();
		taPessoasCadastradas.setListData(new Vector<MCliente>(CClienteControl.getInstancia().listaCliente()));
		taPessoasCadastradas.updateUI();
		
		listaCliente = new JList<MCliente>();
		listaCliente.addListSelectionListener(new ListSelectionListener() {			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				DonoVeiculo = listaCliente.getSelectedValue();
				if (DonoVeiculo != null) { System.out.println(DonoVeiculo); }
			}
		});
		taPessoasCadastradas.setBounds(10, 35, 324, 109);
		contentPane.add(taPessoasCadastradas);
		
		JList taVeiculosCadastrados_1 = new JList();
		taVeiculosCadastrados_1.setBounds(10, 179, 324, 109);
		contentPane.add(taVeiculosCadastrados_1);
		
	}
}
