package py.edu.uc.lp3.apirest;

// Clase para representar subfusiles
public class Subfusil extends ArmasDeFuego {
    private int precioDinero;
    private int nivelMinimoRequerido;

    // ... constructores, getters y setters ...


    public int getPrecioDinero() {
        return precioDinero;
    }

    public void setPrecioDinero(int precioDinero) {
        this.precioDinero = precioDinero;
    }

    public int getNivelMinimoRequerido() {
        return nivelMinimoRequerido;
    }

    public void setNivelMinimoRequerido(int nivelMinimoRequerido) {
        this.nivelMinimoRequerido = nivelMinimoRequerido;
    }

    public Subfusil(int nivelMinimoRequerido, int precioDinero) {
        this.nivelMinimoRequerido = nivelMinimoRequerido;
        this.precioDinero = precioDinero;
        this.descripcion = "Subfusil de corto alcance";
        this.nombre = "subfusil MP7";
        this.precio = 1700;
        this.carga = 30;
    }

}