
public class ControleBonificacao {
	
	private double soma;
	
	//mesmo usando uma referencia geral, sempre ser� chamado um m�todo espec�fico da classe para onde a referencia do objeto aponta
	public void registra(Funcionario f) {
		//
//		double boni =  f.getBonificacao();
		double boni =  f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}
}
