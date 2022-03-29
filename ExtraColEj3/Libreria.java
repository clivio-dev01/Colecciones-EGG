/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.ExtraColEj3;

import java.util.HashSet;

/**
 *
 * @author lucas
 */
public class Libreria {
    HashSet<Libro> lista_libros = new HashSet<>();

    public HashSet<Libro> getLista_libros() {
        return lista_libros;
    }

    public void setLista_libros(HashSet<Libro> lista_libros) {
        this.lista_libros = lista_libros;
    }
    
    
}
