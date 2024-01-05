package br.com.hawkbank;

class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}