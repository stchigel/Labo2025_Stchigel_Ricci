package SistemaPesoAltura;

public class Registro {
    private Double peso;
    private Double altura;

    public Registro(Double peso, Double altura){
        this.peso=peso;
        this.altura=altura;
    }

    public Registro(){
        this.peso=0.0;
        this.altura=0.0;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
