package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {
	
	//O que s�o os colchetes em main?
	//String � uma classse, nao um primitivo
	public static void main(String[] args) { //String[] - declarando array de referencia
		int[]idades = new int[5]; //inicializa o array com os valores padroes
		//arrays sao objets, para criar um novo usamos a palavra new
		//todo array deve ter um tamanho fio, pre-definido
//		String[]nomes = new String[3];
		
		//forma literal
		String[]nomes = {"Carlos", "Isaac", "Rosi"};

        //preenche o array
		for(int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }

		//imprime os dados do array
        for(int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
        
        
        //preenchendo array nomes
//        nomes[0] = "Carlos";
//        nomes[1] = "Isaac";
//        nomes[2] = "Rosi";
        
        //imprimindo os nomes
        for(int i = 0; i < nomes.length; i++) {
        	System.out.println(nomes[i]);
        }
	}
	
}
