package org.example.ExemploEqualsEIgual;

public class TesteEqualsEIgual {
    public static void main(String[] args) {
        String nome1 = "Ana";
        String nome2 = "Julia";
        String nome3 = new String("Ana");

        System.out.println("(nome1 == nome2): " + (nome1 == nome2));
        System.out.println("(nome1 == nome3): " + (nome1 == nome3));
        System.out.println("(nome1.equals(nome2)): " + (nome1.equals(nome2)));
        System.out.println("(nome1.equals(nome3)): " + (nome1.equals(nome3)));
    }
}
