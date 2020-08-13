
package com.universidad.guia1taller.modelo;

/**
 *
 * @author DELL
 */
public class Usuario {
    private String Nombre;
    private String Contrasena;
    
    public Usuario(String Nombre,String Contrasena){
        this.Nombre = Nombre;
        this.Contrasena = Contrasena;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }
    
}
