package org.example.optional;

import org.example.listas.Conta;

import java.util.Optional;

public class TesteOptional {
    public static void main(String[] args) {
        Optional<Conta> optionalConta = obtemContaSemErro();

        if (optionalConta.isPresent()){
            System.out.println("Saldo: " + optionalConta.get().getSaldo());
        } else {
            System.out.println("Não foi possível localizar a conta.");
        }

    }

    public static Conta obtemConta() {
        return null;
    }

    public static Optional<Conta> obtemContaSemErro() {
        return Optional.empty();
    }
}
