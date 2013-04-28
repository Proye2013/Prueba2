package prykualiatl;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class ConnectionDB
{
    private ResultSet resultado;
    private Connection miCon;
    public String bd = "dbkuali";
    public String login = "root";
    public String password = "";
    public String url = "jdbc:mysql://localhost:3306/" + this.bd;
    
    public void doConnection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            miCon = DriverManager.getConnection(url, login, password);
        } catch (Exception e)
          {
            e.printStackTrace();
          }
    }

    public DefaultTableModel getModelBySqlCommand(String SqlCmd)
    {
        DefaultTableModel modelo = new DefaultTableModel();
        try
        {
            Statement sentencia = miCon.createStatement();
            //ejecutamos el sql
            resultado = sentencia.executeQuery(SqlCmd);
            //tomamos el numero de columnas que tiene la consulta
            int NumColumn = resultado.getMetaData().getColumnCount();
            //el siguiente bucle añade los nombres a las columnas
            for (int i = 0; i < NumColumn; i++) {
                modelo.addColumn(resultado.getMetaData().getColumnName(i + 1));
            }
            //este bucle añade los datos al modelo de tabla
            while (resultado.next())
            {
                //son 3 columnas, la dimesion del objeto datos de 3
                Object[] datos = new Object[NumColumn];
                for (int row = 0; row < NumColumn; row++) {
                    datos[row] = resultado.getObject(row + 1);
                }
                modelo.addRow(datos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelo;
    }

    public String getCellBySqlCommand(String SqlCmd)
    {
        String CellValue = "";
        try{
            Statement sentencia = miCon.createStatement();
            //ejecutamos el sql
            resultado = sentencia.executeQuery(SqlCmd);
            while (resultado.next())
            {
                      CellValue = resultado.getObject(1).toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return CellValue;
    }

    public void UpdateCommand(String SqlCmd)
    {
        try
        {
            Statement sentencia = miCon.createStatement();
            sentencia.executeUpdate(SqlCmd);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void CloseConnectionDB()
    {
        try
        {
            miCon.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
