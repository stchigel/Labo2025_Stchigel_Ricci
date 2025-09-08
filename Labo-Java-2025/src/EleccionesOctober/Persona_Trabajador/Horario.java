package EleccionesOctober.Persona_Trabajador;

import java.time.LocalTime;

public class Horario {
    private LocalTime horaEntrada;
    private LocalTime horaSalida;

    public Horario(LocalTime horaEntrada, LocalTime horaSalida) {
        if(horaEntrada.isBefore(horaSalida)){
            this.horaEntrada = horaEntrada;
        }
        if(horaSalida.isAfter(horaEntrada)){
            this.horaSalida = horaSalida;
        }
    }

    public Horario() {
        this.horaEntrada = LocalTime.now();
        this.horaSalida = LocalTime.now();
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }
}
