package py.edu.uc.lp3.apirest;

public class Vendible {
    protected String nombre;
    protected double precioMonedaJuego;
    protected String descripcion;
    protected int precioMonedaReal;



    public String getNombre() {
        return nombre;
    }

    public double getPrecioMonedaJuego() {
        return precioMonedaJuego;
    }

    public void setPrecioMonedaJuego(double precioMonedaJuego) {
        this.precioMonedaJuego = precioMonedaJuego;
    }

    public int getPrecioMonedaReal() {
        return precioMonedaReal;
    }

    public void setPrecioMonedaReal(int precioMonedaReal) {
        this.precioMonedaReal = precioMonedaReal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precioMonedaJuego;
    }

    public void setPrecio(double precio) {
        this.precioMonedaJuego = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
