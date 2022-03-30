/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.ExtraColEj3;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class LibreriaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libreria crearLibreria(){
        Libreria l1 = new Libreria();
        return l1;
    }
    
    public void agregarLibro(Libreria libre1, Libro l1){
        
        libre1.getLista_libros().add(l1);
    }
    
    
    
    public boolean prestamo(Libreria libre1){
        String buscado;
        int i=0;
        boolean exitoso=false;
        System.out.println("Ingrese titulo del libro");
        buscado=leer.next();
        Iterator<Libro> it = libre1.getLista_libros().iterator();
        while (it.hasNext()) {
            Libro aux = it.next();
            if (aux.getTitulo().equalsIgnoreCase(buscado)) {
                if (aux.getNumero_ejemplares()>aux.getPrestados()) {
                    aux.setPrestados(aux.getPrestados()+1);
                    exitoso=true;
                }
                
                
            }
        }
        return exitoso;
    }
    
    public boolean devolucion(Libreria libre1){
        String buscado;
        int i=0;
        boolean exitoso=false;
        System.out.println("Ingrese titulo del libro");
        buscado=leer.next();
        Iterator<Libro> it = libre1.getLista_libros().iterator();
        while (it.hasNext()) {     
            Libro aux = it.next();
            if (aux.getTitulo().equalsIgnoreCase(buscado)) {
                if (aux.getPrestados()>0) {
                    aux.setPrestados(aux.getPrestados()-1);
                    exitoso=true;
                }
                
                
            }
        }
        return exitoso;
    }
}
