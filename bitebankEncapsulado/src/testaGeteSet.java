
public class testaGeteSet {
	public static void main(String[] args) {
		Conta conta = new Conta(1338, 24226);
		//conta.numero = 1337;
		//conta.setNumero(1337);
		
		System.out.println(conta.getNumero());
		
		Cliente carlos = new Cliente();
		//conta.titular = carlos;
		carlos.setNome("Carlos Alberto Silva J�nior");
		//alterando o nome do titular
		conta.setTitular(carlos);
		
		conta.getTitular().setProfissao("Operador de m�quinas");
		
		System.out.println("Nome: " + conta.getTitular().getNome());
		System.out.println("Agencia: " + conta.getAgencia());
		System.out.println("N�mero: " + conta.getNumero());
		System.out.println("Titular: " + conta.getTitular().getNome());
		
		
	}
}
