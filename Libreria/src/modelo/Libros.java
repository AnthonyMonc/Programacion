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
public class Libros {
    
    private int cod_libro;
    private int icbn;
    private String nombre;
    private int num_pag;
    private int edicion;
    private Date fecha;
    private String nom_edt;
    private int autor_id;

    public int getCod_libro() {
        return cod_libro;
    }

    public void setCod_libro(int cod_libro) {
        this.cod_libro = cod_libro;
    }

    public int getIcbn() {
        return icbn;
    }

    public void setIcbn(int icbn) {
        this.icbn = icbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_pag() {
        return num_pag;
    }

    public void setNum_pag(int num_pag) {
        this.num_pag = num_pag;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNom_edt() {
        return nom_edt;
    }

    public void setNom_edt(String nom_edt) {
        this.nom_edt = nom_edt;
    }

    public int getAutor_id() {
        return autor_id;
    }

    public void setAutor_id(int autor_id) {
        this.autor_id = autor_id;
    }

    public Libros() {
    }

    public Libros(int cod_libro, int icbn, String nombre, int num_pag, int edicion, Date fecha, String nom_edt, int autor_id) {
        this.cod_libro = cod_libro;
        this.icbn = icbn;
        this.nombre = nombre;
        this.num_pag = num_pag;
        this.edicion = edicion;
        this.fecha = fecha;
        this.nom_edt = nom_edt;
        this.autor_id = autor_id;
    }

    public Libros(int icbn, String nombre, int num_pag, int edicion, Date fecha, String nom_edt, int autor_id) {
        this.icbn = icbn;
        this.nombre = nombre;
        this.num_pag = num_pag;
        this.edicion = edicion;
        this.fecha = fecha;
        this.nom_edt = nom_edt;
        this.autor_id = autor_id;
    }
    
    
    
}
