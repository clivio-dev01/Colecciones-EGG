/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.ColEj6;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class ProductoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Producto crearProducto(){
        Producto p1 = new Producto();
        System.out.println("Ingrese nombre del producto");
        p1.setNombre(leer.next());
        System.out.println("Ingrese precio del producto");
        p1.setPrecio(leer.nextInt());
        return p1;
    }
}
