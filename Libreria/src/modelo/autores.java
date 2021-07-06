/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;



/**
 *
 * @author antho
 */
public class autores {
    private int id_autor;
    private String nombre;
    private String apellido;
    private Date fecha;
    private int num_libros;
    private boolean ecuatoriano;

    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNum_libros() {
        return num_libros;
    }

    public void setNum_libros(int num_libros) {
        this.num_libros = num_libros;
    }

    public boolean isEcuatoriano() {
        return ecuatoriano;
    }

    public void setEcuatoriano(boolean ecuatoriano) {
        this.ecuatoriano = ecuatoriano;
    }

    public autores() {
    }

    public autores(int id_autor, String nombre, String apellido, Date fecha, int num_libros, boolean ecuatoriano) {
        this.id_autor = id_autor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.num_libros = num_libros;
        this.ecuatoriano = ecuatoriano;
    }

    public autores(String nombre, String apellido, Date fecha, int num_libros, boolean ecuatoriano) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.num_libros = num_libros;
        this.ecuatoriano = ecuatoriano;
    }
    

    
}
