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
        assertTrue(cM.getSaldo()<50000);
    }

    @Test
    public void SaldoMaior50000Deposito() throws INVALID_OPER_EXCEPTION{
        assertTrue(cM.getSaldo()>50000);
    }

    @Test
    public void SaldoMenor200000Deposito() throws INVALID_OPER_EXCEPTION{
        assertTrue(cM.getSaldo()<200000);
    }

    @Test
    public void SaldoMaior200000Deposito() throws INVALID_OPER_EXCEPTION{
        assertTrue(cM.getSaldo()>200000);
    }

    @Test
    public void Status2() throws INVALID_OPER_EXCEPTION{
        assertTrue(cM.getStatus()==2);
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

    


}