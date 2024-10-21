package py.edu.uc.lp3.apirest;

public class Fusil extends ArmasDeFuego{
    protected String tipoFusil;
    protected String modoDisparo;

    public Fusil(int carga, int tipoMunicion, float cadencia) {
        super(carga, tipoMunicion, cadencia);
    }
}
