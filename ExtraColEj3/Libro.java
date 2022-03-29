/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones.ExtraColEj3;

import java.util.Objects;

/**
 *
 * @author lucas
 */
public class Libro {
    private String titulo,autor;
    private int numero_ejemplares,prestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int numero_ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numero_ejemplares = numero_ejemplares;
        this.prestados = prestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumero_ejemplares() {
        return numero_ejemplares;
    }

    public void setNumero_ejemplares(int numero_ejemplares) {
        this.numero_ejemplares = numero_ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.titulo);
        hash = 43 * hash + Objects.hashCode(this.autor);
        hash = 43 * hash + this.numero_ejemplares;
        hash = 43 * hash + this.prestados;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (this.numero_ejemplares != other.numero_ejemplares) {
            return false;
        }
        if (this.prestados != other.prestados) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", numero_ejemplares=" + numero_ejemplares + ", prestados=" + prestados + '}';
    }
    
    
}
