//gerente herda da classe funcionario, assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	//public - modificador de visibilidade
	//pode-se criar um get mesmo sem ter um atributo relacioado
	public double getBonificacao() {
		//reescrita de metodo da cl. m�e na classe filho
		//precisa ver a classe m�e para encontrar o atributo
		System.out.println("Chamada do metodo de bonifica��o do Gerente");
		//return super.getBonificacao() + super.getSalario();
		return super.getSalario();
    }

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}