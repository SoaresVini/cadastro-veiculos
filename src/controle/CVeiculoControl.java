package controle;

import java.util.ArrayList;

import modelo.MVeiculo;

public class CVeiculoControl {

	private static ArrayList<MVeiculo> TableVeiculos;
	
	private static CVeiculoControl instancia;
	
	public static CVeiculoControl getInstacia() {
		if (instancia == null) {
			instancia = new CVeiculoControl();
			TableVeiculos = new ArrayList<>();
		}
		return instancia;
	}
	//INSERT
	public Boolean inserir(MVeiculo v) {
		if (v != null) {
			this.TableVeiculos.add(v);
			return true;
		}
		return false;
	}
	//UPDATE
	public Boolean alterar(MVeiculo v) {
		return false;
	}
	//DELETE
	public Boolean deletar(MVeiculo v, int idVeiculo) {
		return false;
	}
	//SELECT
	public ArrayList<MVeiculo> listaCliente(){
		return null;
	}	
}
