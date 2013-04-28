package prykualiatl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class bd_manager {

    Connection conexion = null;

    public String bd = "dbkuali";
    public String login = "root";
    public String password = "";
    public String url = "jdbc:mysql://localhost:3306/" + this.bd;
    private Connection conn = null;
    private Statement St = null;
    private ResultSet Rs = null;
    private ResultSetMetaData meta = null;
    private int voto;

    public void AbcProye(String Consulta) throws Exception
    {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, login, password);
            St = conn.createStatement();
            St.execute(Consulta);
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "ERROR DE ACTUALIZACION", "KUALI ATL", JOptionPane.INFORMATION_MESSAGE);            
            ex.printStackTrace();
        }
            conn.close();
            St.close();
    }

    public String BuscaEva(String sQl) throws Exception
    {
        String x = "";
        boolean Votar= true;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, login, password);
            St = conn.createStatement();
            Rs = St.executeQuery(sQl);
            if (conn != null) {
                while (Rs.next()) {
                   x = Rs.getString(2);
                   voto = Integer.parseInt(Rs.getString(3));
                   if (voto == 0)
                   {
                        Votar = true;
                   }
                   else
                   {
                       Votar = false;
                   }
                }
                Rs.close();
                conn.close();
            }
        } 
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "NO EXISTE INFORMACION", "KUALI ATL", JOptionPane.INFORMATION_MESSAGE);
        }
        return x;
    }

    public ResultSet consultar(String sql)  throws Exception
    {
       try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, login, password);
            St = conn.createStatement();
            Rs = St.executeQuery(sql);
        } 
       catch (SQLException ex)
       {
            JOptionPane.showMessageDialog(null, "NO EXISTE INFORMACION", "KUALI ATL", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(ex.getMessage());
       }
         return Rs;
    }
}
