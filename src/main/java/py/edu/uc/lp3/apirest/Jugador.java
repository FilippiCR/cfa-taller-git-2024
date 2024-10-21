package py.edu.uc.lp3.apirest;

import java.util.List;

public class Jugador extends Usuario {
    protected int nivel;
    protected long experiencia;
    protected int partidasGanadas;
    protected int partidasPerdidas;
    protected List<Jugador> amigos;
    protected long monedaJuego;
    protected long monedaReal;

    public Jugador(String username, String password, String email) {
        super(username, password, email);
    }
}

