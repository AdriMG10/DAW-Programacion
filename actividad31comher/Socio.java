package org.ieslosremedios.daw1.prog.ut3.actividad31comher;

public class Socio {
    private String nombre;
    private String apellidos;
    private String codigosocio;
    private String email;
    private Direccion direccion;

    public Socio() {
    }

    public Socio(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCodigosocio() {
        return codigosocio;
    }

    public void setCodigosocio(String codigosocio) {
        this.codigosocio = codigosocio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
