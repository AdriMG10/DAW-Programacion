package org.ieslosremedios.daw1.prog.ut4.practica4.apartado6;

public class Empleado {

    private int codigo;
    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int anioNacimiento;
    private boolean reduccionJornada;

    public Empleado(int codigo, String dni, String nombre, String apellido1, String apellido2, int anioNacimiento, boolean reduccionJornada) {
        this.codigo = codigo;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.anioNacimiento = anioNacimiento;
        this.reduccionJornada = reduccionJornada;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getAnoNacimiento() {
        return anioNacimiento;
    }

    public void setAnoNacimiento(int anoNacimiento) {
        this.anioNacimiento = anoNacimiento;
    }

    public boolean getReduccionJornada() {
        return reduccionJornada;
    }

    public void setReduccionJornada(boolean reduccionJornada) {
        this.reduccionJornada = reduccionJornada;
    }
}