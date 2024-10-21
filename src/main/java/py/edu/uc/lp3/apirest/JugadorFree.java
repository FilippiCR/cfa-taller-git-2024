package py.edu.uc.lp3.apirest;

import java.util.List;

public class JugadorFree extends Jugador{
    protected boolean accesoLimitado;
    protected int monedasDiarias;
    protected List<Skin> skinsDisponibles;

    public JugadorFree(String username, String password, String email) {
        super(username, password, email);
    }
}

