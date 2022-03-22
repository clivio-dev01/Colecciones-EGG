/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.ColEj3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Ej3 {
    public static void main(String[] args) {
        ArrayList<Alumno> lista_alumnos = new ArrayList<>();
        AlumnoServicio serv = new AlumnoServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String opcion,alumno_buscado;
        
        
        do {            
            System.out.println("Desea crear un nuevo Alumno (s/n)");
            opcion = leer.next();
            if (opcion.equalsIgnoreCase("s")) {
                lista_alumnos.add(serv.crearAlumno());
            }
        } while (!opcion.equalsIgnoreCase("n"));
        
        
        System.out.println("Ingrese el nombre del alumno a buscar");
        alumno_buscado = leer.next();
        for (Alumno alumno : lista_alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(alumno_buscado)) {
                System.out.println("La nota final del alumno es "+ serv.notaFinal(alumno));
            }
        }
        
        //TODO el valor de retorno esta en float, pero se redondea, debe ser
        //por los atributos de alumno seteados en formato int
        
    }
}
