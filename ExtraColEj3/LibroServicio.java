/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.ExtraColEj3;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class LibroServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro crearLibro(){
        Libro l1 = new Libro();
        System.out.println("Ingrese titulo del libro");
        l1.setTitulo(leer.next());
        System.out.println("Ingrese autor del libro");
        l1.setAutor(leer.next());
        System.out.println("Ingrese cantidad de ejemplares");
        l1.setNumero_ejemplares(leer.nextInt());
        l1.setPrestados(0);
        return l1;
        
    }
    
    
}
