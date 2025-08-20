package Biblioteca;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        try {
            // Crear autores
            Autor autor1 = new Autor("Gabriel García Márquez", LocalDate.of(1927, 3, 6), 12345678, new HashSet<>());
            Autor autor2 = new Autor("Isaac Asimov", LocalDate.of(1920, 1, 2), 87654321, new HashSet<>());

            // Crear libros
            Libro libro1 = new Libro("Cien años de soledad", autor1, Genero.FICCION, "cien_anos.pdf");
            Libro libro2 = new Libro("Fundación", autor2, Genero.CIENCIA_FICCION, "fundacion.pdf");
            Libro libro3 = new Libro("Yo, Robot", autor2, Genero.CIENCIA_FICCION, "yo_robot.pdf");

            // Agregar libros a bibliografía de autores
            autor1.addLibro(libro1);
            autor2.addLibro(libro2);
            autor2.addLibro(libro3);

            // Crear usuarios con diferentes membresías
            Usuario usuario1 = new Usuario("Juan Pérez", LocalDate.of(1990, 5, 15), 44556677, "juan@mail.com", Membresia.BRONCE);
            Usuario usuario2 = new Usuario("Ana Gómez", LocalDate.of(1985, 8, 20), 11223344, "ana@mail.com", Membresia.ORO);

            // Crear sistema y cargar libros iniciales
            HashMap<Integer, Libro> libros = new HashMap<>();
            libros.put(1, libro1);
            libros.put(2, libro2);
            libros.put(3, libro3);

            HashMap<Usuario, HashSet<Libro>> clientes = new HashMap<>();
            clientes.put(usuario1, new HashSet<>());
            clientes.put(usuario2, new HashSet<>());

            Sistema sistema = new Sistema(clientes, libros);

            // --- PROBAR FUNCIONALIDADES ---
            System.out.println("📚 Libros iniciales en el sistema: " + sistema.getLibros().size());

            // Descargar libro
            System.out.println("Usuario " + usuario1.getNombre() + " descarga un libro...");
            if (usuario1.prestarLibro() && libro1.descargarLibro()) {
                clientes.get(usuario1).add(libro1);
                System.out.println("✅ " + usuario1.getNombre() + " descargó " + libro1.getTitulo());
            }

            // Intentar superar el límite de un usuario BRONCE
            try {
                for (int i = 0; i < 10; i++) {
                    usuario1.prestarLibro();
                }
            } catch (MembresiaException e) {
                System.out.println("⚠️ Excepción: " + e.getMessage());
            }

            // Agregar un nuevo libro al sistema
            Libro libro4 = new Libro("Crónica de una muerte anunciada", autor1, Genero.FICCION, "cronica.pdf");
            sistema.agregar(libro4);
            System.out.println("📘 Nuevo libro agregado: " + libro4.getTitulo());
            System.out.println("Total libros ahora: " + sistema.getLibros().size());

            // Modificar un libro en el sistema
            Libro libroModificado = new Libro("Fundación (Edición Revisada)", autor2, Genero.CIENCIA_FICCION, "fundacion_v2.pdf");
            sistema.modificar(2, libroModificado);
            System.out.println("✏️ Libro en código 2 modificado: " + sistema.getLibros().get(2).getTitulo());

            // Dar de baja un libro
            sistema.bajar(1);
            System.out.println("❌ Libro con código 1 eliminado. Total: " + sistema.getLibros().size());

        } catch (Exception e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }
    }
}

