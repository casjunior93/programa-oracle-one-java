//criando um funcionario
//abstract � relacionado com heran�a - n�o pode criar objetos dessa classe
public abstract class Funcionario {
	private String nome;
	private String cpf;
	//protected - publico para os filhos
	//protected double salario;
	private double salario;
	
	//public - modificador de visibilidade
	//pode-se criar um get mesmo sem ter um atributo relacionado 
//	public double getBonificacao() {
//		return this.salario * 0.05;
//	}
	
	//m�todo sem corpo - implementa nos filhos
		public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
