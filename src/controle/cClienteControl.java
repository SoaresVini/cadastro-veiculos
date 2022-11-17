package controle;

import java.util.ArrayList;

import modelo.mCliente;

public class cClienteControl {
	
	private ArrayList<mCliente> TableClientes;
	
	public void ClienteControl() { this.TableClientes = new ArrayList<>(); }
	
	private static cClienteControl c = null;
	
	public static cClienteControl getIntancia() {
		if (c == null) {
			c = new cClienteControl ();
		}
		return c;
	}
	private cClienteControl() {
		// TODO Auto-generated constructor stub
	}

	//INSERT
	public Boolean inserir(mCliente c) {
		this.TableClientes.add(c);
		return false;
	}
	//UPDATE
	public Boolean alterar(mCliente c) {
		return false;
	}
	//DELETE
	public Boolean deletar(mCliente c, int idCliente) {
		return false;
	}
	//SELECT
	public ArrayList<mCliente> listaCliente(){
		return null;
	}
}
