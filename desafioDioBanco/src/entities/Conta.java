package entities;

import entities_Interface.IConta;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_UNICA = 1;

	private static  int PROGRECAO = 1;
	
	private int agencia;
	private int numero;
	private double saldo;
	private Cliente cliente;
	
	
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public Conta(Cliente cliente, String nome, String cpf) {
		this.agencia = AGENCIA_UNICA;
		this.numero = PROGRECAO++;
		this.cliente = new Cliente(nome, cpf);
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	@Override
	public void depositar(double valor) {
		saldo += valor;
	}
	
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}

	public void imprimirInf() {
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Cpf: " + cliente.getCpf());
		System.out.println(String.format("Agencia: %d" , this.agencia));
		System.out.println(String.format("Numero: %d" , this.numero));
		System.out.println(String.format("Saldo: %.2f" , this.saldo));
	}
}
