/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.ColEj3;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class AlumnoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Alumno crearAlumno(){
        Alumno a1 = new Alumno();
        System.out.println("Ingrese nombre del alumno");
        a1.setNombre(leer.next());
        
        
        //Obtiene cantidad de notas y mediante un bucle y un vector aux
        //setea  las notas
        int[] lista_aux = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresar nota "+(i+1));
            lista_aux[i] = leer.nextInt();
        }
        a1.setLista_notas(lista_aux);
        return a1;
        
    }
    
    public float notaFinal(Alumno a1){
        int[] notas_aux = a1.getLista_notas();
        int acumulado=0;
        for (int i = 0; i < notas_aux.length; i++) {
            acumulado += notas_aux[i];
        }
        return (acumulado/notas_aux.length);
    }
    
    
    
}
