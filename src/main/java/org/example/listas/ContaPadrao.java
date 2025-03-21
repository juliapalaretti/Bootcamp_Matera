package org.example.listas;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ContaPadrao {

    Double saldo;
    Double taxaOperacao;

    public void sacar (Double valor){
        this.saldo -= valor + taxaOperacao;
    }
}
