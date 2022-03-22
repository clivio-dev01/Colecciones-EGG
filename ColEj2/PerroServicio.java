/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.ColEj2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
                this.listaRazas.add(raza);
            }
            
        } while (opcion.equals("s"));
    }
    
    public void mostrarListaRazas(){
        System.out.println("Lista de razas:");
        for (int i = 0; i < this.listaRazas.size(); i++) {
            System.out.println(this.listaRazas.get(i));
        }
    }
    
    public void ordenarLista(){
        Collections.sort(this.listaRazas, ComparadoresEj2.ordenStringDesc);
    }
    
//    public int buscaRaza(String raza_buscada){
//        int aux=-1;
//        for (String raza : this.listaRazas) {
//            if (raza.equalsIgnoreCase(raza_buscada)) {
//                aux = this.listaRazas.indexOf(raza);
//            }
//        }
//        return aux;
//    }
    
    public int buscaRaza(String raza_buscada){
        Iterator<String> it = this.listaRazas.iterator();
        int retorno = -1;
        while (it.hasNext()) {            
            String aux = it.next();
            if (aux.equalsIgnoreCase(raza_buscada)) {
                retorno = this.listaRazas.indexOf(raza_buscada);
            }
            
        }
        return retorno;
    }
    
    //Innecesarias ambas busquedas porque es un arraylist de String y podria
    //implementar un indexOf dentro de this.eliminarraza
    
    public void eliminaRaza(){
        System.out.println("Ingrese raza a eliminar");
        String raza_eliminar = leer.next();
        int index = this.buscaRaza(raza_eliminar);
        if (index == -1) {
            System.out.println("No existe raza a eliminar");
        }else {
            String removido = this.listaRazas.get(index);
            this.listaRazas.remove(index);
            System.out.println("Se ha removido la raza: "+ removido);
        }
    }
    
}
