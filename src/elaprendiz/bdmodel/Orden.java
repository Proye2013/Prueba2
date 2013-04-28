package elaprendiz.bdmodel;

import java.util.Date;

/**
 *
 * @author El APRENDIZ www.elaprendiz.net63.net
 */

public class Orden extends GenericModel{
    private Integer nroOrdern;
    private Date fecha;
    private Integer norCuenta;
    private String tipo;
    private String inspector;
    private String motivoCorte;
    private Cliente cliente;

    public Orden(Integer nroOrdern, Date fecha, Integer norCuenta, String tipo, String inspector, String motivoCorte) {
        this.nroOrdern = nroOrdern;
        this.fecha = fecha;
        this.norCuenta = norCuenta;
        this.tipo = tipo;
        this.inspector = inspector;
        this.motivoCorte = motivoCorte;
    }

    public Orden(Date fecha, Integer norCuenta, String tipo, String inspector, String motivoCorte) {
        this.fecha = fecha;
        this.norCuenta = norCuenta;
        this.tipo = tipo;
        this.inspector = inspector;
        this.motivoCorte = motivoCorte;
    }

    public Orden() {
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector;
    }

    public String getMotivoCorte() {
        return motivoCorte;
    }

    public void setMotivoCorte(String motivoCorte) {
        this.motivoCorte = motivoCorte;
    }

    public Integer getNorCuenta() {
        return norCuenta;
    }

    public void setNorCuenta(Integer norCuenta) {
        this.norCuenta = norCuenta;
    }

    public Integer getNroOrdern() {
        return nroOrdern;
    }

    public void setNroOrdern(Integer nroOrdern) {
        this.nroOrdern = nroOrdern;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
