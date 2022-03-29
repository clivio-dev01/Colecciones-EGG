/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.ExtraColEj2;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class CantanteFamosoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public CantanteFamoso crearCantanteFamoso(){
        CantanteFamoso cf1 = new CantanteFamoso();
        System.out.println("Ingrese nombre del cantante");
        cf1.setNombre(leer.next());
        System.out.println("Ingrese su disco mas vendido");
        cf1.setDisco_mas_vendido(leer.next());
        return cf1;
    }
    
}
