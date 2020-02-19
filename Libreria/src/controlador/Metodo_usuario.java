/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.mysql.jdbc.Connection;
import conexion.ConexionBDD;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Usuario;


/**
 *
 * @author antho
 */
public class Metodo_usuario {
    
    ResultSet rs = null;
    PreparedStatement ps = null;
    ConexionBDD conexion = new ConexionBDD();;
   
    

    public Usuario Perfiles(String usuario, String clave) {   
    Usuario perfil = null;
    String sqlPerfil = "{call sp_autenticar(?,?,?)}";        
    CallableStatement csPerfil = null;
        try {
            csPerfil= conexion.getConxion().prepareCall(sqlPerfil);
            csPerfil.registerOutParameter(1, java.sql.Types.BOOLEAN);
            csPerfil.setString(2, usuario);
            csPerfil.setString(3, clave);
            if (csPerfil.execute()) {
                if (csPerfil.getBoolean(1)) { //si la autenticacion es exitosa, sacamos el resultSet
                    ResultSet rsPerfil = csPerfil.getResultSet();
                    if (rsPerfil.next()) {
                        String usu = rsPerfil.getString("USUARIO");
                        String nom = rsPerfil.getString("NOMBRE");
                        char per = rsPerfil.getString("PERMISO").charAt(0);
                        perfil = new Usuario(usu, nom, per);
                    }
                }
            }
            
        } catch (SQLException ex) {
            System.out.println("No se pudo autenticar usuario: " + ex.getMessage());
        }           
        return perfil;
    }
    
    /*public void ingresarArticulo(Usuario usu){
        
        String sqlInsert = 
                "INSERT INTO PERFIL (usuario,clave,permiso,nombre) VALUES (?,?,?,?);";
        try {
            ps = conexion.getConxion().prepareStatement(sqlInsert);
            ps.setInt(1, lib.getIcbn());
            ps.setString(2, lib.getNombre());
            ps.setInt(3, lib.getNum_pag());
            ps.setInt(4, lib.getEdicion());
            ps.setDate(5, lib.getFecha());
            ps.setString(6, lib.getNom_edt());
            ps.setInt(7, lib.getAutor_id());
            ps.executeUpdate();            
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
        } catch (SQLException ex) {
            System.out.println("ERROR"+ ex);
                  JOptionPane.showMessageDialog(null, "ERROR");
        }
    }
*/
}
