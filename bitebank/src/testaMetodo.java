
public class testaMetodo {
	public static void main(String[] args) {
		Conta contaDoCarlos = new Conta();
		contaDoCarlos.deposita(520);
		System.out.println(contaDoCarlos.saldo);
		contaDoCarlos.deposita(520);
		System.out.println(contaDoCarlos.saldo);
		
		boolean conseguiuRetirar =  contaDoCarlos.saca(200);
		System.out.println(contaDoCarlos.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		System.out.println("Valor inicial da onta da Marcela: " + contaDaMarcela.saldo);
		System.out.println("Valor inicial da onta do Carloss: " + contaDoCarlos.saldo);
		
		if(contaDaMarcela.transfere(3000, contaDoCarlos)) {
			System.out.println("Transferencia concluida!");
			System.out.println("Valor atual da onta da Marcela: " + contaDaMarcela.saldo);
			System.out.println("Valor atual da onta do Carloss: " + contaDoCarlos.saldo);
		} else {
			System.out.println("Saldo n�o suficiente");
		}
	}
}
