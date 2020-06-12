package br.com.bytebank.banco.test;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {
	public static void main(String[] args) {
		//Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

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
