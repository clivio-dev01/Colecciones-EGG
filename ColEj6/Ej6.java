/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.ColEj6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Ej6 {
    public static void main(String[] args) {
        HashMap<Integer,Producto> lista_productos = new HashMap<>();
        ProductoServicio serv = new ProductoServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
        int opcion_ingresada;
        do {            
            opcion_ingresada = menuPrincipal();
            switch(opcion_ingresada){
            case 1:
                String opcion1;
                do {                    
                    opcion1 = agregarElemento(lista_productos, serv);
                } while (opcion1.equalsIgnoreCase("s"));
                
                //funcion Ingresar
                break;
            case 2:
                String opcion2;
                do {                    
                    opcion2 = eliminarElemento(lista_productos);
                } while (opcion2.equalsIgnoreCase("s"));
                
                //funcion Eliminar
                break;
            case 3:
                mostrarLista(lista_productos);
                //funcion Mostrar
                break;
            
            }
        } while (opcion_ingresada!=0);
        
        
        System.out.println("Salio del programa");
        
    }
    
    public static int menuPrincipal(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion;
        System.out.println("Que desea hacer?\n1.Ingresar un producto\n2.Eliminar un producto\n3.Mostrar todos los productos\n0.Salir");
        opcion = leer.nextInt();
        
        return opcion;
        
    }
    
    public static String agregarElemento(HashMap<Integer,Producto> lp, ProductoServicio serv1){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Integer llave;
        do {            
            System.out.println("Ingrese codigo de producto");
            llave = leer.nextInt();
        } while (lp.containsKey(llave));
        lp.put(llave, serv1.crearProducto());
        
        String salida;
        
        do {            
            System.out.println("Desea agregar otro producto?(s/n)");
            salida = leer.next();
        } while (!(salida.equalsIgnoreCase("s")||salida.equalsIgnoreCase("n")));
        return salida;
        
    }
    
    public static String eliminarElemento(HashMap<Integer,Producto> lp){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese codigo del producto a eliminar");
        Integer codigo_eliminar = leer.nextInt();
        
        if (lp.containsKey(codigo_eliminar)) {
            lp.remove(codigo_eliminar);
            System.out.println("Producto "+codigo_eliminar+" eliminado");
        }else System.out.println("No existe ese producto");
        
        String salida;
        
        do {            
            System.out.println("Desea eliminar otro producto?");
            salida = leer.next();
        } while (!(salida.equalsIgnoreCase("s")||salida.equalsIgnoreCase("n")));
        return salida;
        
    }
    
    public static void mostrarLista(HashMap<Integer,Producto> lp){
        for (Map.Entry<Integer, Producto> entry : lp.entrySet()) {
            Integer codigo = entry.getKey();
            Producto prod = entry.getValue();
            
            System.out.println("Codigo:"+codigo+", Nombre:"+prod.getNombre()+", Precio:$"+prod.getPrecio());
            
        }
    }
    
    
}
