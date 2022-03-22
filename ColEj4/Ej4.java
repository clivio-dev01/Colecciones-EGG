/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.ColEj4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Ej4 {
    public static void main(String[] args) {
        ArrayList<Pelicula> lista_peliculas = new ArrayList<>();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PeliculaServicio servicio_p1 = new PeliculaServicio();
        String opcion;
        
        
        
        do {            
            System.out.println("Desea crear una pelicula? (s/n)");
            opcion = leer.next();
            if (opcion.equalsIgnoreCase("s")) {
                lista_peliculas.add(servicio_p1.crearPelicula());
            }
        } while (opcion.equalsIgnoreCase("s"));
        
        System.out.println("1.Mostrar todas las peliculas:");
        mostrarTodasPeliculas(lista_peliculas);
        
        System.out.println("2.Mostrar peliculas con duracion mayor a 1 hora");
        mostrarPeliculasMayorA1Hora(lista_peliculas);
        
        System.out.println("3.Ordenar segun duracion descendente y mostrar");
        ordenarListaDuracionDesc(lista_peliculas);
        mostrarTodasPeliculas(lista_peliculas);
        
        System.out.println("4.Ordenar segun duracion ascendente y mostrar");
        ordenarListaDuracionAsc(lista_peliculas);
        mostrarTodasPeliculas(lista_peliculas);
        
        System.out.println("5.Ordenar segun Titulo descendente y mostrar");
        ordenarListaTituloDesc(lista_peliculas);
        mostrarTodasPeliculas(lista_peliculas);
        
        System.out.println("6.Ordenar segun Director descendente y mostrar");
        ordenarListaDirectorDesc(lista_peliculas);
        mostrarTodasPeliculas(lista_peliculas);
        
        System.out.println("---------FIN----------");
        
        
    }
    
    public static void mostrarTodasPeliculas(ArrayList<Pelicula> listap){
        for (int i = 0; i < listap.size(); i++) {
            System.out.println(listap.get(i).toString());
        }
    }
    
    public static void mostrarPeliculasMayorA1Hora(ArrayList<Pelicula> listap){
        for (int i = 0; i < listap.size(); i++) {
            if (listap.get(i).getDuracion() > 1) {
                System.out.println(listap.get(i).toString());
            }
        }
    }
    
    public static void ordenarListaDuracionDesc(ArrayList<Pelicula> listap){
        Collections.sort(listap, ComparadoresEj4.ordenDuracionDesc);
    }
    
    public static void ordenarListaDuracionAsc(ArrayList<Pelicula> listap){
        Collections.sort(listap, ComparadoresEj4.ordenDuracionAsc);
    }
    
    public static void ordenarListaTituloDesc(ArrayList<Pelicula> listap){
        Collections.sort(listap, ComparadoresEj4.ordenTituloDesc);
    }
    
    public static void ordenarListaDirectorDesc(ArrayList<Pelicula> listap){
        Collections.sort(listap, ComparadoresEj4.ordenDirectorDesc);
    }
    
    
}
