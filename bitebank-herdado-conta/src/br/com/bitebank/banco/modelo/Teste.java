package br.com.bitebank.banco.modelo;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupanca(33, 22);
		Object cliente = new Cliente();
		
		System.out.println(cc.toString());
		System.out.println(cp.toString());
	}

}