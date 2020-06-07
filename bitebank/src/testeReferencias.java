
public class testeReferencias {
	public static void main(String[] args) {
		//Conta é um objeto do tipo Conta()
		//primeiraConta é uma referência ao objeto Conta
		//segundaCnta é uma referencia ao objeto Conta
		//Conta() é a especificação
		//Com new, crio um objeto Conta que é referenciada por primeiraConta ao arquivo Conta.java
		//primeiraConta é uma flecha para o objeto Conta partindo da especificação
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 301;
		
		System.out.println("Saldo: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("Saldo 2: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		
		System.out.println("Saldo 2: " + segundaConta.saldo);
		System.out.println("Sado 1: " + primeiraConta.saldo);
		
		if (primeiraConta.saldo == segundaConta.saldo){
			System.out.println("São a mesma conta");
		}
	}
}
