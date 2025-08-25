package Biblioteca;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashMap<Usuario, HashSet<Libro> >clientes;
    private HashMap<Integer,Libro>libros;
    public static HashMap<Membresia,Integer> descuentos = new HashMap<>();
    static {
        descuentos.put(Membresia.BRONCE, 5);
        descuentos.put(Membresia.PLATA, 15);
        descuentos.put(Membresia.ORO, 30);
    }


    public Sistema() {
        this.clientes = new HashMap<>();
        this.libros = new HashMap<>();
    }

    public Sistema(HashMap<Usuario, HashSet<Libro>> clientes, HashMap<Integer, Libro> libros) {
        this.clientes = clientes;
        this.libros = libros;
    }

    public HashMap<Usuario, HashSet<Libro>> getClientes() {
        return clientes;
    }

    public void setClientes(HashMap<Usuario, HashSet<Libro>> clientes) {
        this.clientes = clientes;
    }

    public HashMap<Integer, Libro> getLibros() {
        return libros;
    }

    public void setLibros(HashMap<Integer, Libro> libros) {
        this.libros = libros;
    }

    //AMB
    public void agregar(Libro l){
        Integer maxKey = Collections.max(libros.keySet());
        libros.put(maxKey + 1,l);
    }

    public void bajar(Integer i){
        libros.remove(i);
    }

    public void modificar(Integer code, Libro l){
        libros.replace(code, l);
    }
}
