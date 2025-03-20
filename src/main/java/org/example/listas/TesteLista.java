package org.example.listas;

import java.util.ArrayList;
import java.util.List;

public class TesteLista {
    public static void main(String[] args) {

        List<String> contas = new ArrayList<String>();
        contas.add("Conta Poupança");
        contas.add("Conta Corrente");
        contas.add("Conta Pagamento");

        System.out.println("Conta 1: " + contas.getFirst());
        System.out.println("Conta 2: " + contas.get(1));
        System.out.println("Conta 3: " + contas.getLast());

    }
}
