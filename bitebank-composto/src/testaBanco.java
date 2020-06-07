
public class testaBanco {
	public static void main(String[] args) {
		Cliente carlos = new Cliente();
		
		//populando
		carlos.nome = "Carlos Alberto Silva Júnior";
		carlos.cpf  = "419.415.368-59";
		carlos.profissao = "Programador";
		
		//criando a conta do carlos
		Conta contaDoCarlos = new Conta();
		contaDoCarlos.deposita(100);
		
		//associa o cliente carlos a contaDoCarlos
		contaDoCarlos.titular = carlos;
		System.out.println(contaDoCarlos.titular.nome);
	}
}
