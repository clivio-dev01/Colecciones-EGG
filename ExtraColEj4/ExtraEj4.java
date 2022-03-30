/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.ExtraColEj4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class ExtraEj4 {
    public static void main(String[] args) {
        HashMap<Integer, Ciudad> lista_ciudades = new HashMap<>();
        CiudadServicio serv = new CiudadServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int codigo_llave;
        
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese codigo postal");
            codigo_llave = leer.nextInt();
            lista_ciudades.put(codigo_llave, serv.crearCiudad());
        }
        
        for (Map.Entry<Integer, Ciudad> entry : lista_ciudades.entrySet()) {
            System.out.println("Codigo Postal:"+entry.getKey());
            System.out.println(entry.getValue().toString()+"\n");
            
        }
        
        int buscado;
        System.out.println("Ingrese un codigo postal");
        buscado=leer.nextInt();
        if (lista_ciudades.containsKey(buscado)) {
            System.out.println(lista_ciudades.get(buscado).toString());
        }else System.out.println("No se encontro ese codigo postal");
        
        int eliminar;
        System.out.println("Ingrese codigo de la ciudad a eliminar");
        eliminar = leer.nextInt();
        lista_ciudades.remove(eliminar);
        
        
    }
}
