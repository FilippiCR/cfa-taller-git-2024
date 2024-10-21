package py.edu.uc.lp3.apirest;

// Clase para representar armas de fuego
public class ArmasDeFuego extends Armas {
    protected int carga;
    protected int tipoMunicion;

    public ArmasDeFuego(int carga, int tipoMunicion, float cadencia) {
        super();
        this.carga = carga;
        this.tipoMunicion = tipoMunicion;
        this.cadencia = cadencia;
    }
    public ArmasDeFuego(int nivelMinimoRequerido, int precioMonedaReal) {
        super();
        this.nivelMinimoRequerido = nivelMinimoRequerido;
        this.precioMonedaReal = precioMonedaReal;
    }

    protected ArmasDeFuego() {
        super();
    }


    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getTipoMunicion() {
        return tipoMunicion;
    }

    public void setTipoMunicion(int tipoMunicion) {
        this.tipoMunicion = tipoMunicion;
    }

    public float getCadencia() {
        return cadencia;
    }

    public void setCadencia(float cadencia) {
        this.cadencia = cadencia;
    }

    protected float cadencia;

    // ... constructores, getters y setters ...
}
