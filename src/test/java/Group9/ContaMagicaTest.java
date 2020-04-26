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

    


}