package controle;

import java.util.ArrayList;

import modelo.mCliente;

public class cClienteControl {
	
	private ArrayList<mCliente> TableClientes;
	
	public void ClienteControl() { this.TableClientes = new ArrayList<>(); }
	
	//INSERT
	public Boolean inserir(mCliente c) {
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
