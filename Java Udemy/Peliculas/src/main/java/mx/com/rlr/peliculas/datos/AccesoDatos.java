/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.rlr.peliculas.datos;

import java.util.*;
import mx.com.rlr.peliculas.domain.*;
import mx.com.rlr.peliculas.excepciones.*;

/**
 *
 * @author Roberto Ledesma
 */
public interface AccesoDatos {
    
    public boolean existe (String nombreArchivo) throws AccesoDatosEx;
    
    public List<Pelicula> listar (String nombreArchivo) throws AccesoDatosEx;
    
    public abstract void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws AccesoDatosEx;
    
    public String buscar(String nombreArchivo, String buscar) throws AccesoDatosEx;
    
    public abstract void crear(String nombreArchivo) throws AccesoDatosEx;
    
    public abstract void borrar(String nombreArchivo) throws AccesoDatosEx;
}
