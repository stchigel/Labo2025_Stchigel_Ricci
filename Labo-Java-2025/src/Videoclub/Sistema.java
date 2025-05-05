package Videoclub;
import unidad1.Persona;
import java.util.ArrayList;

public class Sistema {

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

    public ArrayList<String> videoclubPorComuna(ArrayList<Videoclub> Videoclubs, String codePostal){
        ArrayList<String>videoclubComuna=new ArrayList<>();
        for(Videoclub clubVideo : Videoclubs){
            if(clubVideo.getCodigoPostal().equals(codePostal)){
                videoclubComuna.add(clubVideo.getDireccion());
            }
        }
        return videoclubComuna;
    }

    public ArrayList<Pelicula> peliculasMenor90mins(ArrayList<Videoclub> Videoclubs, Videoclub clubVideoEspecifico){
        ArrayList<Pelicula>peliMenos90mins=new ArrayList<>();
        for(Videoclub clubVideo :Videoclubs){
            if(clubVideo.equals(clubVideoEspecifico)){
                for(Estanteria estanteria:clubVideo.getEstanterias()){
                    for(Pelicula pelicula : estanteria.getPeliculas()){
                        if(pelicula.getDuracion()<90){
                            peliMenos90mins.add(pelicula);
                        }
                    }
                }
            }
        }
        return peliMenos90mins;
    }

    public Videoclub videoClubMasPelis(ArrayList<Videoclub> Videoclubs){
        Videoclub clubVideoMaspelis=Videoclubs.getFirst();
         for(Videoclub clubVideo :Videoclubs){
             if(clubVideoMaspelis.cantPeliculas() < clubVideo.cantPeliculas()){
                 clubVideoMaspelis=clubVideo;
             }
         }
        return clubVideoMaspelis;
    }



    public static void main(String[] args) {
            Sistema s = new Sistema();
            ArrayList<Videoclub> Videoclubs=new ArrayList<>();
        }
}



