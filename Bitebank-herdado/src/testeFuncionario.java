
public class testeFuncionario {
	public static void main(String[] args) {
		//cria um funcionario chamando um construtor
		//insere construtor padr�o se n�o for criado um em Funcionario.java
		//referencia criada
//		Funcionario carlos = new Funcionario();
		Designer carlos = new Designer();
		
		carlos.setNome("Carlos");
		carlos.setCpf("419.415.368-59");
		carlos.setSalario(1350);
		
		System.out.println("Nome: " + carlos.getNome());
		System.out.println("Cpf: " + carlos.getCpf());
		System.out.println("Sal�rio: " + carlos.getSalario());
		System.out.println("Bonifica��o: " + carlos.getBonificacao());
	}
}
