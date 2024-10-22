package py.edu.uc.lp3.apirest;

import java.util.Date;

public class Persona {
    private Long id;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;

    // Constructor por defecto (opcional, si tiene sentido para tu entidad)
    public Persona() {
    }

    // Constructor con todos los atributos
    public Persona(Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Constructor con algunos atributos (ejemplo)
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Long getId() {
        return id;

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;

    }

}
