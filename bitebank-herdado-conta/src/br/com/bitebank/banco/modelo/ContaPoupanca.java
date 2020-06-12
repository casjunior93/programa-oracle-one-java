package br.com.bitebank.banco.modelo;

public class ContaPoupanca extends Conta {
	//reaproveitando o construtor da classe mãe
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Conta poupança. " + super.toString(); // getNumero() da classe conta;
	}
}
