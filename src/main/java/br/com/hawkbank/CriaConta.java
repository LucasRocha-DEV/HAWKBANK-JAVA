package br.com.hawkbank;

public class CriaConta {

    public static void main(String[] args) {
        
        
        conta primeiraconta = new conta();
        
        primeiraconta.titular = "João";
        System.out.println("Titular:" +primeiraconta.titular);

        primeiraconta.agencia = 1234;
        System.out.println("agencia:" +primeiraconta.agencia);

        primeiraconta.numero = 123456;
        System.out.println("numero da conta:" +primeiraconta.numero);
        
        primeiraconta.saldo = 200;
        System.out.println("saldo inicial: " + primeiraconta.saldo);

        primeiraconta.saldo += 100;
        System.out.println("alteração:" + primeiraconta.saldo);

        primeiraconta.saldo -= 50;
        System.out.println("atual:" + primeiraconta.saldo);

        

        
        conta segundaconta = new conta();

        segundaconta.titular = "Maria";
        System.out.println("Titular:" +segundaconta.titular);
    }
    
}
