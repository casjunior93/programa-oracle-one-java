//criando minha exce��o
//public class MinhaExcecao extends RuntimeException{
public class MinhaExcecao extends Exception {//chequed{
	public MinhaExcecao(String msg) {
		//repassando para a classe mae a mensagem
		super(msg);
	}
}