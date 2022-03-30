/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.ExtraColEj4;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class CiudadServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Ciudad crearCiudad(){
        Ciudad c1 = new Ciudad();
        System.out.println("Ingrese el nombre de la ciudad/distrito");
        c1.setNombre(leer.next());
        System.out.println("Ingrese el nombre del departamento/provincia");
        c1.setProvincia(leer.next());
        System.out.println("Ingrese el nombre del pais");
        c1.setPais(leer.next());
        return c1;
    }
    
    
}
