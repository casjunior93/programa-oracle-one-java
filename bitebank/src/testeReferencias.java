
public class testeReferencias {
	public static void main(String[] args) {
		//Conta � um objeto do tipo Conta()
		//primeiraConta � uma refer�ncia ao objeto Conta
		//segundaCnta � uma referencia ao objeto Conta
		//Conta() � a especifica��o
		//Com new, crio um objeto Conta que � referenciada por primeiraConta ao arquivo Conta.java
		//primeiraConta � uma flecha para o objeto Conta partindo da especifica��o
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 301;
		
		System.out.println("Saldo: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("Saldo 2: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		
		System.out.println("Saldo 2: " + segundaConta.saldo);
		System.out.println("Sado 1: " + primeiraConta.saldo);
		
		if (primeiraConta.saldo == segundaConta.saldo){
			System.out.println("S�o a mesma conta");
		}
	}
}
