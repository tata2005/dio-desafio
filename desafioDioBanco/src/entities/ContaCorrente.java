package entities;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente, String nome, String cpf) {
		super(cliente, nome, cpf);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("===Conta Corrente===");
		imprimirInf();
	}

}
