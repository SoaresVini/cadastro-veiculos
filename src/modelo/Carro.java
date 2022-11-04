package modelo;

import java.time.LocalDate;

public class Carro {
	LocalDate AnoFabricacao;
	String DonoCarro;
	String Cor;
	String Placa;
	String Pneu;
	String Modelo;
	String Marca;
	Long Renavan;
	String Categoria; //diplomático, aprendizado, oficial, particular ou para aluguel//
	LocalDate AnoModelo;
	String Combustivel;

	public LocalDate getAnoFabricacao() {
		return AnoFabricacao;
	}

	public void setAnoFabricacao(LocalDate anoFabricacao) {
		AnoFabricacao = anoFabricacao;
	}

	public String getDonoCarro() {
		return DonoCarro;
		// cliente cadastrado//
	}

	public void setDonoCarro(String donoCarro) {
		DonoCarro = donoCarro;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}

	public String getPneu() {
		return Pneu;
	}

	public void setPneu(String pneu) {
		Pneu = pneu;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public Long getRenavan() {
		return Renavan;
	}

	public void setRenavan(Long renavan) {
		Renavan = renavan;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public LocalDate getAnoModelo() {
		return AnoModelo;
	}

	public void setAnoModelo(LocalDate anoModelo) {
		AnoModelo = anoModelo;
	}

	public String getCombustivel() {
		return Combustivel;
	}

	public void setCombustivel(String combustivel) {
		Combustivel = combustivel;
	}

}
