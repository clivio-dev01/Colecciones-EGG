/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.ColEj1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class PerroServicio {
    Scanner leer;
    ArrayList<String> listaRazas; 

    public PerroServicio() {
        this.listaRazas = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Perro crearPerro(){
        Perro p1 = new Perro();
        System.out.println("Inserte nombre del perro");
        p1.setNombre(leer.next());
        System.out.println("Inserte raza del perro");
        p1.setRaza(leer.next());
        return p1;
    }
    
    public void hacerListaRazas(){
        String opcion,raza;
        do {          
            System.out.println("Desea agregar una raza s/n");
            opcion = leer.next().toLowerCase();
            if (opcion.equals("s")) {
                System.out.println("Ingrese raza a agregar");
                raza = leer.next();
                listaRazas.add(raza);
            }
            
        } while (opcion.equals("s"));
    }
    
    public void mostrarListaRazas(){
        System.out.println("Lista de razas:");
        for (int i = 0; i < listaRazas.size(); i++) {
            System.out.println(listaRazas.get(i));
        }
    }
    
}
