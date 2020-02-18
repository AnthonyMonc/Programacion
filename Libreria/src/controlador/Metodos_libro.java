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
import modelo.Libros;

/**
 *
 * @author antho
 */
public class Metodos_libro {
    ResultSet rs = null;
    PreparedStatement ps = null;
    ConexionBDD conexion = new ConexionBDD();
    
    
    public List<Libros> ListarLibro() {
        List<Libros> listalibro = new ArrayList<Libros>();
        Libros libro= null;
        String sqllibro = "SELECT * FROM LIBROS l";
        Statement stlibro = null;
        
        try {
                stlibro= conexion.getConxion().createStatement();
                rs = stlibro.executeQuery(sqllibro);
                while(rs.next()){
                int id_libro= rs.getInt("COD_LIBRO");
                int icbn= rs.getInt("ICBN");
                String nom= rs.getString("NOMBRE");
                int num_pag= rs.getInt("NUM_PAG");
                int edi= rs.getInt("EDICION");
                Date fecha = rs.getDate("FEC_PUBLIC");
                String nomED= rs.getString("NOM_EDITORIAL");
                int aut_id= rs.getInt("AUTORID");
                libro = new  Libros(id_libro, icbn, nom, num_pag, edi, (java.sql.Date) fecha, nomED, aut_id);
                listalibro.add(libro);
            }
            } catch (SQLException ex) {//Logger.getLogger(ClienteMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
       return listalibro; 
    }
    
    public Libros Buscarlibro(String lib){ 
        Libros libro=null;
        String sqlCliente ="SELECT * FROM LIBROS WHERE NOMBRE like ?"
                + " or NOM_EDITORIAL like ? ";
        PreparedStatement psCliente = null;
            try {
                psCliente = conexion.getConxion().prepareStatement(sqlCliente);
                psCliente.setString(1,lib+"%");
                //psCliente.setString(2,Integer.parseInt(autors)+"%");
                psCliente.setString(2,lib+"%");
                rs=psCliente.executeQuery();               
                while(rs.next()){
                int id_libro= rs.getInt("COD_LIBRO");
                int icbn= rs.getInt("ICBN");
                String nom= rs.getString("NOMBRE");
                int num_pag= rs.getInt("NUM_PAG");
                int edi= rs.getInt("EDICION");
                Date fecha = rs.getDate("FEC_PUBLIC");
                String nomED= rs.getString("NOM_EDITORIAL");
                int aut_id= rs.getInt("AUTORID");
                libro = new  Libros(id_libro, icbn, nom, num_pag, edi, (java.sql.Date) fecha, nomED, aut_id);
            }
            } catch (SQLException ex) {
                System.err.println("No se puede obtener Datos"+ ex.getMessage());
            }
            return libro;
    }
    
    public void Actualizarlibro(Libros lib) {

        String sqlCliente = "UPDATE LIBROS SET ICBN=?, NOMBRE=?, NUM_PAG=?, EDICION=?, FEC_PUBLIC=?, NOM_EDITORIAL=?, AUTORID=? WHERE NOMBRE=? ";
        PreparedStatement ps =null;
            try {
                ps= conexion.getConxion().prepareStatement(sqlCliente);
                ps.setInt(1, lib.getIcbn());
                ps.setString(2, lib.getNombre());
                ps.setInt(3, lib.getNum_pag());
                ps.setInt(4, lib.getEdicion());
                ps.setDate(5, lib.getFecha());
                ps.setString(6, lib.getNom_edt());
                ps.setInt(7, lib.getAutor_id());
                ps.setString(8, lib.getNombre());
                
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos Actualizados");
                
            } catch (SQLException ex) {
             //   Logger.getLogger(ClienteMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }}

    public void ingresarArticulo(Libros lib){
        
        String sqlInsert = 
                "INSERT into LIBROS  (ICBN , NOMBRE , NUM_PAG ,  EDICION , FEC_PUBLIC , NOM_EDITORIAL , AUTORID ) values (?,?,?,?,?,?,?);";
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
    
    public void eliminarRegistro(String lib) {
        String delete = "delete from LIBROS where NOMBRE = ?";

        try {
            ps = conexion.getConxion().prepareStatement(delete);
            ps.setString(1, lib);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Eliminados correctamente");
        } catch (SQLException ex) {
            //Logger.getLogger(controladorArticulo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

