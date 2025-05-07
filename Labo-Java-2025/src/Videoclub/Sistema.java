package Videoclub;
import unidad1.Persona;
import java.util.ArrayList;
import java.util.Objects;

public class Sistema {
    ArrayList<Videoclub> videoclubs;

    public Sistema() {
        this.videoclubs = new ArrayList<>();
    }

    public Sistema(ArrayList<Videoclub> videoclubs) {
        this.videoclubs = videoclubs;
    }

    public ArrayList<Videoclub> getVideoclubs() {
        return videoclubs;
    }

    public void setVideoclubs(ArrayList<Videoclub> videoclubs) {
        this.videoclubs = videoclubs;
    }

    public void addVideoclub(Videoclub videoclub) {
        this.videoclubs.add(videoclub);
    }

    public void removeVideoclub(Videoclub videoclub) {
        this.videoclubs.remove(videoclub);
    }

    public void updateVideoclub(Videoclub videoclubViejo, Videoclub videoclubNuevo) {
        for (Videoclub videoclub : this.videoclubs){
            if (videoclub==videoclubViejo){
                videoclub=videoclubNuevo;
            }
        }
    }

    public void masTiempo(Videoclub videoclub){
        Pelicula masTiempo=videoclub.getEstanterias().getFirst().mayorTiempo();
        int numEstant=0;
        for(Estanteria estanteria : videoclub.getEstanterias()){
            if (estanteria.mayorTiempo().getDuracion() > masTiempo.getDuracion()){
                masTiempo=estanteria.mayorTiempo();
            }
            numEstant++;
        }
        System.out.println("Nombre: " + masTiempo.getNombre() + " estantería: " + numEstant);
    }

    public ArrayList<Persona> actoresMayores(Pelicula pelicula) {
        return pelicula.actoresMayores();
    }

    public ArrayList<Persona> masDeUnaPeli(Estanteria estanteria) {
        return estanteria.masDeUnaPeli();
    }

    public ArrayList<String> videoclubPorComuna(int comuna){
        ArrayList<String>videoclubComuna=new ArrayList<>();
        for(Videoclub clubVideo : this.videoclubs){
            if( clubVideo.getComuna() == comuna){
                videoclubComuna.add(clubVideo.getDireccion());
            }
        }
        return videoclubComuna;
    }

    public ArrayList<Pelicula> peliculasMenor90(Videoclub videoclub){
        return videoclub.getPeliculas90();
    }

    public Videoclub videoClubMasPelis(){
        Videoclub clubVideoMaspelis=this.videoclubs.getFirst();
         for(Videoclub clubVideo :this.videoclubs){
             if(clubVideoMaspelis.cantPeliculas() < clubVideo.cantPeliculas()){
                 clubVideoMaspelis=clubVideo;
             }
         }
        return clubVideoMaspelis;
    }

    public ArrayList<Pelicula> pelisDeGenero (String genero){
        ArrayList<Pelicula> pelisDeGenero = new ArrayList<>();
        for(Videoclub videoclub : this.videoclubs){
            for (Estanteria estanteria : videoclub.getEstanterias()){
                for (Pelicula pelicula : estanteria.getPeliculas()){
                    if (Objects.equals(pelicula.getGenero(), genero)){
                        pelisDeGenero.add(pelicula);
                    }
                }
            }
        }
        return pelisDeGenero;
    }

    public static void main(String[] args) {
        Sistema s = new Sistema();
        Videoclub v1 = new Videoclub("Juan Eternauta 2314", "A1431CBV", 12);
        Estanteria e1 = new Estanteria(1);
        Estanteria e2 = new Estanteria(2);
        Estanteria e3 = new Estanteria(3);
        Videoclub v2 = new Videoclub("Galería subte B puesto 17", "A1527CBV", 8);
        Estanteria e4 = new Estanteria(1);
        Estanteria e5 = new Estanteria(2);
        Estanteria e6 = new Estanteria(3);
        ArrayList<Persona> directores1 = new ArrayList<>();
        directores1.add(new Persona("Robert Zemeckis", 72, "N/A"));
        ArrayList<Persona> actores1 = new ArrayList<>();
        actores1.add(new Persona("Michael J. Fox", 63, "N/A"));
        ArrayList<String> idiomas1 = new ArrayList<>();
        idiomas1.add("Español");
        idiomas1.add("Inglés");
        idiomas1.add("Alemán");
        idiomas1.add("Árabe");
        Pelicula p1 = new Pelicula("Volver al Futuro", "Ciencia Ficción", 116, directores1, actores1, idiomas1);

// Volver al Futuro 2
        ArrayList<Persona> directores2 = new ArrayList<>();
        directores2.add(new Persona("Robert Zemeckis", 72, "N/A"));
        ArrayList<Persona> actores2 = new ArrayList<>();
        actores2.add(new Persona("Michael J. Fox", 63, "N/A"));
        ArrayList<String> idiomas2 = new ArrayList<>(idiomas1);
        Pelicula p2 = new Pelicula("Volver al Futuro 2", "Ciencia Ficción", 108, directores2, actores2, idiomas2);


// Chicken Little
        ArrayList<Persona> directores3 = new ArrayList<>();
        directores3.add(new Persona("Mark Dindal", 61, "N/A"));
        ArrayList<Persona> actores3 = new ArrayList<>();
        actores3.add(new Persona("Zach Braff", 49, "N/A"));
        ArrayList<String> idiomas3 = new ArrayList<>(idiomas1);
        Pelicula p3 = new Pelicula("Chicken Little", "Animación", 81, directores3, actores3, idiomas3);


// Volver al Futuro 3
        ArrayList<Persona> actores4 = new ArrayList<>();
        actores4.add(new Persona("Michael J. Fox", 63, "N/A"));
        Pelicula p4 = new Pelicula("Volver al Futuro 3", "Ciencia Ficción", 118, directores2, actores4, idiomas2);


// Rápidos y Furiosos
        ArrayList<Persona> directores5 = new ArrayList<>();
        directores5.add(new Persona("Rob Cohen", 75, "N/A"));
        ArrayList<Persona> actores5 = new ArrayList<>();
        actores5.add(new Persona("Vin Diesel", 57, "N/A"));
        ArrayList<String> idiomas5 = new ArrayList<>(idiomas1);
        Pelicula p5 = new Pelicula("Rápidos y Furiosos", "Acción", 106, directores5, actores5, idiomas5);


// Benjamin Button
        ArrayList<Persona> directores6 = new ArrayList<>();
        directores6.add(new Persona("David Fincher", 62, "N/A"));
        ArrayList<Persona> actores6 = new ArrayList<>();
        actores6.add(new Persona("Brad Pitt", 60, "N/A"));
        Pelicula p6 = new Pelicula("Benjamin Button", "Drama", 166, directores6, actores6, idiomas1);


// Rambo
        ArrayList<Persona> directores7 = new ArrayList<>();
        directores7.add(new Persona("Ted Kotcheff", 84, "N/A"));
        ArrayList<Persona> actores7 = new ArrayList<>();
        actores7.add(new Persona("Sylvester Stallone", 77, "N/A"));
        Pelicula p7 = new Pelicula("Rambo", "Acción", 93, directores7, actores7, idiomas1);


// Terminator
        ArrayList<Persona> directores8 = new ArrayList<>();
        directores8.add(new Persona("James Cameron", 69, "N/A"));
        ArrayList<Persona> actores8 = new ArrayList<>();
        actores8.add(new Persona("Arnold Schwarzenegger", 76, "N/A"));
        Pelicula p8 = new Pelicula("Terminator", "Ciencia Ficción", 107, directores8, actores8, idiomas1);


// Trolls 3
        ArrayList<Persona> directores9 = new ArrayList<>();
        directores9.add(new Persona("Walt Dohrn", 54, "N/A"));
        ArrayList<Persona> actores9 = new ArrayList<>();
        actores9.add(new Persona("Anna Kendrick", 38, "N/A"));
        Pelicula p9 = new Pelicula("Trolls 3", "Animación", 92, directores9, actores9, idiomas1);

// Rush: pasión y gloria
        ArrayList<Persona> directores10 = new ArrayList<>();
        directores10.add(new Persona("Ron Howard", 70, "N/A"));
        ArrayList<Persona> actores10 = new ArrayList<>();
        actores10.add(new Persona("Chris Hemsworth", 40, "N/A"));
        Pelicula p10 = new Pelicula("Rush: pasión y gloria", "Biografía", 123, directores10, actores10, idiomas1);


// Culpa mía
        ArrayList<Persona> directores11 = new ArrayList<>();
        directores11.add(new Persona("Domingo González", 40, "N/A"));
        ArrayList<Persona> actores11 = new ArrayList<>();
        actores11.add(new Persona("Nicole Wallace", 22, "N/A"));
        Pelicula p11 = new Pelicula("Culpa mía", "Romance", 117, directores11, actores11, idiomas1);


// Culpa tuya
        Pelicula p12 = new Pelicula("Culpa tuya", "Romance", 120, directores11, actores11, idiomas1);


// Una película de Minecraft
        ArrayList<Persona> directores13 = new ArrayList<>();
        directores13.add(new Persona("Jared Hess", 44, "N/A"));
        ArrayList<Persona> actores13 = new ArrayList<>();
        actores13.add(new Persona("Jason Momoa", 45, "N/A"));
        Pelicula p13 = new Pelicula("Una película de Minecraft", "Aventura", 100, directores13, actores13, idiomas1);


// El Gladiador
        ArrayList<Persona> directores14 = new ArrayList<>();
        directores14.add(new Persona("Ridley Scott", 86, "N/A"));
        ArrayList<Persona> actores14 = new ArrayList<>();
        actores14.add(new Persona("Russell Crowe", 60, "N/A"));
        Pelicula p14 = new Pelicula("El Gladiador", "Épico", 155, directores14, actores14, idiomas1);

// Rocky 1 a 6 (p15 a p20)
        Pelicula p15 = new Pelicula("Rocky 1", "Deporte", 120, directores7, actores7, idiomas1);
        Pelicula p16 = new Pelicula("Rocky 2", "Deporte", 119, directores7, actores7, idiomas1);
        Pelicula p17 = new Pelicula("Rocky 3", "Deporte", 99, directores7, actores7, idiomas1);
        Pelicula p18 = new Pelicula("Rocky 4", "Deporte", 91, directores7, actores7, idiomas1);
        Pelicula p19 = new Pelicula("Rocky 5", "Deporte", 104, directores7, actores7, idiomas1);
        Pelicula p20 = new Pelicula("Rocky 6", "Deporte", 102, directores7, actores7, idiomas1);

// John Wick 1 a 4 (p21 a p24)
        ArrayList<Persona> directores15 = new ArrayList<>();
        directores15.add(new Persona("Chad Stahelski", 55, "N/A"));
        ArrayList<Persona> actores15 = new ArrayList<>();
        actores15.add(new Persona("Keanu Reeves", 59, "N/A"));
        Pelicula p21 = new Pelicula("John Wick 1", "Acción", 101, directores15, actores15, idiomas1);
        Pelicula p22 = new Pelicula("John Wick 2", "Acción", 122, directores15, actores15, idiomas1);
        Pelicula p23 = new Pelicula("John Wick 3", "Acción", 131, directores15, actores15, idiomas1);
        Pelicula p24 = new Pelicula("John Wick 4", "Acción", 169, directores15, actores15, idiomas1);

        ArrayList<Persona> directoresBarbie = new ArrayList<>();
        directoresBarbie.add(new Persona("Conrad Helten", 50, "N/A"));
        ArrayList<Persona> actoresBarbie = new ArrayList<>();
        actoresBarbie.add(new Persona("Erica Lindbeck", 32, "N/A")); // voz de Barbie
        ArrayList<String> idiomasBarbie = new ArrayList<>(idiomas1); // Español, Inglés, Alemán, Árabe
        Pelicula p25 = new Pelicula("Barbie y los delfines mágicos", "Animación", 64, directoresBarbie, actoresBarbie, idiomasBarbie);

        e1.addPelicula(p5);   // (solo en e1)
        e4.addPelicula(p12);  // (solo en e4)
        e1.addPelicula(p1);
        e1.addPelicula(p2);
        e1.addPelicula(p3);
        e1.addPelicula(p15);
        e1.addPelicula(p21);
        e2.addPelicula(p2);
        e2.addPelicula(p4);
        e2.addPelicula(p6);
        e2.addPelicula(p16);
        e2.addPelicula(p22);
        e2.addPelicula(p25);
        e3.addPelicula(p1);
        e3.addPelicula(p7);
        e3.addPelicula(p8);
        e3.addPelicula(p17);
        e3.addPelicula(p23);
        e4.addPelicula(p3);
        e4.addPelicula(p9);
        e4.addPelicula(p10);
        e4.addPelicula(p18);
        e4.addPelicula(p24);
        e5.addPelicula(p6);
        e5.addPelicula(p11);
        e5.addPelicula(p13);
        e5.addPelicula(p19);
        e5.addPelicula(p21);
        e6.addPelicula(p7);
        e6.addPelicula(p8);
        e6.addPelicula(p14);
        e6.addPelicula(p20);
        e6.addPelicula(p25);

        v1.addEstanteria(e1);
        v1.addEstanteria(e2);
        v1.addEstanteria(e3);
        v2.addEstanteria(e4);
        v2.addEstanteria(e5);
        v2.addEstanteria(e6);

        s.masTiempo(v1);
        s.masTiempo(v2);

        s.addVideoclub(v1);
        s.addVideoclub(v2);

        System.out.println("Hola bienvenido al sistema");

        System.out.println("Actores mayores de Rush:");
        for (Persona persona : s.actoresMayores(p10)) {
            persona.imprimir();
        }

        System.out.println("Directores del estante 5 que se repiten:");
        for (Persona persona : s.masDeUnaPeli(e5)) {
            persona.imprimir();
        }

        System.out.println("Videoclubs de la comuna 12:");
        for(String direccion : s.videoclubPorComuna(12)){
            System.out.println(direccion);
        }

        System.out.println("Pelis del videoclub 1 que duran menos de 90min:");
        for(Pelicula pelicula : s.peliculasMenor90(v1)){
            pelicula.printInfo();
        }

        System.out.println("El videoclub con más pelis es: "+s.videoClubMasPelis().getDireccion());

        System.out.println("Todas las películas de acción:");
        for(Pelicula pelicula : s.pelisDeGenero("Acción")){
            pelicula.printInfo();
        }


    }
}



