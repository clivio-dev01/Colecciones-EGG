/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.ColEj3;

/**
 *
 * @author lucas
 */
public class Alumno {
    private String nombre;
    //Innecesario hacer un arraylist de Integer si la cantidad de notas es 3
    //Ademas habria que setear el Max values como 3
    private int [] lista_notas;

    public Alumno() {
    }

    public Alumno(String nombre, int[] lista_notas) {
        this.nombre = nombre;
        this.lista_notas = new int[3];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getLista_notas() {
        return lista_notas;
    }

    public void setLista_notas(int[] lista_notas) {
        this.lista_notas = lista_notas;
    }
    
    
    
    
}
