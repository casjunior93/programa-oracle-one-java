//Especifica��o - atributos
//Com new, cria objetos a partir daqui e atribui 0 aos valores
public class Conta{
	//nao pode ser lido, nem modificado, a n�o ser pelos metodos da propria classe
	private double saldo;
	int agencia;
	int numero;
	//String
	 Cliente titular;
	//
	
	//comportamentos - maneiras de depositar dinheiro na conta
	//void - n�o retorna nada
	public boolean deposita(double valor) {
		//this - referencia ao objeto que invocou
		this.saldo += valor;
		System.out.println("O valor de " + valor + " foi depositado com sucesso!");
		return true;
	}
	
	//retorna algo
	public boolean saca(double valor) {
		//se o saldo desta conta
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("N�o tem dinheiro para sacar");
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
	//metodo getter - pegar algo privado
	public double pegaSaldo() {
		return this.saldo;
	}
}


