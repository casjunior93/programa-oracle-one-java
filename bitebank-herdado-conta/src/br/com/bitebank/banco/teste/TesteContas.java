package br.com.bitebank.banco.teste;

import br.com.bitebank.banco.especial.ContaEspecial;
//importando pacotes necess�rios para a classe
import br.com.bitebank.banco.modelo.ContaCorrente;
import br.com.bitebank.banco.modelo.ContaPoupanca;
import br.com.bitebank.banco.modelo.SaldoInsuficienteExcecao;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteExcecao{
		// Criando objetos
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		//reaproveita da Classe Conta
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		//reaproveita da Classe Conta
		cp.deposita(200);
		
		//transferir dinheiro
		//reaproveita da Classe Conta
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());

	}

}