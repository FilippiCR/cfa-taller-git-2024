package py.edu.uc.lp3.apirest;

// Clase para representar armas en general
public class Armas extends Vendible {
    protected int nivelMinimoRequerido;
    protected int damage;

    public Armas(int nivelMinimoRequerido, int precioMonedaReal) {
        this.nivelMinimoRequerido = nivelMinimoRequerido;
        this.precioMonedaReal = precioMonedaReal;
    }

    public Armas() {

    }

    public int getNivelMinimoRequerido() {
        return nivelMinimoRequerido;
    }

    public void setNivelMinimoRequerido(int nivelMinimoRequerido) {
        this.nivelMinimoRequerido = nivelMinimoRequerido;
    }

    public int getPrecioMonedaReal() {
        return precioMonedaReal;
    }

    public void setPrecioMonedaReal(int precioMonedaReal) {
        this.precioMonedaReal = precioMonedaReal;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    public void setPrecioMonedaJuego(int precioMonedaJuego) {
        this.precioMonedaJuego = precioMonedaJuego;
    }
// ... constructores, getters y setters ...
}