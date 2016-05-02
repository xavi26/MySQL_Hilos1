
package mysql_hlos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class BDConection 
{
    static String bd="EjemploDB";
    static String login="root";
    static String password="";
    static String url="jdbc:mysql://localhost/"+ bd;
    Connection coneccion=null;
    
    public BDConection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
            coneccion=DriverManager.getConnection(url, login,password);
            if (coneccion!=null)
            {
                JOptionPane.showMessageDialog(null, "Conección con la BD exitosa ");
            }
        } catch(SQLException e)
        {
         JOptionPane.showMessageDialog(null, "Se presento el siguiente error: " + e);
        } catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null, "Se presento el siguiente error: " + e);
        } catch(Exception e){
         JOptionPane.showMessageDialog(null, "Se presento el siguiente error: " + e);
        }        
    }
    
    public Connection getConnection()
    {
        return coneccion;
    }
    public void  desconectar()
    {
        coneccion=null;
    }
}
