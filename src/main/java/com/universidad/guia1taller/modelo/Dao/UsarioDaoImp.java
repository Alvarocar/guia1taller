/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universidad.guia1taller.modelo.Dao;

import com.universidad.guia1taller.modelo.Usuario;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author AlvaroCardozo
 */
public class UsarioDaoImp implements UsuarioDao{

    private final static String NOMBRE_ARCHIVO = "Usuarios.txt";
    private final static String CARPETA_ARCHIVO = "DirectorioUsuarios";
    private final static String RUTA_ARCHIVO = System.getProperty("user.home")
            + File.separator + CARPETA_ARCHIVO + File.separator + NOMBRE_ARCHIVO;
    
    @Override
    public ArrayList<Usuario> Leer() {
        return null;
    }
    
}
