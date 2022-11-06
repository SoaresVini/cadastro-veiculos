package controle;

import java.util.ArrayList;

import modelo.mVeiculo;

public class cVeiculoControl {

	private ArrayList<mVeiculo> TabelVeiculos;
	
	public void VeiculoControl() { this.TabelVeiculos = new ArrayList<>(); }
	
	//INSERT
	public Boolean inserir(mVeiculo v) {
		return false;
	}
	//UPDATE
	public Boolean alterar(mVeiculo v) {
		return false;
	}
	//DELETE
	public Boolean deletar(mVeiculo v, int idVeiculo) {
		return false;
	}
	//SELECT
	public ArrayList<mVeiculo> listaCliente(){
		return null;
	}	
}
