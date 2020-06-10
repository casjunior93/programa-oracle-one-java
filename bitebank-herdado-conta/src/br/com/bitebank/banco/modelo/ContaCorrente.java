package br.com.bitebank.banco.modelo;

//extendo a conta vc herda os atributos e m�todos, mas n�o herda os construtores
//por isso deve-se escrever o construtor
public class ContaCorrente extends Conta implements Tributavel {
	
	//construtor
	public ContaCorrente(int agencia, int numero) {
		//o construtor chama automaticamente o construtor da classe m�e
		//� implicito
		super(agencia, numero);
	}
	
	//comportamento - ao sacar cobra uma taxa de 20 cents
	//redefinir o comportamento do m�todo saca da classe Conta
	// escreve saca e Ctrl+espaco
	//sobrescreve o metodo
	@Override
	public void saca(double valor) throws SaldoInsuficienteExcecao{
		double valorASacar = valor + 0.20;
		super.saca(valorASacar);
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}
	
}