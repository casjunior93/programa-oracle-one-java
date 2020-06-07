
public class testaValores {
	public static void main(String[] args) {
		//os parenteses em Conta() invoca um construtor
		Conta conta = new Conta(1337, 24226);
		
		//conta inconsistente com o plano de negocio
		//conta.setAgencia(-50);
		//conta.setNumero(-330);
		
		System.out.println("Conta: " + conta.getNumero());
		System.out.println("Agencia: " + conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 24354);
		Conta conta3 = new Conta(1337, 243234);
		Conta conta4 = new Conta(1337, 243014);
		
		System.out.println("O número de contas criadas é: " + Conta.getTotal());
	}
}
