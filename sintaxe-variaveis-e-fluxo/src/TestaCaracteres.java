
public class TestaCaracteres {
		//String: tipo referencia
	public static void main(String[] args) {
		//guarda no formato unicode (numero)
		char letra = 'a';
		char valor = 66;
		valor = (char)(valor + 1);
		System.out.println(letra);
		System.out.println(valor);
		
		String palavra = "Carlos Alberto Silva J�nior";
		
		System.out.println(palavra + " " + valor);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
		
		String parcela1 = "10";
		String parcela2 = "20";

		System.out.println(parcela1 + parcela2);
		
	}
}