package modelo;

import java.time.LocalDate;

public class MCliente {	
	Long
			wCpf;
	
	String  
			wCarteiraMotorista,
			wSexo,
			wNome,
			wNumeroTelefone,
			wGmail;

	LocalDate 
			wDataNascimento;



	public Long getwCpf() {
		return wCpf;
	}

	public void setwCpf(Long wCpf) {
		this.wCpf = wCpf;
	}

	public String getwNome() {
		return wNome;
	}

	public void setwNome(String wNome) {
		this.wNome = wNome;
	}

	public String getwCarteiraMotorista() {
		return wCarteiraMotorista;
	}

	public void setwCarteiraMotorista(String wCarteiraMotorista) {
		this.wCarteiraMotorista = wCarteiraMotorista;
	}

	public String getwSexo() {
		return wSexo;
	}

	public void setwSexo(String wSexo) {
		this.wSexo = wSexo;
	}

	public String getwNumeroTelefone() {
		return wNumeroTelefone;
	}

	public void setwNumeroTelefone(String wNumeroTelefone) {
		this.wNumeroTelefone = wNumeroTelefone;
	}

	public String getwGmail() {
		return wGmail;
	}

	public void setwGmail(String wGmail) {
		this.wGmail = wGmail;
	}

	public LocalDate getwDataNascimento() {
		return wDataNascimento;
	}

	public void setwDataNascimento(LocalDate wDataNascimento) {
		this.wDataNascimento = wDataNascimento;
	}
}

