package br.com.bytebank.banco.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Linkedist {
	public static void main(String[] args) {
		//Generics
//        ArrayList<Conta> lista = new ArrayList<Conta>();
		//ao trocar o arrayList por LinkedList temos o mesmo resultado
		//LinkedList não ´´e bom para iteracao
		//cada elemento no LinkedList lembra do anterior, e o primeiro lembra de quem o segue
		//sabe-se que esta no final da lista quando  nao ha umm proximo
//        LinkedList<Conta> lista = new LinkedList<Conta>();
		//se ArrayList e LinkedList tem os mesmos metodo, sabemos que há uma interface List
		List<Conta> lista = new LinkedList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);
        
        Conta cc3 = new ContaCorrente(22, 22);
        
        //verificando se existe uma referencia
        boolean existe = lista.contains(cc3);
        
        System.out.println("Existe? " + existe);
        
        for(Conta conta : lista) {
            if(conta.equals(cc3)) {
            	System.out.println("Essa conta existe");
            }
        }

        for(Conta conta : lista) {
                System.out.println(conta);
        }
        
        System.out.println("--------------------------------");
        
        Conta cc4 = new ContaCorrente(34, 56);
        Conta cc5 = new ContaCorrente(34, 56);
        
        boolean igual = cc4.equals(cc5);
        System.out.println(igual);
	}
}
