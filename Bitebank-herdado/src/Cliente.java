
//quando se assina um contrato de interface, não se usa extends, usa-se implements
public class Cliente implements Autenticavel {
	//obrigação implementar metodos da interface
	
	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
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
