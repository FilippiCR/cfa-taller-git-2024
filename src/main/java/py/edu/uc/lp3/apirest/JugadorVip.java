package py.edu.uc.lp3.apirest;

import java.util.Date;

public class JugadorVip extends Jugador{
    protected Date fechaFinSubscripcion;
    protected float descuentos;
    protected int bonoExp;
    protected String nivelVIP;
    protected int monedasPremiumDiarias;

    public JugadorVip(String username, String password, String email) {
        super(username, password, email);
    }
}
