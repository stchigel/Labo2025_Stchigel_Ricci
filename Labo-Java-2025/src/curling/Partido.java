package curling;

import java.time.LocalDate;
import java.util.Date;

public class Partido {
    Equipo equipoLocal;
    Equipo equipoVisitante;
    LocalDate dia;
    Turno turno;

    public Partido() {
        this.equipoLocal = new Equipo();
        this.equipoVisitante = new Equipo();
        this.dia = LocalDate.of(1,1,1);
        this.turno = Turno.MANIANA;
    }

    public Partido(Equipo equipoLocal, Equipo equipoVisitante, LocalDate dia, Turno turno) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.dia = dia;
        this.turno = turno;
    }

    public Equipo getEquipoLocal() {
        return this.equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return this.equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public LocalDate getDia() {
        return this.dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public Turno getTurno() {
        return this.turno;
    }

    public String getTurnoNombre() {
        return this.turno.name();
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
