package elaprendiz.modelgui;

import elaprendiz.ControllerUsuario;
import elaprendiz.bdmodel.Usuario;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author El APRENDIZ www.elaprendiz.net63.net
 */
public class ModeloTablaUsuario extends AbstractTableModel{
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    ControllerUsuario cu = new ControllerUsuario();
    String[] titulos = new String[24];

    public ModeloTablaUsuario() {
        
        titulos[0] ="ClvUsuario";
        titulos[1] ="Usuario";
        titulos[2] ="Contraseña";
        titulos[3] ="Archivo";
        titulos[4] ="IniciarSesion";
        titulos[5] ="CerrarSesion";
        titulos[6] ="RegistroDeUsuario";
        titulos[7] ="SalirDeAplicacion";
        titulos[8] ="Clientes";
        titulos[9] ="RegistroDeClientes";
        titulos[10] ="Pagos";
        titulos[11] ="RegistroDePagos";
        titulos[12] ="EmisionesOrdenes";
        titulos[13] ="Reportes";
        titulos[14] ="ReporteDeIngresos";
        titulos[15] ="ReporteDePagos";
        titulos[16] ="ReporteDeOrdenes";
        titulos[17] ="Herramientas";
        titulos[18] ="Calculadora";
        titulos[19] ="RespaldarBd";
        titulos[20] ="RetaurarBd";
        titulos[21] ="Ayuda";
        titulos[22] ="MostrarAyuda";
        titulos[23] ="AcercaDe";
        try {
            usuarios = (ArrayList<Usuario>)cu.getRegistros();
        } catch (Exception ex) {
           
        }
        
    }
    
    public void actualizarVista()
    {
       try {
            usuarios = (ArrayList<Usuario>)cu.getRegistros();
        } catch (Exception ex) {
           
        }
         
    }
    
    public void borrarFila(int index) throws Exception
    {
       cu.eliminarRegistro(usuarios.get(index)); 
       usuarios.remove(index);
       fireTableRowsDeleted(index, index);
    }
    
    public Usuario getFila(int index)
    {
        return usuarios.get(index);
    }

    public int getRowCount() {
        return usuarios.size();
    }

    public int getColumnCount() {
        return titulos.length;
    }

    @Override
    public String getColumnName(int column) {
        return titulos[column];
    }    
    

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return usuarios.get(rowIndex).getClvUsuario();
            case 1: return usuarios.get(rowIndex).getUsuario();
            case 2: return usuarios.get(rowIndex).getPassword();
            case 3: return usuarios.get(rowIndex).getArchivo();   
            case 4: return usuarios.get(rowIndex).getIniciarSesion();   
            case 5: return usuarios.get(rowIndex).getCerrarSesion();   
            case 6: return usuarios.get(rowIndex).getRegistroDeUsuario();   
            case 7: return usuarios.get(rowIndex).getSalirDeAplicacion();   
            case 8: return usuarios.get(rowIndex).getClientes();   
            case 9: return usuarios.get(rowIndex).getRegistroDeClientes();   
            case 10: return usuarios.get(rowIndex).getPagos();  
            case 11: return usuarios.get(rowIndex).getRegistroDePagos();   
            case 12: return usuarios.get(rowIndex).getEmisionesOrdenes();   
            case 13: return usuarios.get(rowIndex).getReportes();   
            case 14: return usuarios.get(rowIndex).getReporteDeIngresos();   
            case 15: return usuarios.get(rowIndex).getRegistroDePagos();   
            case 16: return usuarios.get(rowIndex).getReporteDeOrdenes();   
            case 17: return usuarios.get(rowIndex).getHerramientas();   
            case 18: return usuarios.get(rowIndex).getCalculadora();   
            case 19: return usuarios.get(rowIndex).getRespaldarBd();   
            case 20: return usuarios.get(rowIndex).getRestaurarBd();
            case 21: return usuarios.get(rowIndex).getAyuda();
            case 22: return usuarios.get(rowIndex).getMostrarAyuda();   
            case 23: return usuarios.get(rowIndex).getAcercaDe(); 
            default: return null;    
                
        }
    }
    
}
