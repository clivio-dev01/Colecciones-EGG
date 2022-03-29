/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.ExtraColEj2;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class ExtraEj2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<CantanteFamoso> lista_cantantes = new ArrayList<>();
        CantanteFamosoServicio serv = new CantanteFamosoServicio();
        
        int crear_cantidad=5;
        String nombre_temp,disco_temp;
        for (int i = 1; i <= 5; i++) {
            nombre_temp= "Cantante"+i;
            disco_temp= "Disco"+i;
            lista_cantantes.add(new CantanteFamoso(nombre_temp, disco_temp));
        }
        
        int opcion,agregados=0,eliminados=0;
        do {            
            System.out.println("1.Agregar cantante\n2.Eliminar cantante\n3.Mostrar cantantes\n0.Salir");
            opcion=leer.nextInt();
            
            switch(opcion){
                case 1:
                    lista_cantantes.add(serv.crearCantanteFamoso());
                    agregados++;
                    break;
                case 2:
                    System.out.println("Ingrese el numero de cantante a eliminar");
                    lista_cantantes.remove(leer.nextInt());
                    eliminados++;
                    break;
                case 3:
                    mostrarCantantes(lista_cantantes);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("No es una opcion valida");
                    break;
            }
        } while (opcion!=0);
        
        System.out.println("Salio del programa");
        System.out.println("Se eliminaron "+eliminados+" cantantes");
        System.out.println("Se agregaron "+agregados+" cantantes");
    }
    
    public static void mostrarCantantes(ArrayList<CantanteFamoso> l_cantantes){
        System.out.println("Lista de cantantes:");
        for (int i = 0; i < l_cantantes.size(); i++) {
            System.out.println("Nombre:"+l_cantantes.get(i).getNombre()+" ,disco mas vendido:"+l_cantantes.get(i).getDisco_mas_vendido());
        }
    }
}
