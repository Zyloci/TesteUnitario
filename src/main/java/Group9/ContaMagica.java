package Group9;

public class ContaMagica {
    public static final int SILVER = 0;
    public static final int GOLD = 1;
    public static final int PLATINUM = 2;
    public static double saldo;
    public static int status;

    public ContaMagica(){
        saldo = 0;
        status = 0;
    }

    public double getSaldo(){
        return saldo;   
    }
	
    public int getStatus(){
        return status;
    } 

    public void deposito(int valor) throws INVALID_OPER_EXCEPTION{
        switch(status){
            case 0:
                if(valor < 0)
                    {throw new INVALID_OPER_EXCEPTION("Morreu");}
                saldo = saldo + valor;
                if(saldo > 49999)
                    {status = 1;}    
                break;
            case 1:
                if(valor < 0)
                    {throw new INVALID_OPER_EXCEPTION("Morreu");}
                saldo = saldo + (valor * 1.01);
                if(saldo > 199999)
                    {status = 2;}
                break;
            case 2:
                if(valor < 0)
                    {throw new INVALID_OPER_EXCEPTION("Morreu");}
                saldo = saldo + (valor * 1.025);
                break;
        }
    }

    public void retirada(int valor) throws INVALID_OPER_EXCEPTION{
        if((saldo - valor) >= 0 && valor > 0)
            {saldo = saldo - valor;}
        else
            {throw new INVALID_OPER_EXCEPTION("Morreu");}
        if(status == 2 && saldo < 100000)
            {status = 1;}
        else{
            if(status == 1 && saldo < 25000)
                {status = 0;}
        }
    }

    public void setStatus(int valor) {
        status=valor;
    }
}