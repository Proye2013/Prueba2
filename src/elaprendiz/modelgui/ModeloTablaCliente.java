package elaprendiz.modelgui;

import elaprendiz.ControllerCliente;
import elaprendiz.bdmodel.Cliente;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author El APRENDIZ www.elaprendiz.net63.net
 */
public class ModeloTablaCliente extends AbstractTableModel{
    String[]titulos = new String[11];
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    ControllerCliente cnl;
    public ModeloTablaCliente() {
        titulos[0] ="NoCuenta";
        titulos[1] ="Nombre";
        titulos[2] ="Direccion";
        titulos[3] ="Telefono";
        titulos[4] ="Rfc";
        titulos[5] ="Colonia";
        titulos[6] ="Comunidad";
        titulos[7] ="Municipio";
        titulos[8] ="CodigoPostal";
        titulos[9] ="Tarifa";
        titulos[10] ="FechaRegistro";
        
        cnl = new ControllerCliente();
        try {
            clientes = (ArrayList<Cliente>) cnl.getRegistros();
        } catch (Exception ex) {}
        
    }
    
    public int getRowCount() {
        return clientes.size();
    }

    public int getColumnCount() {
        return titulos.length;
    }

    @Override
    public String getColumnName(int column) {
        return titulos[column];
    }
    
    public void borrarFila(int index) throws Exception
    {
       cnl.eliminarRegistro(clientes.get(index)); 
       clientes.remove(index);
       fireTableRowsDeleted(index, index);
    }
    
    public Cliente getFila(int index)
    {
        return clientes.get(index);
    }
    
    

    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            case 0: return clientes.get(rowIndex).getNroCuenta();                
            case 1: return clientes.get(rowIndex).getNombre(); 
            case 2: return clientes.get(rowIndex).getDireccion(); 
            case 3: return clientes.get(rowIndex).getTelefono(); 
            case 4: return clientes.get(rowIndex).getRfc(); 
            case 5: return clientes.get(rowIndex).getColonia(); 
            case 6: return clientes.get(rowIndex).getComunidad();
            case 7: return clientes.get(rowIndex).getMunicipio(); 
            case 8: return clientes.get(rowIndex).getCodPostal(); 
            case 9: return clientes.get(rowIndex).getTarifa();
            case 10: return clientes.get(rowIndex).getFechaFormateada(clientes.get(rowIndex).getFechaRegistro()); 
            default: return null;
            }
    }
    
}
