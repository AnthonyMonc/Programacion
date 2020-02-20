/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.ConexionBDD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.autores;

/**
 *
 * @author antho
 */
public class Metodos_autores {
    
    ResultSet rs = null;
    PreparedStatement ps = null;
    ConexionBDD conexion = new ConexionBDD();
   
    public List<autores> ListarAutor() {
        List<autores> listaautores = new ArrayList<autores>();
        autores autor= null;
        String sqlautor = "SELECT * FROM AUTORES ";
        Statement stautor = null;
        
        try {
                stautor= conexion.getConxion().createStatement();
                rs = stautor.executeQuery(sqlautor);
                while(rs.next()){
                int id_cliente= rs.getInt("COD_AUTOR");
                String nom= rs.getString("NOMBRES");
                String ape= rs.getString("APELLIDO");
                Date fecha= rs.getDate("FEC_NAC");
                int num_l = rs.getInt("NUM_LIBROS");
                boolean e= rs.getBoolean("ECUATORIANO");
                autor = new  autores(id_cliente, nom, ape, (java.sql.Date) fecha, num_l, e);
                listaautores.add(autor);
            }
            } catch (SQLException ex) {//Logger.getLogger(ClienteMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
       return listaautores; 
    }
    
    public autores Buscarautor(String autors){ 
        autores autor=null;
        String sqlCliente ="SELECT * FROM AUTORES  WHERE NOMBRES like ?"
                + " or APELLIDO like ? ";
        PreparedStatement psCliente = null;
        ResultSet rsCliente = null;
            try {
                psCliente = conexion.getConxion().prepareStatement(sqlCliente);
                psCliente.setString(1,autors+"%");
                //psCliente.setString(2,Integer.parseInt(autors)+"%");
                psCliente.setString(2,autors+"%");
                rsCliente=psCliente.executeQuery();               
                while(rsCliente.next()){
                int id_cliente= rsCliente.getInt("COD_AUTOR");
                String nom= rsCliente.getString("NOMBRES");
                String ape= rsCliente.getString("APELLIDO");
                Date fecha= rsCliente.getDate("FEC_NAC");
                int num_l = rsCliente.getInt("NUM_LIBROS");
                boolean e= rsCliente.getBoolean("ECUATORIANO");
                autor = new autores(id_cliente, nom, ape, (java.sql.Date) fecha, num_l, e);;
            }
            } catch (SQLException ex) {
                System.err.println("No se puede obtener contactos"+ ex.getMessage());
            }
            return autor;
    }
  public void ActualizarAutor(autores aut) {

        String sqlCliente = "UPDATE AUTORES SET NOMBRES =?,  APELLIDO =?, FEC_NAC =?, NUM_LIBROS = ?, ECUATORIANO = ? WHERE NOMBRES = ?";
        
            try {
                ps= conexion.getConxion().prepareStatement(sqlCliente);
                ps.setString(1, aut.getNombre());
                ps.setString(2, aut.getApellido());
                ps.setDate(3, aut.getFecha());
                ps.setInt(4, aut.getNum_libros());
                ps.setBoolean(5, aut.isEcuatoriano());
                ps.setString(6, aut.getNombre());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos Actualizados");
                
            } catch (SQLException ex) {
               Logger.getLogger(Metodos_autores.class.getName()).log(Level.SEVERE, null, ex);
            }}
  
    public void ingresarArticulo(autores aut){
        
        String sqlInsert = 
                "INSERT into AUTORES (NOMBRES , APELLIDO, FEC_NAC , NUM_LIBROS , ECUATORIANO) values (?,?,?,?,?);";
        try {
            ps = conexion.getConxion().prepareStatement(sqlInsert);
            ps.setString(1, aut.getNombre());
            ps.setString(2, aut.getApellido());
            ps.setDate(3, aut.getFecha());
            ps.setInt(4, aut.getNum_libros());
            ps.setBoolean(5, aut.isEcuatoriano());
            ps.executeUpdate();            
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
        } catch (SQLException ex) {
            System.out.println("ERROR"+ ex);
                  JOptionPane.showMessageDialog(null, "ERROR");
        }
    }
    
    public void eliminarRegistro(String aut) {
        String delete = "delete from AUTORES where NOMBRES = ?";

        try {
            ps = conexion.getConxion().prepareStatement(delete);
            ps.setString(1, aut);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Eliminados correctamente");
        } catch (SQLException ex) {
            //Logger.getLogger(controladorArticulo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
