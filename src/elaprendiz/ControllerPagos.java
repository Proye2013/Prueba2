package elaprendiz;

import elaprendiz.bdmodel.Cliente;
import elaprendiz.bdmodel.GenericModel;
import elaprendiz.bdmodel.Pago;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import prykualiatl.bd_manager;

/**
 *
 * @author El APRENDIZ www.elaprendiz.net63.net
 */
public class ControllerPagos extends AbstractController{

    @Override
    public boolean getDatos() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ControllerPagos() {
        this.dbManager = new bd_manager();
    }

    
    
     public static Integer getUltimoRegistro() throws Exception
    {
             int claveclientess=0;
        
               bd_manager obj = new bd_manager();
               String sql;
               ResultSet rs;
               sql=("select ClvFolio FROM tblpago order by ClvFolio desc limit 1");
               rs= obj.consultar(sql);
             
               if(rs.next())
               {
                   claveclientess=rs.getInt(1);
                   return new Integer(claveclientess+1);                      
               }
                 
           
        
        return null;        
    }
    
    @Override
    public List getRegistros() throws Exception {
        ArrayList<Pago> pagos  = new ArrayList<Pago>();
        ControllerCliente cc = new ControllerCliente();
        Pago pago;
        sql = "select ClvFolio,tblpago.NoCuenta,FechaCubierta,MesesTranscurridos,FechaDePago,Rezago,PagoCalculado,Recargo,Total,FechaDeRegistro from tblpago,tblcliente where tblpago.NoCuenta=tblcliente.NoCuenta";
        rs = dbManager.consultar(sql);
        while(rs.next())
        {
            pago = new Pago();
            pago.setCivFolio(rs.getInt(1));
            pago.setNorCuenta(rs.getInt(2));
            pago.setFechaCubierta(rs.getString(3));
            pago.setMesesTranscurridos(rs.getInt(4));
            pago.setFechaPago(rs.getString(5));
            pago.setRezago(rs.getFloat(6));
            pago.setPagoCalculado(rs.getFloat(7));
            pago.setRecargo(rs.getFloat(8));
            pago.setTotal(rs.getFloat(9));
            pago.setFechaRegistro(rs.getDate(10));
            pago.setCliente((Cliente)cc.getRegistro(pago.getNorCuenta()));
            pagos.add(pago);
            
        }
        return pagos;       
    }

    @Override
    public void guardarRegistro(GenericModel model) throws Exception {
        Pago pago = (Pago)model;
        sql = ("INSERT INTO tblpago (ClvFolio,NoCuenta,FechaCubierta,MesesTranscurridos,FechaDePago,Rezago,PagoCalculado,Recargo,Total,FechaDeRegistro) Values (" +
                pago.getCivFolio() + "," 
                + pago.getNorCuenta()+ ",'" 
                + pago.getFechaCubierta() + "'," 
                + pago.getMesesTranscurridos() + ",'" + 
                pago.getFechaPago() + "'," +
                pago.getRezago() + "," +
                pago.getPagoCalculado() + "," +
                pago.getRecargo() + "," + 
                pago.getTotal() + ",'" + 
                pago.getFechaFormateada(pago.getFechaRegistro()) + "')");
        dbManager.AbcProye(sql);
    }

    @Override
    public void actualizarRegistro(GenericModel model) throws Exception {
        Pago pago = (Pago)model;
        sql = ("UPDATE tblpago SET FechaCubierta=" + pago.getFechaCubierta() 
                + ",MesesTranscurridos=" + pago.getMesesTranscurridos() 
                + ",FechaDePago=" + pago.getFechaPago()
                + ",Rezago=" + pago.getRezago() 
                + ",PagoCalculado=" + pago.getPagoCalculado() 
                + ",Recargo=" + pago.getRecargo() 
                + ",Total=" + pago.getTotal() 
                + ",FechaDeRegistro='"+ pago.getFechaFormateada(pago.getFechaRegistro())
                + "' where ClvFolio=" + pago.getCivFolio() + "");
        
        dbManager.AbcProye(sql);
    }

    @Override
    public void eliminarRegistro(GenericModel model) throws Exception {
         Pago pago = (Pago)model;
         sql=("DELETE  FROM tblpago WHERE ClvFolio=" + pago.getCivFolio() + "");
         dbManager.AbcProye(sql);
    }
    
    public Pago getFechaRegistro(String fecha) throws Exception
    {
        Pago pg=null;
        sql=("select Clvfolio,Nocuenta,FechaCubierta FROM tblpago where NoCuenta='"+fecha+"' order by Clvfolio desc limit 1");
        rs = dbManager.consultar(sql);
        if(rs.next())
        {
            pg = new Pago();
            pg.setCivFolio(rs.getInt(1));
            pg.setNorCuenta(rs.getInt(2));
            pg.setFechaCubierta(rs.getString(3));
        }
        
        return pg;
    }
    
}
