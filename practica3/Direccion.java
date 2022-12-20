package practica3;

public class Direccion {
    private String calle;
    private Integer num;
    private Integer piso;
    private String letra;
    private Integer codPos;
    private String localidad;
    private String provincia;

    void direccionCompleta() {
        System.out.println("Calle " + getCalle() + ", " + getNum() + ", " + getPiso() + "º" + getLetra() + ". "
                + getCodPos() + " " + getLocalidad() + " (" + getProvincia() + ")");
    }

    void direccionCompleta(String calle, String localidad) {
        System.out.println("Calle " + getCalle() + " " + getLocalidad());
    }

    public Direccion() {
    }

    public Direccion(String calle, Integer num, Integer piso, String letra, Integer codPos, String localidad, String provincia) {
        this.calle = calle;
        this.num = num;
        this.piso = piso;
        this.letra = letra;
        this.codPos = codPos;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    public Direccion(String calle, Integer num, Integer piso, String letra, String localidad) {
        this.calle = calle;
        this.num = num;
        this.piso = piso;
        this.letra = letra;
        this.localidad = localidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public Integer getCodPos() {
        return codPos;
    }

    public void setCodPos(Integer codPos) {
        this.codPos = codPos;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
