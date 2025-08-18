package Tiendas.compragamer.Funcionamiento;

import Tiendas.compragamer.Compra.Pedido;
import Tiendas.compragamer.Electronica.Cpu;

import java.util.ArrayList;

public class Sistema{
    private ArrayList<Pedido>pedidos;
    private ArrayList<Cpu>compusVendidas;

    public Sistema(){
        this.pedidos=new ArrayList<>();
    }

    public Sistema(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void agregarPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    public void actualizarStock(){
        for(Pedido p:pedidos){
            p.actStock();
            for(Cpu c: p.compusVendidas()){
                compusVendidas.add(c);
            }
        }
    }

    public void calcularPrecio(){
        for(Pedido p : pedidos){
            p.calcPrecio();
        }
    }

    public void cantDispEoS(Cpu cpu){
        for(Pedido p : pedidos){
            if(p.getCPU().equals(cpu)){
                System.out.println("Entrada: " + p.cantEntrada() + " Salida: " + p.cantSalida());
            }
        }

    }
}
