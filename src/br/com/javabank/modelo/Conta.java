package br.com.javabank.modelo;

public class Conta {
    //public todas as classes tem acessos aos membros
    //private apenas a propria classe tem acesso aos numeros
    private int numero;
    private String titular;
    private double saldo;

    //construtor
    public Conta(){
        //contrutor vazio (default)
    }

    public Conta(int numero, String titular){
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    //GET --> retorna o valor de uma propriedade
    public String getTitular() {
        return titular;
    }
    public int getNumero(){

    }

    public double getSaldo() {
        return this.saldo;
    }

    //w///////////////////////////////////////////////////////////////
    //SET --> altera o valor de uma propriedade
    public void setTitular(String titular){
        if (titular.length() > 1) {
            this.titular = titular;
        }else{
            System.out.println("o titular deve ter no minimo 2 letras");
        }
    }
    //função de depositar
    public boolean depositar(double valor){
        if(valor > 0) {
            saldo += valor;
            return true;
        }else{
            return false;
        }
    }
    //função de sacar
    public boolean sacar(double valor){
        // && --> and
        // || --> or
        // ! --> not
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean transferir(double valor, Conta favorecido){
        if (sacar(valor) == true){
            favorecido.depositar(valor);
            return true;
        }else{
            return false;
        }
    }
}
