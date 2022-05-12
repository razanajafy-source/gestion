package gestion;
import java.sql.*;
import javax.swing.JOptionPane;

public class condb {
    
    public static Connection conexion()
    {
        try
        {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion","root","777");
            return con;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "ERRO NA CONEXÃO " + e);
            return null;
        }
    }
    
}