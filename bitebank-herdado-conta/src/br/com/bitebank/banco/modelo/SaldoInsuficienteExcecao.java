package br.com.bitebank.banco.modelo;

//excecao
public class SaldoInsuficienteExcecao extends Exception {
	//criando construtor
	public SaldoInsuficienteExcecao(String msg) {
		super(msg);
	}
}
