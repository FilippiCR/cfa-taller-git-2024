package py.edu.uc.lp3.apirest;

// Clase para representar armas melee
public class Melee extends Armas {
    protected float longitud;
    protected String tipoMelee;
    protected String velocidadAtaque;

    public Melee(int nivelMinimoRequerido, int precioMonedaReal) {
        super(nivelMinimoRequerido, precioMonedaReal);
    }
}
