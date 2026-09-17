package br.com.javabank.testes;

import br.com.javabank.modelo.Corrente;
import br.com.javabank.modelo.Poupanca;

public class TesteHeranca {
    public static void main(String[] args){
        Corrente cc1 = new Corrente(2001, "lucas",5000);
        Poupanca cp1 = new Poupanca(2001, "marlene",1);
    }
}
