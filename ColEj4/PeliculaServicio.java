/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.ColEj4;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class PeliculaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Pelicula crearPelicula(){
        Pelicula p1 = new Pelicula();
        System.out.println("Ingrese titulo de la pelicula");
        p1.setTitulo(leer.next());
        System.out.println("Ingrese director de la pelicula");
        p1.setDirector(leer.next());
        System.out.println("Ingrese duracion en horas");
        p1.setDuracion(leer.nextFloat());
        
        return p1;
    }
    
    
    
}
