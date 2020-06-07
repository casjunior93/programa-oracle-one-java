
public class TesteContas {

	public static void main(String[] args) {
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
