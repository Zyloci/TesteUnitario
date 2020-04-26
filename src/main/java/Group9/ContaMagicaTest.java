package Group9;

import static org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Test;


public class ContaMagicaTest extends ContaMagica {
    private ContaMagica CM; 

    @BeforeEach
    public void initialize() {
        this.CM = new ContaMagica();
    }

    @Test
    public void getSaldo() {
        ContaMagica CM = new ContaMagica();
        double saldo = CM.getSaldo();
        assertTrue(saldo==0);
    }

}