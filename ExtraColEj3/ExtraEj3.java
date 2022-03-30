/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.ExtraColEj3;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class ExtraEj3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        LibreriaServicio serv_libreria = new LibreriaServicio();
        Libreria libroteca = serv_libreria.crearLibreria();
        LibroServicio serv_libros = new LibroServicio();
        
        for (int i = 0; i < 5; i++) {
            serv_libreria.agregarLibro(libroteca, new Libro("titulo"+i, "autor"+i, 10+i, 0));
        }
        int opcion;
        do {            
            System.out.println("1.Mostrar Libros\n2.Agregar Libro\n3.Prestamo\n4.Devolucion\n0.Salir\n");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    muestraLibros(libroteca);
                    break;
                case 2:
                    libroteca.getLista_libros().add(serv_libros.crearLibro());
                    break;
                case 3:
                    if (serv_libreria.prestamo(libroteca)) {
                        System.out.println("Se pudo prestar el libro");
                    }else System.out.println("No se pudo realizar el prestamo");
                    break;
                case 4:
                    if (serv_libreria.devolucion(libroteca)) {
                        System.out.println("Se pudo devolver el libro");
                    }else System.out.println("No se pudo realizar la devolucion");
                    break;
                case 0:
                    System.out.println("Saldra del programa");
                    break;
                default:
                    System.out.println("No es una opcion valida");
                    break;
            }
        } while (opcion!=0);
    }
    
    public static void muestraLibros(Libreria l1){
        for (Libro lib : l1.getLista_libros()) {
            System.out.println(lib.toString());
        }
        
    }
    
    
}
