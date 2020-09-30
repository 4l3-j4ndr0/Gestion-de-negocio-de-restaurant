package principal;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author 4L3
 */

public class conectar {

    Connection conect = null;

    public Connection conexion() {
        try {
            Class.forName("org.h2.Driver");
             conect = DriverManager.getConnection("jdbc:h2:./bd/enramada","root", "");
//           Class.forName("com.mysql.jdbc.Driver");
//             conect = DriverManager.getConnection("jdbc:mysql://localhost/enramada", "root", ""); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión" + e);
        }
        return conect;
    }   
}
