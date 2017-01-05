package controlador;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author jason
 */
public class consultas extends conexion {
    public boolean autenticacion(String user_name, String Password){
    PreparedStatement pst =null;
    ResultSet rs = null;
        try{
            String consulta = "select * from login where user_name =? and Password=?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, user_name);
            pst.setString(2, Password);
            rs = pst.executeQuery();
            if(rs.absolute(1)){
                 return true;
             }
        } catch (Exception e){
                System.err.printf("Error", e);
                 }finally{
            try{
                        if(getConexion() != null) getConexion().close();
                        if(pst != null) pst.close();
                        if(rs != null) rs.close();
                            }   catch (Exception e){
                                 System.err.printf("Error", e);
                                }
                            }
        return false;
    }
}
