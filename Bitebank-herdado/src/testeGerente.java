
public class testeGerente {
	public static void main(String[] args) {
		
		//pode-se usar uma referencia para apontar uma classe autenticavel para um objeto
		Autenticavel referencia = new Gerente();
		Autenticavel referencia2 = new Administrador();
		Autenticavel referencia3 = new Cliente();
		
		Gerente g1 = new Gerente();
		g1.setNome("Isaac do Couto Lima");
		g1.setCpf("333.333.333-50");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		g1.setSenha(2222);
		
		boolean autenticado = g1.autentica(2222);
		System.out.println(autenticado);
		
		System.out.println(g1.getBonificacao());
	}
}
