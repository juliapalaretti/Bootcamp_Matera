package org.example.anonimas;

public class TesteClasseAnonima {
    public static void main(String[] args) {
        CarteiraContas carteiraContas = new CarteiraContas();
        carteiraContas.contaCorrente.imprimeTipoConta();
        carteiraContas.contaPoupanca.imprimeTipoConta();
    }
}
