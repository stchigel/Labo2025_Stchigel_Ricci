package compragamer;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Cpu>CPU;
    private ArrayList<Componente>Perifericos;
    private Double precio;
    private String metodoPago;


    public Pedido() {
        this.CPU = new ArrayList<>();
        Perifericos = new ArrayList<>();
        this.precio=0.0;
        this.metodoPago="Efectivo";
    }

    public Pedido(ArrayList<Cpu> CPU, ArrayList<Componente> perifericos, Double precio, String metodoPago) {
        this.CPU = CPU;
        Perifericos = perifericos;
        this.precio = precio;
        this.metodoPago = metodoPago;
    }

    public Cpu getCPU() {
        return CPU;
    }

    public void setCPU(ArrayList<Componente> CPU) {
        ArrayList<Componente>auxC=new ArrayList<>();
        for (Componente p : CPU) {
            if (p.getTipo() == "CPU") {
                auxC.add(p);
            }
        }
        this.CPU=auxC;
    }

    public ArrayList<Componente> getEntrada() {
        return Entrada;
    }

    public void setEntrada(ArrayList<Componente> entrada) {
        ArrayList<Componente>auxE=new ArrayList<>();
        for (Componente p : entrada){
            if (p.getTipo() == "Entrada") {
                auxE.add(p);
            }
        }
        this.Entrada=auxE;
    }

    public ArrayList<Componente> getsalida() {
        return salida;
    }

    public void setsalida(ArrayList<Componente> salida) {
        ArrayList<Componente>auxS=new ArrayList<>();
        for (Componente p : salida){
            if (p.getTipo() == "Salida") {
                auxS.add(p);
            }
        }
        this.salida=auxS;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
}
