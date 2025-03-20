package org.example.listas.set;

import org.example.listas.Conta;

import java.util.HashSet;
import java.util.Set;

public class TesteSetConta {
    public static void main(String[] args) {
        Set<Conta> contas = new HashSet<Conta>();

        contas.add(new Conta(100L, 252.00));
        contas.add(new Conta(100L, 150.00));

    }
}
