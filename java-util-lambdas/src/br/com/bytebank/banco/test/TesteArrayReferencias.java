package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
	//Porque iniciar um rray de referencias?
	//Para nos preparar quando existir a possibilidade de aramzenar diversas contas
	public static void main(String[] args) {
		//vamos armazenar 5 contas correntes
		//valor padrao null
		
		//para armazenar tanto contas corrente quanto poupanšas, referenciamos uma classe generica
//		ContaCorrente[]contas = new ContaCorrente[5];
//		Conta[]contas = new Conta[5];
		
		//para armazwenar qualquer tipo de objeto
		Object[]referencias = new Object[5];
		
		//criou-se um objeto que pode guardar cinco referencias de contas correntes
		//nenhuma conta foi criada
		
		//cria-se uma contacorrente c1
		ContaCorrente cc1 = new ContaCorrente(12, 34);
		ContaCorrente cc2 = new ContaCorrente(23, 45);
		
		ContaPoupanca cp1 = new ContaPoupanca(34, 56);
		Cliente cli1 = new Cliente();
				
		
		//armazendo o objeto cc1 em contas[0]
		referencias[0] = cc1;
		referencias[1] = cc2;
		referencias[2] = cp1;
		referencias[3] = cli1;
		
//		System.out.println(cc2.getNumero());
//		System.out.println("Conta c1: " + contas[0].getNumero());
//		System.out.println("Conta c2: " + contas[1].getNumero());
//		System.out.println("Conta p1: " + contas[2].getNumero());
		
		//podemos criar uma referencia para obter valores
		//type cast - transforma referencia generica em especifica
		ContaCorrente ref = (ContaCorrente) referencias[1];
		System.out.println(ref.getNumero());
	}
}
