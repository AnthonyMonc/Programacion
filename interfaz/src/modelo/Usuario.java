/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author antho
 */
public class Usuario {
    
    private String usuario;
    private String nombre2;
    private char permiso;
    private String nomperm;
    private String idperfil;
    private String clave;

    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public char getPermiso() {
        return permiso;
    }

    public void setPermiso(char permiso) {
        this.permiso = permiso;
    }

    public String getNomperm() {
        return nomperm;
    }

    public void setNomperm(String nomperm) {
        this.nomperm = nomperm;
    }

    public String getIdperfil() {
        return idperfil;
    }

    public void setIdperfil(String idperfil) {
        this.idperfil = idperfil;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Usuario() {
    }

    public Usuario(String usuario, String nombre2, char permiso, String nomperm, String idperfil, String clave) {
        this.usuario = usuario;
        this.nombre2 = nombre2;
        this.permiso = permiso;
        this.nomperm = nomperm;
        this.idperfil = idperfil;
        this.clave = clave;
    }

    public Usuario(String usuario, String nombre2, char permiso) {
        this.usuario = usuario;
        this.nombre2 = nombre2;
        this.permiso = permiso;
    }

    

    public Usuario(String usuario, String nombre2, char permiso, String idperfil, String clave) {
        this.usuario = usuario;
        this.nombre2 = nombre2;
        this.permiso = permiso;
        this.idperfil = idperfil;
        this.clave = clave;
    }
    
    
    
}