package controle;

import java.util.ArrayList;

import modelo.MCliente;

public class CClienteControl {
	
	private ArrayList<MCliente> TableClientes;
	
	public void ClienteControl() { this.TableClientes = new ArrayList<>(); }
	
	private static CClienteControl c = null;
	
	public static CClienteControl getIntancia() {
		if (c == null) {
			c = new CClienteControl ();
		}
		return c;
	}
	private CClienteControl() {
		// TODO Auto-generated constructor stub
	}

	//INSERT
	public Boolean inserir(MCliente c) {
		this.TableClientes.add(c);
		return false;
	}
	//UPDATE
	public Boolean alterar(MCliente c) {
		return false;
	}
	//DELETE
	public Boolean deletar(MCliente c, int idCliente) {
		return false;
	}
	//SELECT
	public ArrayList<MCliente> listaCliente(){
		return null;
	}
}
