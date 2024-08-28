package entities;

public class Cliente {

	private String Nome;
	private String cpf;
	
	public Cliente(String nome, String cpf) {
		this.Nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return Nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	
	
}
