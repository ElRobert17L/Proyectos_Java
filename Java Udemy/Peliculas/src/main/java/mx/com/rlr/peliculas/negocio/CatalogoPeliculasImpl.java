/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.rlr.peliculas.negocio;

import java.util.List;
import mx.com.rlr.peliculas.datos.*;
import mx.com.rlr.peliculas.domain.Pelicula;
import mx.com.rlr.peliculas.excepciones.AccesoDatosEx;
import mx.com.rlr.peliculas.excepciones.LecturaDatosEx;

/**
 *
 * @author Roberto Ledesma
 */
public class CatalogoPeliculasImpl implements CatalogoPeliculas {

    private final AccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = datos.existe(nombreArchivo);
            datos.escribir(pelicula, nombreArchivo, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        try {
            List<Pelicula> peliculas = datos.listar(nombreArchivo);
            for (Pelicula pelicula : peliculas) {
                System.out.println("Pelicula:" + pelicula);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        String resultado = null;
        try {
            resultado = datos.buscar(nombreArchivo, buscar);
        } catch (LecturaDatosEx ex) {
            System.out.println("Error al buscar la pelicula");
            ex.printStackTrace();
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
        System.out.println("Resultado bsuqueda: " + resultado);
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        try {
            if (datos.existe(nombreArchivo)){
                datos.borrar(nombreArchivo);
                datos.crear(nombreArchivo);
            } else {
                //creamos archivo
                datos.crear(nombreArchivo);
            }
        } catch (AccesoDatosEx ex){
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }

}
