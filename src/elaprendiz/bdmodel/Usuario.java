package elaprendiz.bdmodel;

/**
 *
 * @author El APRENDIZ www.elaprendiz.net63.net
 */

public class Usuario extends GenericModel{
  private Integer clvUsuario;
  private String usuario;
  private String password;//contrraseña
  private Boolean archivo; 
  private Boolean IniciarSesion;
  private Boolean cerrarSesion;
  private Boolean registroDeUsuario; 
  private Boolean salirDeAplicacion;
  private Boolean clientes; 
  private Boolean registroDeClientes; 
  private Boolean pagos; 
  private Boolean registroDePagos; 
  private Boolean emisionesOrdenes; 
  private Boolean reportes; 
  private Boolean reporteDeIngresos; 
  private Boolean reporteDePagos; 
  private Boolean reporteDeOrdenes; 
  private Boolean herramientas; 
  private Boolean calculadora; 
  private Boolean respaldarBd; 
  private Boolean restaurarBd; 
  private Boolean ayuda; 
  private Boolean mostrarAyuda; 
  private Boolean acercaDe;

    public Usuario(Integer clvUsuario, String usuario, String password) {
        this.clvUsuario = clvUsuario;
        this.usuario = usuario;
        this.password = password;
    }

    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public Usuario() {
    }
    
    public Boolean getIniciarSesion() {
        return IniciarSesion;
    }

    public void setIniciarSesion(Boolean IniciarSesion) {
        this.IniciarSesion = IniciarSesion;
    }

    public Boolean getAcercaDe() {
        return acercaDe;
    }

    public void setAcercaDe(Boolean acercaDe) {
        this.acercaDe = acercaDe;
    }

    public Boolean getArchivo() {
        return archivo;
    }

    public void setArchivo(Boolean archivo) {
        this.archivo = archivo;
    }

    public Boolean getAyuda() {
        return ayuda;
    }

    public void setAyuda(Boolean ayuda) {
        this.ayuda = ayuda;
    }

    public Boolean getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(Boolean calculadora) {
        this.calculadora = calculadora;
    }

    public Boolean getCerrarSesion() {
        return cerrarSesion;
    }

    public void setCerrarSesion(Boolean cerrarSesion) {
        this.cerrarSesion = cerrarSesion;
    }

    public Boolean getClientes() {
        return clientes;
    }

    public void setClientes(Boolean clientes) {
        this.clientes = clientes;
    }

    public Integer getClvUsuario() {
        return clvUsuario;
    }

    public void setClvUsuario(Integer clvUsuario) {
        this.clvUsuario = clvUsuario;
    }

    public Boolean getEmisionesOrdenes() {
        return emisionesOrdenes;
    }

    public void setEmisionesOrdenes(Boolean emisionesOrdenes) {
        this.emisionesOrdenes = emisionesOrdenes;
    }

    public Boolean getHerramientas() {
        return herramientas;
    }

    public void setHerramientas(Boolean herramientas) {
        this.herramientas = herramientas;
    }

    public Boolean getMostrarAyuda() {
        return mostrarAyuda;
    }

    public void setMostrarAyuda(Boolean mostrarAyuda) {
        this.mostrarAyuda = mostrarAyuda;
    }

    public Boolean getPagos() {
        return pagos;
    }

    public void setPagos(Boolean pagos) {
        this.pagos = pagos;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getRegistroDeClientes() {
        return registroDeClientes;
    }

    public void setRegistroDeClientes(Boolean registroDeClientes) {
        this.registroDeClientes = registroDeClientes;
    }

    public Boolean getRegistroDePagos() {
        return registroDePagos;
    }

    public void setRegistroDePagos(Boolean registroDePagos) {
        this.registroDePagos = registroDePagos;
    }

    public Boolean getRegistroDeUsuario() {
        return registroDeUsuario;
    }

    public void setRegistroDeUsuario(Boolean registroDeUsuario) {
        this.registroDeUsuario = registroDeUsuario;
    }

    public Boolean getReporteDeIngresos() {
        return reporteDeIngresos;
    }

    public void setReporteDeIngresos(Boolean reporteDeIngresos) {
        this.reporteDeIngresos = reporteDeIngresos;
    }

    public Boolean getReporteDeOrdenes() {
        return reporteDeOrdenes;
    }

    public void setReporteDeOrdenes(Boolean reporteDeOrdenes) {
        this.reporteDeOrdenes = reporteDeOrdenes;
    }

    public Boolean getReporteDePagos() {
        return reporteDePagos;
    }

    public void setReporteDePagos(Boolean reporteDePagos) {
        this.reporteDePagos = reporteDePagos;
    }

    public Boolean getReportes() {
        return reportes;
    }

    public void setReportes(Boolean reportes) {
        this.reportes = reportes;
    }

    public Boolean getRespaldarBd() {
        return respaldarBd;
    }

    public void setRespaldarBd(Boolean respaldarBd) {
        this.respaldarBd = respaldarBd;
    }

    public Boolean getRestaurarBd() {
        return restaurarBd;
    }

    public void setRestaurarBd(Boolean restaurarBd) {
        this.restaurarBd = restaurarBd;
    }

    public Boolean getSalirDeAplicacion() {
        return salirDeAplicacion;
    }

    public void setSalirDeAplicacion(Boolean salirDeAplicacion) {
        this.salirDeAplicacion = salirDeAplicacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
