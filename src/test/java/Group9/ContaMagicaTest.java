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
    public void SaldoMenor50000Status0Deposito() throws INVALID_OPER_EXCEPTION{ 
        cM.deposito(1);
        assertTrue(cM.getSaldo()==1 && cM.getStatus()==0);
    }

    @Test
    public void SaldoMaior200000DepositoStatusJump() throws INVALID_OPER_EXCEPTION{ 
        cM.deposito(200001);
        assertTrue(cM.getStatus()==1);
    }

    @Test
    public void SaldoMaior50000Status0Deposito() throws INVALID_OPER_EXCEPTION{
        cM.deposito(51000);
        assertTrue(cM.getSaldo()==51000 && cM.getStatus()==1);
    }

    @Test
    public void SaldoMenor200000Satus1Deposito() throws INVALID_OPER_EXCEPTION{
        cM.setStatus(1);
        cM.deposito(51000);
        assertTrue(cM.getSaldo()==(51000 *1.01) && cM.getStatus()==1);
    }

    @Test
    public void SaldoMaior200000Status1Deposito() throws INVALID_OPER_EXCEPTION{
        cM.setStatus(1);
        cM.deposito(5100000);
        assertTrue(cM.getSaldo()==(5100000 *1.01) && cM.getStatus()==2);
    }

    @Test
    public void Status2Deposito() throws INVALID_OPER_EXCEPTION{
        cM.setStatus(2);
        cM.deposito(10000);
        assertTrue(cM.getSaldo()== 10000 *1.025);
    }
     
    @Test
    public void ThrowInStatus1() throws INVALID_OPER_EXCEPTION{
        cM.setStatus(1);
        assertThrows(INVALID_OPER_EXCEPTION.class, () -> cM.deposito(-15000));
    }

    @Test
    public void ThrowInStatus2() throws INVALID_OPER_EXCEPTION{
        cM.setStatus(2);
        assertThrows(INVALID_OPER_EXCEPTION.class, () -> cM.deposito(-1500));
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
    public void retiradaValorMenor0Test() throws INVALID_OPER_EXCEPTION{
        assertThrows(INVALID_OPER_EXCEPTION.class, () -> cM.retirada(-1));
    }

    @Test
    public void retiradaSaldoMenosValorMenor0Test() throws INVALID_OPER_EXCEPTION{
        cM.deposito(10000);
        assertThrows(INVALID_OPER_EXCEPTION.class, () -> cM.retirada(10001));
    }

    @Test
    public void retiradaStatusIgual0Test() throws INVALID_OPER_EXCEPTION{
        cM.deposito(10000);
        cM.retirada(5000);
        assertEquals(cM.getSaldo(), 5000);
    }

    @Test
    public void retiradaSaldoMenosValorMaiorIgual25000StatusIgual1Test() throws INVALID_OPER_EXCEPTION{
        cM.deposito(51000);
        cM.retirada(25000);
        assertTrue(cM.getStatus()==1);
    }

    @Test
    public void retiradaSaldoMenosValorMenor25000StatusIgual1Test() throws INVALID_OPER_EXCEPTION{
        cM.deposito(51000);
        cM.retirada(27000);
        assertTrue(cM.getStatus()==0);
    }

    @Test
    public void retiradaSaldoMenosValorMaiorIgual100000StatusIgual2Test() throws INVALID_OPER_EXCEPTION{
        cM.deposito(200000);
        cM.setStatus(2);
        cM.retirada(99000);
        assertTrue(cM.getStatus()==2);
    }

    @Test
    public void retiradaSaldoMenosValorMenor100000StatusIgual2Test() throws INVALID_OPER_EXCEPTION{
        cM.deposito(200000);
        cM.setStatus(2);
        cM.retirada(151000);
        assertTrue(cM.getStatus()==1);
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