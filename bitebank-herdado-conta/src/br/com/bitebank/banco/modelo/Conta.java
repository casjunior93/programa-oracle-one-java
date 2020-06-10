package br.com.bitebank.banco.modelo;

//Especifica��o - atributos
//Com new, cria objetos a partir daqui e atribui 0 aos valores
public abstract class Conta{
	//nao pode ser lido, nem modificado, a n�o ser pelos metodos da propria classe
	private double saldo;
	private int agencia;
	private int numero;
	//String
	private Cliente titular;
	//com static, total � da classe e n�o do objeto
	private static int total = 0;
	//rotina de inicializa��o - executa uma �nica vez; pode recer parametros
	
//	public Conta() {
//		
//	}
	
	public Conta(int agencia, int numero) {
		Conta.total ++;
		System.out.println("O total de contas �: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Cria��o de conta");
	}
	
	//comportamentos - maneiras de depositar dinheiro na conta
	//void - n�o retorna nada
	public boolean deposita(double valor) {
		//this - referencia ao objeto que invocou
		this.saldo += valor;
		System.out.println("O valor de " + valor + " foi depositado com sucesso!");
		return true;
	}
	
	//retorna algo
	public void saca(double valor) throws SaldoInsuficienteExcecao{
		//se o saldo desta conta
		if(this.saldo < valor) {
			throw new SaldoInsuficienteExcecao("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		
		this.saldo -= valor;
	}
	
	//recebe Conta que � tipo gen�rico
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteExcecao{
		this.saca(valor);
		destino.deposita(valor);
	}
	
	//metodo getter - pegar algo privado
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("N�o existem n�meros de contas com valores negativos");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("N�o existem n�meros de ag�ncias com valores negativos");
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}



