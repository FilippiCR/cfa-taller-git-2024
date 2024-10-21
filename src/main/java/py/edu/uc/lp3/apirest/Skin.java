package py.edu.uc.lp3.apirest;

// Clase para representar skins en general
public class Skin extends Cosmetico {
    protected String tipoSkin;
    protected long patron;
    protected String archivoAnimacion;
    protected boolean animacion;

    public String getTipoSkin() {
        return tipoSkin;
    }

    public void setTipoSkin(String tipoSkin) {
        this.tipoSkin = tipoSkin;
    }

    public String getArchivoAnimacion() {
        return archivoAnimacion;
    }

    public void setArchivoAnimacion(String archivoAnimacion) {
        this.archivoAnimacion = archivoAnimacion;
    }

    public long getPatron() {
        return patron;
    }

    public void setPatron(long patron) {
        this.patron = patron;
    }

    public boolean isAnimacion() {
        return animacion;
    }

    public void setAnimacion(boolean animacion) {
        this.animacion = animacion;
    }
}
