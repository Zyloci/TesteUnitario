package Group9;

public class ContaMagica {
    public static final int SILVER = 0;
    public static final int GOLD = 1;
    public static final int PLATINUM = 2;
    public static double saldo;
    public static int status;

    public double getSaldo(){
        return saldo;   
    }
	
    public int getStatus(){
        return status;
    } 

    public void deposito(int valor) throws INVALID_OPER_EXCEPTION{
        
    }

    //void retirada(int valor) throws INVALID_OPER_EXCEPTION;
}