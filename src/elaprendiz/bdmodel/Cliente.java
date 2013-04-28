package elaprendiz.bdmodel;

import java.util.Date;

/**
 *
 * @author El APRENDIZ www.elaprendiz.net63.net
 */
public class Cliente extends GenericModel{
    
    private Integer nroCuenta;
    private String nombre;
    private String direccion;
    private Double telefono;
    private String rfc;
    private String colonia;
    private String comunidad;
    private String municipio;
    private String codPostal;
    private String tarifa;
    private Date fechaRegistro;

    public Cliente(Integer nroCuenta, String nombre, String direccion, Double telefono, String rfc, String colonia, String comunidad, String municipio, String codPostal, String tarifa, Date fechaRegistro) {
        this.nroCuenta = nroCuenta;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.rfc = rfc;
        this.colonia = colonia;
        this.comunidad = comunidad;
        this.municipio = municipio;
        this.codPostal = codPostal;
        this.tarifa = tarifa;
        this.fechaRegistro = fechaRegistro;
    }

    public Cliente(String nombre, String direccion, Double telefono, String rfc, String colonia, String comunidad, String municipio, String codPostal, String tarifa, Date fechaRegistro) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.rfc = rfc;
        this.colonia = colonia;
        this.comunidad = comunidad;
        this.municipio = municipio;
        this.codPostal = codPostal;
        this.tarifa = tarifa;
        this.fechaRegistro = fechaRegistro;
    }

    public Cliente() {
    }

    
    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getComunidad() {
        return comunidad;
    }

    public void setComunidad(String comunidad) {
        this.comunidad = comunidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(Integer nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public Double getTelefono() {
        return telefono;
    }

    public void setTelefono(Double telefono) {
        this.telefono = telefono;
    }   
    
    
}
