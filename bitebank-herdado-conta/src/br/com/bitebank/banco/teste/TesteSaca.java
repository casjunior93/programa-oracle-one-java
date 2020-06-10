package br.com.bitebank.banco.teste;

public class TesteSaca {

	public static void main(String[] args) {
		br.com.bitebank.banco.modelo.Conta conta = new br.com.bitebank.banco.modelo.ContaCorrente(123, 321);
		
		conta.deposita(200.0);
		try {
			conta.saca(210.0);
		} catch(br.com.bitebank.banco.modelo.SaldoInsuficienteExcecao ex) {
			System.out.println("Ex: " + ex.getMessage());
		}
		
		System.out.println(conta.getSaldo());

	}

}
