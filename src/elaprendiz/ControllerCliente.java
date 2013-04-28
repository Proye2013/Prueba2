package elaprendiz;

import elaprendiz.bdmodel.Cliente;
import elaprendiz.bdmodel.GenericModel;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import prykualiatl.bd_manager;

/**
 *
 * @author El APRENDIZ www.elaprendiz.net63.net
 */
public class ControllerCliente extends AbstractController{

    public ControllerCliente() {
        this.dbManager = new bd_manager();
    }

    
    public static Integer getUltimoRegistro() throws Exception
    {
        int claveclientess=0;
        
               bd_manager obj = new bd_manager();
               String sql;
               ResultSet rs;
               sql=("select NoCuenta FROM tblcliente order by NoCuenta desc limit 1");
               rs= obj.consultar(sql);
             
               if(rs.next())
               {
                   claveclientess=rs.getInt(1);
                   return new Integer(claveclientess+1);                      
               }
                 
           
        
        return null;   
    }
    
    
    @Override
    public boolean getDatos() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getRegistros() throws Exception {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        sql = "select * from tblcliente";
        rs = dbManager.consultar(sql);
        Cliente cnt;
        while(rs.next())
        {
            cnt = new Cliente();
            cnt.setNroCuenta(rs.getInt(1));
            cnt.setNombre(rs.getString(2)); 
            cnt.setDireccion(rs.getString(3));
            cnt.setTelefono(rs.getDouble(4));
            cnt.setRfc(rs.getString(5)); 
            cnt.setColonia(rs.getString(6)); 
            cnt.setComunidad(rs.getString(7)); 
            cnt.setMunicipio(rs.getString(8)); 
            cnt.setCodPostal(rs.getString(9));
            cnt.setTarifa(rs.getString(10));
            cnt.setFechaRegistro(rs.getDate(11));
            clientes.add(cnt);
        }
        
        return clientes;
    }

    @Override
    public void guardarRegistro(GenericModel model) throws Exception {
        Cliente cnt = (Cliente)model;
        sql = ("INSERT INTO tblcliente (NoCuenta,Nombre,Direccion,Telefono,Rfc,Colonia,Comunidad,Municipio,CodigoPostal,Tarifa,FechaRegistro) Values (" + 
                cnt.getNroCuenta() + ",'" + 
                cnt.getNombre() + "','" + 
                cnt.getDireccion() + "'," + 
                cnt.getTelefono() + ",'" + 
                cnt.getRfc() + "','" + 
                cnt.getColonia() + "','" + 
                cnt.getComunidad() + "','" + 
                cnt.getMunicipio() + "'," + 
                cnt.getCodPostal() + ",'" + 
                cnt.getTarifa() +
                "','" + cnt.getFechaFormateada(cnt.getFechaRegistro()) + "')"); 
        dbManager.AbcProye(sql);
    }

    @Override
    public void actualizarRegistro(GenericModel model) throws Exception {
        Cliente cnt = (Cliente)model;
        sql = ("UPDATE tblcliente SET Nombre='" + cnt.getNombre() +
                "',Direccion='" + cnt.getDireccion() + 
                "',Telefono=" + cnt.getTelefono() + 
                ",Rfc='" + cnt.getRfc() +
                "',Colonia='" + cnt.getColonia() + 
                "',Comunidad='" + cnt.getComunidad() +
                "',Municipio='" + cnt.getMunicipio()+ 
                "',CodigoPostal=" + cnt.getCodPostal() +
                ",Tarifa='" + cnt.getTarifa() + 
                "',FechaRegistro='" + cnt.getFechaFormateada(cnt.getFechaRegistro()) + 
                "' where NoCuenta=" + cnt.getNroCuenta() + "");
        dbManager.AbcProye(sql);
    }

    @Override
    public void eliminarRegistro(GenericModel model) throws Exception {
        Cliente cnt = (Cliente)model;
        sql=("DELETE  FROM tblcliente WHERE NoCuenta='" + cnt.getNroCuenta() + "'");
        dbManager.AbcProye(sql);
        
    }

    
    public GenericModel getRegistro(Integer code) throws Exception {
        sql = "select * from tblcliente where NoCuenta = "+code.toString();
        rs = dbManager.consultar(sql);
        Cliente cnt=new Cliente();
        while(rs.next())
        {            
            cnt.setNroCuenta(rs.getInt(1));
            cnt.setNombre(rs.getString(2)); 
            cnt.setDireccion(rs.getString(3));
            cnt.setTelefono(rs.getDouble(4));
            cnt.setRfc(rs.getString(5)); 
            cnt.setColonia(rs.getString(6)); 
            cnt.setComunidad(rs.getString(7)); 
            cnt.setMunicipio(rs.getString(8)); 
            cnt.setCodPostal(rs.getString(9));
            cnt.setTarifa(rs.getString(10));
            cnt.setFechaRegistro(rs.getDate(11));
            
        }
        return cnt;
    }
    
    
}
