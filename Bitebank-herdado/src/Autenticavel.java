//interface � uma classe abstrata com todos os metodos abstratos
//n�o pode nada concreto
//contrato Autenticavel
	//quem assina esse contrato precisa implementar
		//metodo setSenha
		//meetodo autentica
//contrato que define obriga��es

public abstract interface Autenticavel {
	
	//metodos abstratos n�o tem implementa��o
	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
