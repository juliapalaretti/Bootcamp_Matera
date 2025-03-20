package org.example.listas;

import lombok.Data;

@Data
public class Conta {

    private Long numeroConta;
    private Double saldo;

    public Conta(Long numeroConta, Double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
}
