package elaprendiz;

import elaprendiz.bdmodel.Cliente;
import elaprendiz.bdmodel.GenericModel;
import elaprendiz.bdmodel.Orden;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import prykualiatl.bd_manager;

/**
 *
 * @author El APRENDIZ www.elaprendiz.net63.net
 */
public class ControllerOrden extends AbstractController{
    private ControllerCliente cl = new ControllerCliente();

    public ControllerOrden() {
        this.dbManager = new bd_manager();
    }
    
    
    @Override
    public boolean getDatos() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getRegistros() throws Exception {
        ArrayList<Orden> ordenes = new ArrayList<Orden>();
        sql = "select NoOrden,Fecha,tblorden.NoCuenta,Tipo,Inspector,MotivoCorte from tblorden,tblcliente  where tblorden.NoCuenta=tblcliente.NoCuenta";
        rs = dbManager.consultar(sql);
        Orden ord;
        while(rs.next())
        {
            ord = new Orden();
            ord.setNroOrdern(rs.getInt(1));
            ord.setFecha(rs.getDate(2)); 
            ord.setNorCuenta(rs.getInt(3));
            ord.setTipo(rs.getString(4));
            ord.setInspector(rs.getString(5));
            ord.setMotivoCorte(rs.getString(6));
            ord.setCliente((Cliente)cl.getRegistro(ord.getNorCuenta()));
            ordenes.add(ord);
        }
        return ordenes;
    }

    @Override
    public void guardarRegistro(GenericModel model) throws Exception {
        Orden od = (Orden)model;
        sql = ("INSERT INTO tblorden (NoOrden,Fecha,NoCuenta,Tipo,Inspector,MotivoCorte) Values (" + 
                od.getNroOrdern() + ",'" +
                od.getFechaFormateada(od.getFecha()) + "'," + 
                od.getNorCuenta() + ",'" +
                od.getTipo() + "','" +
                od.getInspector() + "','" +
                od.getMotivoCorte() + "')");
        dbManager.AbcProye(sql);
    }

    @Override
    public void actualizarRegistro(GenericModel model) throws Exception {
        Orden od = (Orden)model;
         sql = ("UPDATE tblorden SET Fecha='" + od.getFechaFormateada(od.getFecha()) +
                 "',Tipo='" + od.getTipo() + 
                 "',Inspector='" + od.getInspector() +
                 "',MotivoCorte='" + od.getMotivoCorte() + 
                 "' where NoOrden=" + od.getNroOrdern() + "");
         dbManager.AbcProye(sql);
    }

    @Override
    public void eliminarRegistro(GenericModel model) throws Exception {
        Orden od = (Orden)model;
        sql=("DELETE  FROM tblorden WHERE NoOrden='" + od.getNroOrdern() + "'");
        dbManager.AbcProye(sql);
    }
    
    public static Integer getUltimoRegistro() throws Exception
    {
             int claveclientess=0;
        
               bd_manager obj = new bd_manager();
               String sql;
               ResultSet rs;
               sql=("select NoOrden FROM tblorden  order by NoOrden desc limit 1");
               rs= obj.consultar(sql);
             
               if(rs.next())
               {
                   claveclientess=rs.getInt(1);
                   return new Integer(claveclientess+1);                      
               }
                 
           
        
        return null;        
    }
    
   

//    @Override
//    public GenericModel getRegistro(Integer code) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }
    
}
