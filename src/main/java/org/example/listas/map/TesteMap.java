package org.example.listas.map;

import java.util.HashMap;
import java.util.Map;

public class TesteMap {
    public static void main(String[] args) {
        Map<String, String> contas = new HashMap<>();

        contas.put("Conta Corrente", "Samuel");
        contas.put("Conta Pagamento", "Karyn");
        contas.put("Conta Poupanca", "Paula");

        System.out.println(contas.get("Conta Corrente"));
        System.out.println(contas.keySet());
        System.out.println(contas.containsKey("Conta Corrente"));
    }
}
