package sesion3A;

import java.util.List;

public class Cuenta {
	String mNumero; 
    String nTitular; 
    List <Movimiento> mMovimientos;
    double saldo=0;
    
    public void ingresar(double x)
    {
    	saldo=+x;
    }
    
    public double getSaldo()
    {
    	return saldo;
    }

}
