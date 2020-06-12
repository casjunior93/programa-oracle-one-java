package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class Teste {
	public static void main(String[] args) {
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();		
		//usasmos o guardador para add uma conta. para isso criamos um objeto Conta()
		Conta cc1 = new ContaCorrente(22,11);
		guardador.adiciona(cc1);
		
		Conta cc2 = new ContaCorrente(25,18);
		guardador.adiciona(cc2);
		
		Conta cc3 = new ContaCorrente(23,101);
		guardador.adiciona(cc3);
		
		//tem que criar o metodo adiciona em GuardadorDeContas
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		//recebendo um elemento em si
		//receber referencia de ua conta
		//guardador de referencia criado
		Conta ref = (Conta) guardador.getReferencia(2);
		System.out.println(ref.getNumero());
		
		
	}
}
