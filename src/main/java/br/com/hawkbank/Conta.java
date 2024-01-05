package br.com.hawkbank;

class Conta {
    double saldo = 100;
    int agencia;
    int numero;
    String titular;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta com saldo: " + saldo;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }
    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque Bem-sucedido.");
            return true; // saque bem-sucedido
        } else {
            System.out.println("Saque falhou. Saldo insuficiente.");
            return false; // saque falhou
        }
    }
}