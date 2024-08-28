package entities;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, String nome, String cpf) {
		super(cliente, nome, cpf);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("===Conta Poupança===");
		imprimirInf();
	}

}
