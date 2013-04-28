package elaprendiz.modelgui;

import elaprendiz.ControllerOrden;
import elaprendiz.bdmodel.Cliente;
import elaprendiz.bdmodel.Orden;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author El APRENDIZ www.elaprendiz.net63.net
 */
public class ModeloTablaOrden extends AbstractTableModel{
    ArrayList<Orden> ordenes = new ArrayList<Orden>();    
    String[] titulos = new String[12];
    private ControllerOrden co;
    public ModeloTablaOrden() {
        titulos[0] ="NoOrden";
        titulos[1] ="Fecha";
        titulos[2] ="Tipo";
        titulos[3] ="Inspector";      
        titulos[4] ="NoCuenta";
        titulos[5] ="Nombre";
        titulos[6] ="Direccion";
        titulos[7] ="Colonia";
        titulos[8] ="Municipio";
        titulos[9] ="Telefono";
        titulos[10] ="Rfc";
        titulos[11] ="MotivoCorte";
        co = new ControllerOrden();
        try {
            ordenes = (ArrayList<Orden>) co.getRegistros();
        } catch (Exception ex) { }
    }
    
    public void borrarFila(int index) throws Exception
    {
       co.eliminarRegistro(ordenes.get(index)); 
       ordenes.remove(index);
       fireTableRowsDeleted(index, index);
    }
    
    public Orden getFila(int index)
    {
        return ordenes.get(index);
    }
    
    public int getRowCount() {
        return ordenes.size();
    }

    public int getColumnCount() {
        return titulos.length;
    }

    @Override
    public String getColumnName(int column) {
        return titulos[column];
    }
    
    

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {
            case 0: return ordenes.get(rowIndex).getNroOrdern();            
            case 1: return ordenes.get(rowIndex).getFechaFormateada(ordenes.get(rowIndex).getFecha()); 
            case 2: return ordenes.get(rowIndex).getTipo();
            case 3: return ordenes.get(rowIndex).getInspector();
            case 4: return ordenes.get(rowIndex).getNorCuenta();           
            case 5: return ordenes.get(rowIndex).getCliente().getNombre(); 
            case 6: return ordenes.get(rowIndex).getCliente().getDireccion(); 
            case 7: return ordenes.get(rowIndex).getCliente().getColonia();
            case 8: return ordenes.get(rowIndex).getCliente().getMunicipio();
            case 9: return ordenes.get(rowIndex).getCliente().getTelefono(); 
            case 10: return ordenes.get(rowIndex).getCliente().getRfc(); 
            case 11: return ordenes.get(rowIndex).getMotivoCorte();    
            default:return null;
        }
    }
    
}
