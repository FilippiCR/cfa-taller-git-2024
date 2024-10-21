package py.edu.uc.lp3.apirest;

// Clase para representar subfusiles
public class Subfusil extends ArmasDeFuego {
    protected String tipoSubfusil;
    protected float reduccionDamageDistancia;
    // ... constructores, getters y setters ...

    public Subfusil(int nivelMinimoRequerido, int precioMonedaReal) {
        super();
        this.nivelMinimoRequerido = nivelMinimoRequerido;
        this.precioMonedaReal = precioMonedaReal;
        this.descripcion = "Subfusil de corto alcance";
        this.nombre = "subfusil MP7";
        this.precio = 1700;
        this.carga = 30;
    }

}