
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 14;
		int quantidadePessoas = 10;

		if (idade >= 18) {
			System.out.println("Voc� tem 18 anos ou mais");
			System.out.println("Seja bem vindo!");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("Voc� n�o tem 18, mas est� acompanhado. Acesso permitido.");
			} else {
				System.out.println("Acesso n�o permitido.");
			}
		}
	}

}
