package br.com.bitebank.banco.teste;

public class TesteTributaveis {

	public static void main(String[] args) {
		br.com.bitebank.banco.modelo.ContaCorrente cc = new br.com.bitebank.banco.modelo.ContaCorrente(222, 333);
		cc.deposita(100.00);
		
		br.com.bitebank.banco.modelo.SeguroVida sv = new br.com.bitebank.banco.modelo.SeguroVida();
		
		br.com.bitebank.banco.modelo.CalculadorImposto ci = new br.com.bitebank.banco.modelo.CalculadorImposto();
		ci.registra(cc);
		ci.registra(sv);
		
		System.out.println(ci.getTotalImposto());
	}

}
