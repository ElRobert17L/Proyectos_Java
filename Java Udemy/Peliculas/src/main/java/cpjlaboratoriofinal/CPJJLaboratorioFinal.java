/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpjlaboratoriofinal;

import java.util.Scanner;
import mx.com.rlr.peliculas.negocio.*;

/**
 *
 * @author Roberto Ledesma
 */
public class CPJJLaboratorioFinal {

    private static final Scanner sc = new Scanner(System.in);
    private static int opcion = -1;
    private static final String nombreArchivo = "d:\\CatalogoPeliculas\\peliculas.txt";
    private static final CatalogoPeliculas catalogoPeli = new CatalogoPeliculasImpl();

    public static void main(String[] args) {

        while (opcion != 0) {
            try {
                System.out.println("Elige opción:\n"
                        + "1.- Iniciar catalogo peliculas\n"
                        + "2.- Agregar peliculas\n"
                        + "3.- Listar Peliculas\n"
                        + "4.- Buscar Pelicula\n"
                        + "0.- Salir");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        catalogoPeli.iniciarArchivo(nombreArchivo);
                        break;
                    case 2:
                        System.out.println("Introduce el nombre de una pelicula a agregar");
                        String nombre = sc.nextLine();
                        catalogoPeli.agregarPelicula(nombre, nombreArchivo);
                        break;
                    case 3:
                        catalogoPeli.listarPeliculas(nombreArchivo);
                        break;
                    case 4:
                        System.out.println("Introduce el nombre de una pelicula a buscar:");
                        String buscar = sc.nextLine();
                        catalogoPeli.buscarPelicula(nombreArchivo, buscar);
                        break;
                    case 0:
                        System.out.println("!Hasta probto!");
                        break;
                    default:
                        System.out.println("Opcion no reconocida");
                        break;
                }
                System.out.println("\n");
            } catch (Exception e) {
                System.out.println("Error!");
            }

        }
    }
}
