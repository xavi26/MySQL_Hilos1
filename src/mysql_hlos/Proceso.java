package mysql_hlos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Proceso 
{
    public void agregarUsario(Medico Med)
    {
        BDConection conn=new BDConection();
        try{
            Statement consulta=conn.getConnection().createStatement();
            String sql= "INSERT INTO medico VALUES('"+Med.IdMedico+"','"+Med.Nombre+"','"+Med.ApellidoP+"','"+Med.ApellidoM+"','"+Med.Especialidad+"')";
            consulta.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Medico Registrado ");
            consulta.close();
            conn.desconectar();
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error al registrar  ");
        }      
    }
        public ArrayList<Medico> obtenUsuario() {
        ArrayList<Medico> arrMed = new ArrayList<>();
        BDConection conn = new BDConection();
        String sql = "SELECT * FROM medico";
        try {
            PreparedStatement st = conn.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Medico Med = new Medico(rs.getInt("IdMedico"),rs.getString("Nombre"), rs.getString("ApellidoP"), rs.getString("ApellidoM"),rs.getString("Especialidad"));
                arrMed.add(Med);
            }
            rs.close();
            st.close();
            conn.desconectar();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error "+ e );
        }
        return arrMed;
    }
    
}
