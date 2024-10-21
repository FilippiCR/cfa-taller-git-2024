package py.edu.uc.lp3.apirest;

public class Empleado extends Usuario{
    private boolean accesoModeracion;
    private String cargo;
    private boolean accesoPrecios;

    public Empleado(String username, String password, String email) {
        super(username, password, email);
    }
}
