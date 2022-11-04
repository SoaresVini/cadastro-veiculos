package modelo;

import java.time.LocalDate;

public class Cliente {	

	String Nome;
	String Cpf;
	String CarteiraMotorista;
	LocalDate DataEmissao;
	LocalDate Datanasc;
	String Sexo;
	String Numero ;
	String Email;
	
	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public String getCarteiraMotorista() {
		return CarteiraMotorista;
	}

	public void setCarteiraMotorista(String carteiraMotorista) {
		CarteiraMotorista = carteiraMotorista;
	}

	public LocalDate getDataEmissao() {
		return DataEmissao;
	}

	public void setDataEmissao(LocalDate dataEmissao) {
		DataEmissao = dataEmissao;
	}

	public LocalDate getDatanasc() {
		return Datanasc;
	}

	public void setDatanasc(LocalDate datanasc) {
		Datanasc = datanasc;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}	
}

