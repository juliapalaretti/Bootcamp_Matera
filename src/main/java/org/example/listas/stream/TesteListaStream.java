package org.example.listas.stream;

import java.util.ArrayList;
import java.util.List;

public class TesteListaStream {
    public static void main(String[] args) {
        List<String> contas = new ArrayList<>();

        contas.add("Conta Poupança");
        contas.add("Conta Corrente");
        contas.add("Conta Pagamento");
        contas.add("Conta Poupanca");

        contas.stream()
                .filter(conta -> filterLista(conta))
                .forEach(conta -> System.out.println("Conta: " + conta));
    }

    public static Boolean filterLista(String conta) {
        return conta.contains("Corrente");
    }
}
