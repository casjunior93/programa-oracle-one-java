package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {
	
	//temos um array
	private Object[] referencias;
	//variavel para guardar posicao percorrida
	private int posicaoLivre;
	
	//e um construtor
	public GuardadorDeReferencias() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}
	
	//tem que receber uma referencia do tipo conta
	public void adiciona(Conta ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
		// TODO Auto-generated method stub
		return this.posicaoLivre;
	}

	public Object getReferencia(int pos) {
		// TODO Auto-generated method stub
		return this.referencias[pos];
	}

}
