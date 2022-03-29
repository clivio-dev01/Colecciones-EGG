/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.ExtraColEj2;

/**
 *
 * @author lucas
 */
public class CantanteFamoso {
    private String nombre,disco_mas_vendido;

    public CantanteFamoso() {
    }
    
    

    public CantanteFamoso(String nombre, String disco_mas_vendido) {
        this.nombre = nombre;
        this.disco_mas_vendido = disco_mas_vendido;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDisco_mas_vendido() {
        return disco_mas_vendido;
    }

    public void setDisco_mas_vendido(String disco_mas_vendido) {
        this.disco_mas_vendido = disco_mas_vendido;
    }
    
    
}
