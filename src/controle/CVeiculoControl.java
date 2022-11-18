package controle;

import java.util.ArrayList;

import modelo.MVeiculo;

public class CVeiculoControl {

	private ArrayList<MVeiculo> TabelVeiculos;
	
	public void VeiculoControl() { this.TabelVeiculos = new ArrayList<>(); }
	
	//INSERT
	public Boolean inserir(MVeiculo v) {
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
