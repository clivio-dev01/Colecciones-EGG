/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.ColEj4;

import java.util.Comparator;

/**
 *
 * @author lucas
 */
public class ComparadoresEj4 {
    public static Comparator<Pelicula> ordenDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t1.getDuracion().compareTo(t.getDuracion());
            
        }
    };
    
    public static Comparator<Pelicula> ordenDuracionAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenTituloDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t.getTitulo().compareTo(t1.getTitulo());
            
        }
    };
    
    public static Comparator<Pelicula> ordenDirectorDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t.getDirector().compareTo(t1.getDirector());
            
        }
    };
}
