package br.com.hawkbank;

public class CriaConta {
    public static void main(String[] args) {
        System.out.println("primeira conta:");
        
        Conta primeiraconta = new Conta();
        
        primeiraconta.titular = "João";
        System.out.println("Titular:" + primeiraconta.titular);

        primeiraconta.agencia = 1234;
        System.out.println("agencia:" + primeiraconta.agencia);

        primeiraconta.numero = 123456;
        System.out.println("numero da conta:" + primeiraconta.numero);
        
        primeiraconta.saldo = 200;
        System.out.println("saldo inicial: " + primeiraconta.saldo);

        primeiraconta.saldo += 100;
        System.out.println("alteração:" + primeiraconta.saldo);

        primeiraconta.saldo -= 50;
        System.out.println("atual:" + primeiraconta.saldo);

        System.out.println();
        System.out.println();
        
        // segunda conta
        System.out.println("segunda conta:");

        Conta segundaconta = new Conta();

        segundaconta.titular = "Maria";
        System.out.println("Titular:" + segundaconta.titular);

        segundaconta.agencia = 1234;
        System.out.println("agencia:" + segundaconta.agencia);

        segundaconta.numero = 123456;
        System.out.println("numero da conta:" + segundaconta.numero);
        
        segundaconta.saldo = 500;
        System.out.println("saldo inicial: " + segundaconta.saldo);

        segundaconta.saldo += 100;
        System.out.println("alteração:" + segundaconta.saldo);

        segundaconta.saldo -= 50;
        System.out.println("atual:" + segundaconta.saldo);

        System.out.println("!!!primeira conta tem: " + primeiraconta.saldo + "!!!");
        System.out.println("!!!segunda conta tem: " + segundaconta.saldo + "!!!");
        
        Transferir.transferir(primeiraconta, 50, segundaconta);

        System.out.println("!!!primeira conta tem: " + primeiraconta.saldo + "!!!");
        System.out.println("!!!segunda conta tem: " + segundaconta.saldo + "!!!");
    }

}
