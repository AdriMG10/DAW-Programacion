package practica3;

import practica3.persona.Persona;

public class Alumno extends Persona {
    private String nombre;
    private String apellidos;
    private Integer edad;
    private Boolean repetidor;
    private Float notamed;
    private String correo;
    private Direccion direccion;

    void imprimeAlumno() {
        System.out.println(nombre + apellidos + " tiene " + edad + " años.");
    }

    Alumno() {
    }

    Alumno(String nombre, String apellidos, Integer edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Boolean getRepetidor() {
        return repetidor;
    }

    public void setRepetidor(Boolean repetidor) {
        this.repetidor = repetidor;
    }

    public Float getNotamed() {
        return notamed;
    }

    public void setNotamed(Float notamed) {
        this.notamed = notamed;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(Direccion direccion1) {
    }
}
