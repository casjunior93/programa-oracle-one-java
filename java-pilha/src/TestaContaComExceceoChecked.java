
public class TestaContaComExceceoChecked {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		//tem que tomar atitude com a excecao por que minhaexcecao é checked
//		coloca-se try/catch
		//quem usa metodo deposita da classe COnta fica sabendo que o metodo deposita é perigoso porque pode acontecer uma excecao
		try {
			c.deposita();
		} catch(MinhaExcecao ex) {
			System.out.println("Tratamento");
		}

	}

}
