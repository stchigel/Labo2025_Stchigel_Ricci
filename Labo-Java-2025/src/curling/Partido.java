package curling;

import java.util.Date;

public class Partido {
    Equipo equipoLocal;
    Equipo equipoVisitante;
    Date dia;
    String turno;

    public Partido() {
        this.equipoLocal = new Equipo();
        this.equipoVisitante = new Equipo();
        this.dia = new Date();
        this.turno = "N/A";
    }

    public Partido(Equipo equipoLocal, Equipo equipoVisitante, Date dia, String turno) {
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

    public Date getDia() {
        return this.dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public String getTurno() {
        return this.turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
