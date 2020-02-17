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
import modelo.autores;

/**
 *
 * @author antho
 */
public class Metodos_autores {
    
    ResultSet rs = null;
    PreparedStatement ps = null;
    ConexionBDD conexion = new ConexionBDD();;
   
    public List<autores> ListarAutor() {
        List<autores> listaautores = new ArrayList<autores>();
        autores autor= null;
        String sqlCliente = "SELECT * FROM AUTORES a";
        Statement stCliente = null;
        
        try {
                stCliente= conexion.getConxion().createStatement();
                rs = stCliente.executeQuery(sqlCliente);
                while(rs.next()){
                int id_cliente= rs.getInt("COD_AUTOR");
                String nom= rs.getString("NOMBRES");
                String ape= rs.getString("APELLIDO");
                Date fecha= rs.getDate("FEC_NAC");
                int tratamientos = rs.getInt("NUM_LIBROS");
                boolean edad= rs.getBoolean("ECUATORIANO");
                autor = new  autores(id_cliente, nom, ape, (java.sql.Date) fecha, tratamientos, edad);
                listaautores.add(autor);
            }
            } catch (SQLException ex) {
                //Logger.getLogger(ClienteMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
        
       return listaautores; 
    }
    
    
    
}
