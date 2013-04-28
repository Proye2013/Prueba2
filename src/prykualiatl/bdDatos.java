package prykualiatl;

import java.sql.*;
public class bdDatos {

    public String bd = "dbkuali";
    public String login = "root";
    public String password = "";
    public String url = "jdbc:mysql://localhost:3306/" + this.bd;
    public Statement stmt;//consultas
    public Connection con;
    public ResultSet rs;
    public ResultSetMetaData rsMeta;
    public void Conectar()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, login, password);
            System.out.println("CONEXION EXITOSA");
        }
        catch(Exception e)
        {
            System.out.println("ERROR DE CONEXION: " + e.getMessage());
        }

    }

    public Object[][] Consultar(String strSQL)
    {
        Object [][] datos =new Object[0][0];
        int rows,cols,f,c;

        try
        {
            stmt=con.createStatement();
            rs=stmt.executeQuery(strSQL);

            //contar los registros
            for (rows=0;rs.next();rows++)
            {}
            rs.beforeFirst();
           rsMeta= rs.getMetaData();
            cols=rsMeta.getColumnCount();
            datos=new Object[rows][cols];
            f=0;
            while(rs.next())
            {
                for(c=0;c<cols;c++)
                {
                    datos[f][c]=rs.getObject(c+1);
                }
                f++;
            }
        }
        catch(SQLException e)
        {
            System.out.println("ERROR DE CONEXION: "+ e.getMessage());
        }
        return datos;
    }
}
