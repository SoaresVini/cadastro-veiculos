package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class jMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jMenu frame = new jMenu();
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
	public jMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 199);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btCadastrarCliente = new JButton("Cadastrar Cliente");
		btCadastrarCliente.setBounds(97, 9, 180, 25);
		contentPane.add(btCadastrarCliente);
		
		JButton btConsulta = new JButton("Consulta");
		btConsulta.setBounds(97, 83, 180, 25);
		contentPane.add(btConsulta);
		
		JButton btCadastrarVeiculo = new JButton("Cadastrar Veiculo");
		btCadastrarVeiculo.setBounds(97, 46, 180, 25);
		contentPane.add(btCadastrarVeiculo);
		
		JButton btExit = new JButton("Exit");
		btExit.setBounds(97, 120, 180, 25);
		contentPane.add(btExit);
	}
}
