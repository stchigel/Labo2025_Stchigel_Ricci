package tiempo;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(){
        this.dia=0;
        this.mes=0;
        this.anio=0;
    }

    public Fecha(int dia, int mes, int anio){
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int diasMes(int mes){
        switch (mes){
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 2:
                if ((this.anio % 4 == 0 && this.anio % 100 != 0) || (this.anio % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            case 4, 6, 9, 11:
                return 30;
            default:
                return 0;
        }
    }

    public void valida(){
        if(this.dia>diasMes(this.mes)) this.dia=31;
        if(this.mes>12) this.mes=12;
        if(this.dia<1) this.dia=1;
        if(this.mes<1) this.mes=1;
        if(this.anio<0) this.anio=0;
    }

    public void corta(){
        System.out.println(this.dia+"-"+this.mes+"-"+this.anio);
    }

    public void larga(){
        System.out.println("El día "+this.dia+" del "+this.mes+" de "+this.anio);
    }

    public void siguiente(){
        this.dia++;
    }

    public void anterior(){
        this.dia -= 1;
    }

    public boolean igualQue (Fecha fecha){
        if(this.dia==fecha.getDia() && this.mes==fecha.getMes() && this.anio==fecha.getAnio()){
            return true;
        } else {
            return false;
        }
    }

    public boolean mayorQue (Fecha fecha){
        if(this.anio>fecha.getAnio()){
            return true;
        } else if (this.anio<fecha.getAnio()) {
            return false;
        } else if(this.mes>fecha.getMes()){
            return true;
        } else if (this.mes<fecha.getMes()) {
            return false;
        } else if(this.dia>fecha.getDia()){
            return true;
        } else if (this.dia<fecha.getDia()) {
            return false;
        } else {
            return false;
        }
    }

    public boolean menorQue (Fecha fecha){
        if(this.anio>fecha.getAnio()){
            return false;
        } else if (this.anio<fecha.getAnio()) {
            return true;
        } else if(this.mes>fecha.getMes()){
            return false;
        } else if (this.mes<fecha.getMes()) {
            return true;
        } else if(this.dia>fecha.getDia()){
            return false;
        } else if (this.dia<fecha.getDia()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Fecha f1 = new Fecha(23, 06, 1994);
        f1.corta();
        f1.siguiente();
        f1.larga();
        f1.anterior();
        f1.corta();
        Fecha f2 = new Fecha();
        f2.setAnio(1995);
        f2.setDia(15);
        f2.setMes(13);
        f2.valida();
        f2.corta();
        System.out.println("Es mas grande? " + f1.mayorQue(f2));
        System.out.println("Es mas chico? " + f1.menorQue(f2));
        System.out.println("Es igual? " + f1.igualQue(f2));
    }
}
