package br.com.javabank.modelo;

public class Corrente extends Conta {
    private double limite;

    public Corrente(int numero, String titular, double limite){
        super(numero, titular);
    }
    public double getLimite(){
        return this.limite = limite;
    }
    //reescrita de funções (overwrite)
    @Override //anotação
    public boolean sacar(double valor){
        return true;
    }
}
