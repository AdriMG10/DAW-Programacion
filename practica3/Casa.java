package practica3;

public class Casa {
    private Integer precio;
    private Character calEnerg;
    private String refCatas;
    private final Integer iva = 21;
    private final Integer ivared = 16;
    private Direccion direccion;

    Integer calculoConIva(Integer precio) {
        Integer resul;
        resul = precio + (precio*(getIva() /100));
        return resul;
    }

    Integer calculoConIvaRed(Integer precio) {
        Integer resulred;
        resulred = precio + (precio*(getIvared() /100));
        return resulred;
    }

    void imprime() {
        System.out.println(getRefCatas());
        System.out.println(getPrecio());
        System.out.println(calculoConIva(getPrecio()));
        System.out.println(calculoConIvaRed(getPrecio()));
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Character getCalEnerg() {
        return calEnerg;
    }

    public void setCalEnerg(Character calEnerg) {
        this.calEnerg = calEnerg;
    }

    public String getRefCatas() {
        return refCatas;
    }

    public void setRefCatas(String refCatas) {
        this.refCatas = refCatas;
    }

    public Integer getIva() {
        return iva;
    }

    public Integer getIvared() {
        return ivared;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
