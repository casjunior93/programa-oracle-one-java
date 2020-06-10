package br.com.bitebank.banco.teste;

public class TesteConexao {

	public static void main(String[] args) {
		
		//inicializa a conexao j� no try - exige que implementa autocloseble
		//desta forma garante o fechamento da conexao caso nao de certo
		//implementacao em Conexao.jva
		try(br.com.bitebank.banco.modelo.Conexao conexao = new br.com.bitebank.banco.modelo.Conexao()) {
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Deu zica!");
		}
		
		//--------------------
//		Conexao con = null;
//		
//		try {
//			//se vc abre uma conexao com o banco, deve fecha-la
//			//o try sempre exige o catch ou o finally
//			con = new Conexao();
//			con.leDados();
//		} catch(IllegalStateException ex) {
//			System.out.println("Erro conexao");
//		} finally { //sempre acontece
//			con.close();			
//		}

	}

}
