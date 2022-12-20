package org.ieslosremedios.daw1.prog.ut3.actividad31comher;

public class Premium extends Socio {
    private String fechaContrato;
    private String invitados;

    public Premium() {
    }

    public Premium(String fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public String getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(String fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public String getInvitados() {
        return invitados;
    }

    public void setInvitados(String invitados) {
        this.invitados = invitados;
    }
}
