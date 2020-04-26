package Group9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class ContaMagicaTest extends ContaMagica{
    private ContaMagica cM;

    @BeforeEach
    public void initialize(){
        this.cM = new ContaMagica();
    }

    @Test
    public void getSaldoTest(){
        double saldo = cM.getSaldo();
        assertEquals(saldo, 0);
    }
    
    @Test
    public void getStatusTest(){
        double saldo = cM.getStatus();
        assertEquals(saldo, 0);
    }

    @Test
    public void valorMenor0Deposito() throws INVALID_OPER_EXCEPTION{
        assertThrows(INVALID_OPER_EXCEPTION.class, () -> cM.deposito(-1));
    }

    @Test
    public void SaldoMenor50000Deposito() throws INVALID_OPER_EXCEPTION{
        assertThrows(INVALID_OPER_EXCEPTION.class, () -> cM.deposito(-1));
    }

    /*
        Teste de Deposito:
    valor<0 
    valor>=0 && valor+saldo<50000 && status=0
    valor>=0 && valor+saldo>=50000 && status=0
    valor>=0 && valor+saldo<200000 && status=1
    valor>=0 && valor+saldo>=200000 && status=1
    valor>=0 && status=2
   */

    @Test
    public void retiradaValorMenor0Test() 
    {
        cM.retirada(-1);
    }

    @Test
    public void retiradaSaldoMenosValorMenor0Test()
    {
        
    }

    @Test
    public void retiradaStatusIgual0Test()
    {
        
    }

    @Test
    public void retiradaSaldoMenosValorMaiorIgual25000StatusIgual1Test()
    {
        
    }

    @Test
    public void retiradaSaldoMenosValorMenor25000StatusIgual1Test()
    {
        
    }

    @Test
    public void retiradaSaldoMenosValorMaiorIgual100000StatusIgual2Test()
    {
        
    }

    @Test
    public void retiradaSaldoMenosValorMenor100000StatusIgual2Test()
    {
        
    }
    /*
    valor<0
    saldo-valor<0
    valor>=0 && saldo-valor>=0 && status=0
    valor>=0 && saldo-valor>=25000 && status=1
    valor>=0 && saldo-valor<25000 && status=1
    valor>=0 && saldo-valor>=100000 && status=2
    valor>=0 && saldo-valor<100000 && status=2
    */

}