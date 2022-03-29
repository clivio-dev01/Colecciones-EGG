/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.ExtraColEj1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class ExtraEj1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Integer> lista_numeros = new ArrayList<>();
        int ingresado;
        do {            
            System.out.println("Ingrese un numero (-99 para terminar)");
            ingresado = leer.nextInt();
            if (ingresado != -99) {
                lista_numeros.add(ingresado);
                
            }
        } while (ingresado!=-99);
        
        System.out.println("Lista de numeros ingresados: (Total "+lista_numeros.size()+")");
        int suma=0;
        //Aprovecho el bucle for para mostrar la lista y hago la suma de los elementos
        for (int i = 0; i < lista_numeros.size(); i++) {
            System.out.println(lista_numeros.get(i));
            suma+=lista_numeros.get(i);
        }
        System.out.println("La suma total es:"+suma);
        //En java si se tiene x,y como int y se produce la division, aunque la
        //declaracion de la variable resultante sea float, daria como resultado
        //un float truncado a int
        //Como solucion aplique un float a una de las variables, por lo que Java
        //se encarga de aplicar el float a la variable extra y la division da como
        //resultado un float
        // Es importante no hacer (float) (suma/lista_numeros.size()) Ya que
        //Alteraria el orden de precedencia que tendria el (float) el cual es 
        // prioritario respecto de la division, tambien podria aplicarse a ambas
        // variables individualmente
        float promedio=(float)suma/lista_numeros.size();
        System.out.println("La media/promedio es:"+promedio);
        
        
        
    }
}
