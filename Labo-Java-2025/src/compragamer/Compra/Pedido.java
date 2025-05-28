package compragamer.Compra;

import compragamer.Electronica.Componente;
import compragamer.Electronica.Cpu;
import compragamer.Electronica.Entrada;
import compragamer.Electronica.Salida;
import compragamer.Pago.Metodopago;
import compragamer.Pago.Tarjeta;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Cpu>CPU;
    private ArrayList<Componente>perifericos;
    private Double precio;
    private Metodopago metodoPago;
    private Cliente cliente;


    public Pedido() {
        this.CPU = new ArrayList<>();
        this.perifericos = new ArrayList<>();
        this.precio=0.0;
        this.metodoPago=new Metodopago();
        this.cliente=new Cliente();
    }

    public Pedido(ArrayList<Cpu> CPU, ArrayList<Componente> perifericos, Double precio, Metodopago metodoPago, Cliente cliente) {
        this.CPU = CPU;
        this.perifericos = perifericos;
        this.precio = precio;
        this.metodoPago = metodoPago;
        this.cliente=cliente;
    }

    public ArrayList<Cpu> getCPU() {
        return CPU;
    }

    public void setCPU(ArrayList<Cpu> CPU) {
        this.CPU = CPU;
    }

    public ArrayList<Componente> getPerifericos() {
        return this.perifericos;
    }

    public void setPerifericos(ArrayList<Componente> perifericos) {
        this.perifericos = perifericos;
    }

    public Double getPrecio() {
        calcPrecio();
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Metodopago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(Metodopago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void calcPrecio(){
        Double aux=0.0;
        for(Componente componente : perifericos){
            aux+=componente.getPrecio();
        }
        for(Cpu cpu : CPU){
            aux+=cpu.calcPrecio();
        }
        if(metodoPago instanceof Tarjeta){
           precio=aux*1.05;
        }
        else{
            precio=aux;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void actStock(){
        for(Cpu pc : CPU){
            for(Componente c : pc.getComponentes()){
                c.actualizarStock();
            }
        }
        for(Componente per: perifericos){
            per.actualizarStock();
        }
    }

    public int cantEntrada() {
        int ent = 0;
        for (Componente c : perifericos) {
            if (c instanceof Entrada) {
                ent += 1;
            }
        }
        return ent;
    }

    public int cantSalida() {
        int sal = 0;
        for (Componente c : perifericos) {
            if (c instanceof Salida) {
                sal += 1;
            }
        }
        return sal;
    }

    public ArrayList<Cpu> compusVendidas(){
        ArrayList<Cpu>aux=new ArrayList<>();
        for(Cpu c : CPU){
            aux.add(c);
        }
        return aux;
    }
}
