package org.example.modificador;

public class ContaCorrente {
    public static void main(String[] args) {
        Conta conta = new Conta(0.00);
        conta.setSaldo(1200.00);
        conta.setTitular("Julia");
        System.out.println(conta.getSaldo());
        System.out.println(conta.getTitular());
    }
}
