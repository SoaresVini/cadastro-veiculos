package modelo;

import java.time.LocalDate;

public class mVeiculo {
	
	String	
			wPlaca,
			wTipoVeiculo,
			wCor,
			wMarca,
			wCombustivel;
	
	LocalDate
			wAnoModelo;
	
	Boolean
			wNacional;

	public Boolean getwNacional() {
		return wNacional;
	}

	public void setwNacional(Boolean wNacional) {
		this.wNacional = wNacional;
	}

	public String getwPlaca() {
		return wPlaca;
	}

	public void setwPlaca(String wPlaca) {
		this.wPlaca = wPlaca;
	}
	
	public String getwTipoVeiculo() {
		return wTipoVeiculo;
	}

	public void setwTipoVeiculo(String wTipoVeiculo) {
		this.wTipoVeiculo = wTipoVeiculo;
	}

	public String getwCor() {
		return wCor;
	}

	public void setwCor(String wCor) {
		this.wCor = wCor;
	}

	public String getwMarca() {
		return wMarca;
	}

	public void setwMarca(String wMarca) {
		this.wMarca = wMarca;
	}

	public String getwCombustivel() {
		return wCombustivel;
	}

	public void setwCombustivel(String wCombustivel) {
		this.wCombustivel = wCombustivel;
	}

	public LocalDate getwAnoModelo() {
		return wAnoModelo;
	}

	public void setwAnoModelo(LocalDate wAnoModelo) {
		this.wAnoModelo = wAnoModelo;
	}
			
}
