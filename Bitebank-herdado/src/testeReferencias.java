
public class testeReferencias {

	public static void main(String[] args) {
		//Gerente g1 = new Gerente();
		//variavel do tipo mais generico
		
		Gerente g1 = new Gerente();		
		g1.setNome("Carlos");
		g1.setSalario(5000.0);
		
//		//funcionario � algo abstrato - comum as carreiras
//		Funcionario f = new Funcionario();
//		f.setSalario(2500);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(3000.0);
		
		Designer d = new Designer();
		d.setSalario(3500.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
//		controle.registra(f);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println("Gerente: " + g1.getBonificacao());
		System.out.println("E video: " + ev.getBonificacao());
		System.out.println("Designer: " + d.getBonificacao());
		System.out.println(controle.getSoma());

	}

}
