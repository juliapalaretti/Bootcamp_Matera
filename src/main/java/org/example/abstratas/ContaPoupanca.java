package org.example.abstratas;

public class ContaPoupanca extends Conta {
    @Override
    public void imprimeExtrato() {
        System.out.println("Extrato de conta poupança");
    }
}
