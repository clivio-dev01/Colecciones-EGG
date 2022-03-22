/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.ColEj2;

import java.util.Comparator;

/**
 *
 * @author lucas
 */
public class ComparadoresEj2 {
    public static Comparator<String> ordenStringDesc = new Comparator<String>() {
        @Override
        public int compare(String t, String t1) {
            return t.compareTo(t1);
        }
    };
}
