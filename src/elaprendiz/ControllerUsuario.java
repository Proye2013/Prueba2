package elaprendiz;

import elaprendiz.bdmodel.GenericModel;
import elaprendiz.bdmodel.Usuario;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import prykualiatl.bd_manager;

/**
 *
 * @author El APRENDIZ www.elaprendiz.net63.net
 */
public class ControllerUsuario extends AbstractController{
    
    private String usuario;
    private String pass;    
    private Usuario user;;

    public ControllerUsuario(String usuario, String pass) {
        this.dbManager = new bd_manager();        
        this.usuario = usuario;
        this.pass = GenericModel.encriptarPassword(pass);       
        sql = "select ClvUsuario,Usuario,Contraseña,Archivo,IniciarSesion,CerrarSesion,RegistroDeUsuario,SalirDeAplicacion,Clientes,RegistroDeClientes,Pagos,RegistroDePagos,EmisionesOrdenes,Reportes,ReporteDeIngresos,ReporteDePagos,ReporteDeOrdenes,Herramientas,Calculadora,RespaldarBd,RestaurarBd,Ayuda,MostrarAyuda,AcercaDe from tblusuario where Usuario='" + this.usuario + "' and Contraseña='" + this.pass+ "'";
    }

    public ControllerUsuario() {
         this.dbManager = new bd_manager(); 
    }
    
    
    
    public boolean getDatos() throws Exception
    {
        rs = dbManager.consultar(sql);
        if(rs.next())
        {
            user = new Usuario(usuario,pass);
            user.setArchivo(rs.getBoolean(4));
            user.setIniciarSesion(rs.getBoolean(5));
            user.setCerrarSesion(rs.getBoolean(6));
            user.setRegistroDeUsuario(rs.getBoolean(7));
            user.setSalirDeAplicacion(rs.getBoolean(8));
            
            user.setClientes(rs.getBoolean(9));
            user.setRegistroDeClientes(rs.getBoolean(10));
            
            user.setPagos(rs.getBoolean(11));
            user.setRegistroDePagos(rs.getBoolean(12));
            user.setEmisionesOrdenes(rs.getBoolean(13));
            
            user.setReportes(rs.getBoolean(14));
            user.setReporteDeIngresos(rs.getBoolean(15));
            user.setReporteDePagos(rs.getBoolean(16));
            user.setReporteDeOrdenes(rs.getBoolean(17));
            
            user.setHerramientas(rs.getBoolean(18));
            user.setCalculadora(rs.getBoolean(19));
            user.setRestaurarBd(rs.getBoolean(20));
            user.setRespaldarBd(rs.getBoolean(21));
            
            user.setAyuda(rs.getBoolean(22));
            user.setAcercaDe(rs.getBoolean(23));
            user.setMostrarAyuda(rs.getBoolean(24));
            rs.close();
            return true;
        }
        return false;
    } 
    
    public List getRegistros() throws Exception
    {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        sql = "select * from tblusuario";
        rs = dbManager.consultar(sql);
        while(rs.next())
        {
            user = new Usuario(rs.getString(2),GenericModel.desEncriptarPassword(rs.getString(3)));
            user.setClvUsuario(rs.getInt(1));
            user.setArchivo(rs.getBoolean(4));
            user.setIniciarSesion(rs.getBoolean(5));
            user.setCerrarSesion(rs.getBoolean(6));
            user.setRegistroDeUsuario(rs.getBoolean(7));
            user.setSalirDeAplicacion(rs.getBoolean(8));
            
            user.setClientes(rs.getBoolean(9));
            user.setRegistroDeClientes(rs.getBoolean(10));
            
            user.setPagos(rs.getBoolean(11));
            user.setRegistroDePagos(rs.getBoolean(12));
            user.setEmisionesOrdenes(rs.getBoolean(13));
            
            user.setReportes(rs.getBoolean(14));
            user.setReporteDeIngresos(rs.getBoolean(15));
            user.setReporteDePagos(rs.getBoolean(16));
            user.setReporteDeOrdenes(rs.getBoolean(17));
            
            user.setHerramientas(rs.getBoolean(18));
            user.setCalculadora(rs.getBoolean(19));
            user.setRestaurarBd(rs.getBoolean(20));
            user.setRespaldarBd(rs.getBoolean(21));
            
            user.setAyuda(rs.getBoolean(22));
            user.setAcercaDe(rs.getBoolean(23));
            user.setMostrarAyuda(rs.getBoolean(24));
            usuarios.add(user);
        }
        return usuarios;
    }
    

   

    public String getPass() {
        return GenericModel.desEncriptarPassword(pass);
    }

    public void setPass(String pass) {
        this.pass = GenericModel.encriptarPassword(pass);
    }

   

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    
    public static Integer getUltimoRegistro() throws Exception
    {
             int claveclientess=0;
        
               bd_manager obj = new bd_manager();
               String sql;
               ResultSet rs;
               sql=("select ClvUsuario FROM tblusuario order by ClvUsuario desc limit 1");
               rs= obj.consultar(sql);
             
               if(rs.next())
               {
                   claveclientess=rs.getInt(1);
                   return new Integer(claveclientess+1);                      
               }
                 
           
        
        return null;        
    }
    
    public void guardarRegistro(GenericModel usr1) throws Exception
    {
        Usuario usr = (Usuario)usr1;
        sql = ("INSERT INTO tblusuario Values (" + usr.getClvUsuario()+ ",'" + usr.getUsuario()+ "','" + 
                GenericModel.encriptarPassword(usr.getPassword())+ "'," +
                usr.getArchivo() + "," + 
                usr.getIniciarSesion() + "," + 
                usr.getCerrarSesion() + "," + 
                usr.getRegistroDeUsuario() + "," + 
                usr.getSalirDeAplicacion() + "," + 
                usr.getClientes() + "," + 
                usr.getRegistroDeClientes() + "," + 
                usr.getPagos() + "," + 
                usr.getRegistroDePagos() + "," + 
                usr.getEmisionesOrdenes() + "," + 
                usr.getReportes() + "," + 
                usr.getReporteDeIngresos() + "," + 
                usr.getReporteDePagos()+ "," + 
                usr.getReporteDeOrdenes() + "," + 
                usr.getHerramientas() + "," + 
                usr.getCalculadora() + "," + 
                usr.getRespaldarBd() + "," + 
                usr.getRestaurarBd() + "," + 
                usr.getAyuda() + "," + 
                usr.getMostrarAyuda() + "," + 
                usr.getAcercaDe() + ")");
        dbManager.AbcProye(sql);        
    }
    
    public void actualizarRegistro(GenericModel usr1)throws Exception
    {
        Usuario usr = (Usuario)usr1;
        sql = ("UPDATE tblusuario SET Usuario='" + usr.getUsuario() + 
                "',Contraseña='" + GenericModel.encriptarPassword(usr.getPassword()) + 
                "',Archivo=" + usr.getArchivo() + 
                ",IniciarSesion=" + usr.getIniciarSesion() +
                ",CerrarSesion=" + usr.getCerrarSesion() + 
                ",RegistroDeUsuario=" + usr.getRegistroDeUsuario() +
                ",SalirDeAplicacion=" + usr.getSalirDeAplicacion() +
                ",Clientes=" + usr.getClientes() + 
                ",RegistroDeClientes=" + usr.getRegistroDeClientes() +
                ",Pagos=" + usr.getPagos() + 
                ",RegistroDePagos=" + usr.getRegistroDePagos() +
                ",EmisionesOrdenes=" + usr.getEmisionesOrdenes() + 
                ",Reportes=" + usr.getReportes() + 
                ",ReporteDeIngresos=" + usr.getReporteDeIngresos() + 
                ",ReporteDePagos=" + usr.getReporteDePagos() + 
                ",ReporteDeOrdenes=" + usr.getReporteDeOrdenes() + 
                ",Herramientas=" + usr.getHerramientas() + 
                ",Calculadora=" + usr.getCalculadora() + 
                ",RespaldarBd=" + usr.getRespaldarBd() + 
                ",RestaurarBd=" + usr.getRestaurarBd() + 
                ",Ayuda=" + usr.getAyuda() + 
                ",MostrarAyuda=" + usr.getMostrarAyuda() +
                ",AcercaDe=" + usr.getAcercaDe() + 
                " where ClvUsuario=" + usr.getClvUsuario() + "");
                dbManager.AbcProye(sql);
    }
    
    public void eliminarRegistro(GenericModel usr1) throws Exception
    {
        Usuario usr = (Usuario)usr1;
        sql=("DELETE  FROM tblusuario WHERE ClvUsuario='" + usr.getClvUsuario() + "'");
        dbManager.AbcProye(sql);
    }

//    @Override
//    public GenericModel getRegistro(Integer code) throws Exception {
//        return null;
//    }

   
    
    
}
