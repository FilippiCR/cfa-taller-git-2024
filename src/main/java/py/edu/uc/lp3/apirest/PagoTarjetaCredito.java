package py.edu.uc.lp3.apirest;

public class PagoTarjetaCredito extends PagoMonedaReal{
    protected int numeroTarjeta;
    protected String nombreTitular;
    protected int cvv;
    protected float limiteCredito;
}
