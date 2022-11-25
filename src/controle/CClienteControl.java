package controle;

import java.util.ArrayList; 

import modelo.MCliente;

public class CClienteControl {
	
	private static ArrayList<MCliente> TableClientes;
	
	
	private static CClienteControl instancia;
	
	public static CClienteControl getInstancia() {
		if (instancia == null) {
			instancia = new CClienteControl ();
			TableClientes = new ArrayList<>();
		}
		return instancia;
	} 

	//INSERT
	public Boolean inserir(MCliente Mc) {
		if (Mc != null) {
		this.TableClientes.add(Mc);
		return true;
		}
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
