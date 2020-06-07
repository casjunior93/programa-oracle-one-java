
public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(200));
		
		//proibido - tem que acessar atraves de metodos
		//conta.saldo = conta.saldo - 101;
		//System.out.println(conta.saldo);
		
		System.out.println(conta.pegaSaldo());
	}
}

//encapsulamento = usar metodos para acessar os atributos de um objeto

