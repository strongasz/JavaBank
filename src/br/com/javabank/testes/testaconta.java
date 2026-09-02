package br.com.javabank.testes;

import br.com.javabank.modelo.Conta;

public class testaconta {
    //atalho para main == psvm + tab
    public static void main(String[] args){
        //instanciação
        Conta c1 = new Conta(1000, "juca");
        Conta c2 = new Conta(1001,"ana");
        Conta c3 = new Conta(1002,"mario");

        //objeto c1
        c1.setTitular("juca");
        //c1.numero = 1000;
        //c1.saldo = 500;
        //objeto c2
        //c2.titular = "voce";
        //c2.numero = 1001;
        //c2.saldo = 350;

        System.out.println("saldo c1: " + c1.getSaldo());
        System.out.println("saldo c2: " + c2.getSaldo());

        System.out.println("saldo atual do c1: " + c1.getSaldo());
        c1.depositar(500);
        System.out.println("saldo atual do c1: " + c1.getSaldo());
        c1.sacar(300);
        System.out.println("saldo atual do c1: " + c1.getSaldo());

    }
}
