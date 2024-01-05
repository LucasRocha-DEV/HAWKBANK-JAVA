/**
 * Classe de teste para demonstrar o conceito de referências e objetos.
 * A referência é uma variável que armazena o endereço de memória de um objeto.
 * O objeto é uma instância de uma classe que contém atributos e comportamentos.
 */
package br.com.hawkbank;

public class TesteReferencias {
    public static void main (String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeira: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println("saldo da segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("saldo da segunda conta: " + segundaConta.saldo);

        System.out.println("saldo da primeira: " + primeiraConta.saldo);

        if (primeiraConta == segundaConta) {
            System.out.println("são a mesmissima conta");
        } else {
            System.out.println("são contas diferentes");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }

    

    
}
