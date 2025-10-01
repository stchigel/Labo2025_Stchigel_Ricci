package Prestamos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Library {
    private HashMap<Publicacion, Integer> libros;
    private HashMap<Integer, Usuario> users;

    public Library() {
        this.libros = new HashMap<>();
    }

    public Library(HashMap<Publicacion, Integer> libros) {
        this.libros = libros;
    }

    public HashMap<Publicacion, Integer> getLibros() {
        return libros;
    }

    public void setLibros(HashMap<Publicacion, Integer> libros) {
        this.libros = libros;
    }

    public void devolverPrestamo(Prestamo p){
        libros.put(p.getPublicacion(), libros.get(p.getPublicacion())+1);
        try{
            if(!p.getFdpreestablecida().isBefore(LocalDate.now())){
                users.get(p.getNumSocio()).addPrestamo(p.getPublicacion());
            }
            else{
                if(p.getPublicacion() instanceof Libro){
                    users.get(p.getNumSocio()).setCreditoGanado(users.get(p.getNumSocio()).getCreditoGanado()-7500.0);
                } else if (p.getPublicacion() instanceof Revista) {
                    users.get(p.getNumSocio()).setCreditoGanado(users.get(p.getNumSocio()).getCreditoGanado()-3500.0);
                }
                throw new Exception("Prestamo fuera de tiempo");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
