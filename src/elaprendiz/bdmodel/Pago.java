package elaprendiz.bdmodel;

import java.util.Date;

/**
 *
 * @author El APRENDIZ www.elaprendiz.net63.net
 */

public class Pago extends GenericModel{
    private Integer civFolio;
    private Integer norCuenta;
    private String fechaCubierta;
    private Integer mesesTranscurridos;
    private String fechaPago;
    private Float rezago;
    private Float pagoCalculado;
    private Float recargo;
    private Float total;
    private Date fechaRegistro;
    private Cliente cliente;

    public Pago(Integer civFolio, Integer norCuenta, String fechaCubierta, Integer mesesTranscurridos, String fechaPago, Float rezago, Float pagoCalculado, Float recargo, Float total, Date fechaRegistro, Cliente cliente) {
        this.civFolio = civFolio;
        this.norCuenta = norCuenta;
        this.fechaCubierta = fechaCubierta;
        this.mesesTranscurridos = mesesTranscurridos;
        this.fechaPago = fechaPago;
        this.rezago = rezago;
        this.pagoCalculado = pagoCalculado;
        this.recargo = recargo;
        this.total = total;
        this.fechaRegistro = fechaRegistro;
        this.cliente = cliente;
    }

    public Pago(Integer norCuenta, String fechaCubierta, Integer mesesTranscurridos, String fechaPago, Float rezago, Float pagoCalculado, Float recargo, Float total, Date fechaRegistro, Cliente cliente) {
        this.norCuenta = norCuenta;
        this.fechaCubierta = fechaCubierta;
        this.mesesTranscurridos = mesesTranscurridos;
        this.fechaPago = fechaPago;
        this.rezago = rezago;
        this.pagoCalculado = pagoCalculado;
        this.recargo = recargo;
        this.total = total;
        this.fechaRegistro = fechaRegistro;
        this.cliente = cliente;
    }

    public Pago() {
    }
    
    

    public Integer getCivFolio() {
        return civFolio;
    }

    public void setCivFolio(Integer civFolio) {
        this.civFolio = civFolio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFechaCubierta() {
        return fechaCubierta;
    }

    public void setFechaCubierta(String fechaCubierta) {
        this.fechaCubierta = fechaCubierta;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getMesesTranscurridos() {
        return mesesTranscurridos;
    }

    public void setMesesTranscurridos(Integer mesesTranscurridos) {
        this.mesesTranscurridos = mesesTranscurridos;
    }

    public Integer getNorCuenta() {
        return norCuenta;
    }

    public void setNorCuenta(Integer norCuenta) {
        this.norCuenta = norCuenta;
    }

    public Float getPagoCalculado() {
        return pagoCalculado;
    }

    public void setPagoCalculado(Float pagoCalculado) {
        this.pagoCalculado = pagoCalculado;
    }

    public Float getRecargo() {
        return recargo;
    }

    public void setRecargo(Float recargo) {
        this.recargo = recargo;
    }

    public Float getRezago() {
        return rezago;
    }

    public void setRezago(Float rezago) {
        this.rezago = rezago;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }  
    
    
}
