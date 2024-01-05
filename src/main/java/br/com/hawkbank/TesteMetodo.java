package br.com.hawkbank;

public class TesteMetodo {
    public static void main(String[] args) {
        
        Conta ContaDoLucas = new Conta();
        ContaDoLucas.saldo = 100;
        
        ContaDoLucas.depositar(155);
        System.out.println(ContaDoLucas.saldo);
        
        ContaDoLucas.sacar(65);
        System.out.println(ContaDoLucas.getSaldo());
    }
}
