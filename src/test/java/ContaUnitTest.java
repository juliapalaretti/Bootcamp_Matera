import org.example.listas.ContaPadrao;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContaUnitTest {
    Double saldo = 1000.00;
    Double taxaOperacao = 0.5;
    Double saldoFinal = 799.50;

    @Test
    public void sacarTest(){
        ContaPadrao conta = new ContaPadrao(saldo, taxaOperacao);
        conta.sacar(200.00);
        assertEquals(saldoFinal, conta.getSaldo());
    }
}
