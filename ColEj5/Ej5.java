/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.ColEj5;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author lucas
 */
public class Ej5 {
    public static void main(String[] args) {
        TreeSet<String> lista_paises = new TreeSet<>();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String opcion;
        do {            
            System.out.println("Desea ingresar un pais?");
            opcion = leer.next();
            if (opcion.equalsIgnoreCase("s")) {
                System.out.println("Ingrese el nombre del pais:");
                lista_paises.add(leer.next());
            }
        } while (opcion.equalsIgnoreCase("s"));
        
        for (String pais : lista_paises) {
            System.out.println("Pais:"+pais);
        }
        
        String pais_eliminar;
        System.out.println("Ingrese pais a eliminar");
        pais_eliminar = leer.next();
        boolean esta_pais=false;
        int tamaño_inicial = lista_paises.size();
        Iterator<String> it = lista_paises.iterator();
        //Innecesario el iterator se podria haber usado el .remove directo
        while (it.hasNext()) {            
            String aux = it.next();
            if (pais_eliminar.equalsIgnoreCase(aux)) {
                esta_pais = true;
            }
        }
        
        if (esta_pais) {
            lista_paises.remove(pais_eliminar);
        }
        
        if (tamaño_inicial == lista_paises.size()) {
            System.out.println("No se ha eliminado ningun pais");
        }else System.out.println("Se ha eliminado el pais "+pais_eliminar);
        
        for (String pais : lista_paises) {
            System.out.println("Pais:"+pais);
        }
        
    }
}
