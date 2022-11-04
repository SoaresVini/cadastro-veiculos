package controle;

import java.util.ArrayList;

import modelo.Cliente;

public class ClienteControl {
	
	private ArrayList<Cliente> tabeClientes;
	
	public void ClienteContro() { this.tabeClientes = new ArrayList<>(); }
	
	//INSERT
	public Boolean inserir(Cliente c) {
		return false;
	}
	//UPDATE
	public Boolean alterar(Cliente c) {
		return false;
	}
	//DELETE
	public Boolean deletar(Cliente c, int idCliente) {
		return false;
	}
	//SELECT
	public ArrayList<Cliente> listaCliente(){
		return null;
	}
}
