
public class testeContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.pegaSaldo());
		
		//null referencia pra lugar nenhum
		//associa a string titular em conta.java com a classe cliente.java
		//objetos são sempre acessados através de flechinas
		contaDaMarcela.titular = new Cliente();
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);		
	}
}
