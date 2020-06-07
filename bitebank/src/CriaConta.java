public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Seu saldo é: " +  primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("Seu saldo é: " +  primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println(segundaConta.saldo);
		
		System.out.println("Primeira conta tem: " + primeiraConta.saldo);
		System.out.println("Primeira conta tem: " + segundaConta.saldo);
		
		System.out.println("Agencia: " + primeiraConta.agencia);
		System.out.println("Conta : " + primeiraConta.numero);
		
		System.out.println("Agencia: " + segundaConta.agencia);
		System.out.println("Conta : " + segundaConta.numero);
		
		segundaConta.agencia = 194;
		
		System.out.println("Agora a segunda conta está na agência: " + segundaConta.agencia);
		
	}
}
