package org.example.abstratas;

public class ContaCorrente extends Conta {
    @Override
    public void imprimeExtrato() {
        System.out.println("Extrato de Conta Corrente");
    }
}
