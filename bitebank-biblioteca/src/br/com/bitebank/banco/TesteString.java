package br.com.bitebank.banco;

public class TesteString {
	public static void main(String[] args) {
		//strings são objetos, mas não é necessario criar com new
		//objeto literal
		String nome = "CARLOS";
		String nome2 = new String("CARLOS 2");
		
		nome.replace("s", "$");
		nome.toLowerCase();
		
		System.out.println(nome);
		//Não funciona - uma vez a String criada, ela não pode ser modificada posteriormente - Imutabilidade
		//Caso queira alterar uma string, tem de se criar outra que refletira a nova açao
		//é possivel utilizar dois metodos na mesma instancia
		
		String nomeAlterado = nome.replace("s", "$").toLowerCase();
		System.out.println(nomeAlterado);
		
		String nomeAlterado2 = nome.replace("OS", "ÃO").toLowerCase();
		System.out.println(nomeAlterado2);
		
		char c = nome.charAt(2);
		System.out.println(c);
		
		//qual a posicao de uma string dentro de CARLOS
		int pos = nome.indexOf("RL");
		System.out.println(pos);
		
		//criando substrings
		String sub = nome.substring(2);
		System.out.println(sub);
		
		//tamanho string
		System.out.println(nome.length());
		
		//imprimindo nome caractere por caractere
		System.out.println(nome);
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		//pergunta se a string ta vazia
		String vazio = "          CARLOS";
		System.out.println(vazio.isEmpty());
		
		//anulando espaços
		String outroVazio = vazio.trim();
		System.out.println(outroVazio.isEmpty());
		System.out.println(outroVazio);
		
		//verifica se uma string contem uma substring
		System.out.println(nome.contains("OS"));
		
		//concatenacao mais otimizada
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto = builder.toString();
		System.out.println(texto);
		
		//
		String nome3 = "ALURA";
		CharSequence cs = new StringBuilder("al");

		nome3 = nome3.replace("AL", cs);

		System.out.println(nome3);
	}
}
