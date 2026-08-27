package br.com.javabank.testes;

import br.com.javabank.modelo.Conta;

public class testaconta {
    //atalho para main == psvm + tab
    public static void main(String[] args){
        //instanciação
        Conta c1 = new Conta();
        Conta c2 = new Conta();

        //objeto c1
        c1.titular = "eu";
        c1.numero = 1000;
        c1.saldo = 500;
        //objeto c2
        c2.titular = "voce";
        c2.numero = 1001;
        c2.saldo = 350;

        System.out.println("saldo c1: " + c1.saldo);
        System.out.println("saldo c2: " + c2.saldo);

        System.out.println("saldo atual do c1: " + c1.saldo );
        c1.depositar(500);
        System.out.println("saldo atual do c1: " + c1.saldo );

    }
}
