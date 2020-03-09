package Dal;
import java.sql.*;
import javax.swing.JOptionPane;
public class Conectbd {
    
    public static Connection conectabd() throws ClassNotFoundException {
        try{
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","postgres");
            
            return con;        
                    }
        catch(SQLException error){
            
            JOptionPane.showMessageDialog(null, "Erro ao conectar");
            return null;
        }
    }
    
}
