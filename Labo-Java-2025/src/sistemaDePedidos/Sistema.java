package sistemaDePedidos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema {
    private ArrayList<Plato> platos;
    private ArrayList<Pedido> pedidos;

    public Sistema() {
        this.platos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public Sistema(ArrayList<Plato> platos, ArrayList<Pedido> pedidos) {
        this.platos = platos;
        this.pedidos = pedidos;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }
    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void agregarPlato(Plato plato) {
        if (plato != null) {
            platos.add(plato);
        }
    }
    public void agregarPedido(Pedido pedido) {
        if (pedido != null) {
            pedidos.add(pedido);
        }
    }
    public boolean eliminarPlato(String nombre) {
        for (int i = 0; i < platos.size(); i++) {
            if (platos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                platos.remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean modificarPlato(Plato platoViejo, Plato platoNuevo) {
        int index = platos.indexOf(platoViejo);
        if (index != -1 && platoNuevo != null) {
            platos.set(index, platoNuevo);
            return true;
        }
        return false;
    }
    public Plato buscarPlato(String nombre){
        for(Plato p : platos){
            if(p.getNombre().equals(nombre)){
                return p;
            }
        }
        return new Plato();
    }

    public void pedidosHoy(){
        for(Pedido p : pedidos){
            if(p.getCreacion().equals(LocalDate.now())){
                System.out.println("Plato: "+p.getPlato().getNombre());
                System.out.println("Solicitante: "+p.getSolicitante().getNombre());
                System.out.println("Hora: "+p.getHora());
                System.out.println("Estado: "+p.getEstado());
                System.out.println("Precio: "+ p.calcularPrecio());
                System.out.println("------------------------------------------------------");
            }
        }
    }

    public int vecesPedido(Plato p){
        int total=0;
        for(Pedido ped : this.pedidos){
            if(ped.getPlato().equals(p)) {
                total++;
            }
        }
        return total;
    }

    public void topTres(){
        Plato p1 = new Plato();
        Plato p2 = new Plato();
        Plato p3 = new Plato();
        int act = 0;
        for (Plato p : platos){
            if(vecesPedido(p)>vecesPedido(p1)){
                p3=p2;
                p2=p1;
                p1=p;
            } else if (vecesPedido(p)>vecesPedido(p2)){
                p3=p2;
                p2=p;
            } else if (vecesPedido(p)>vecesPedido(p3)){
                p3=p;
            }
        }
        System.out.println("Plato top 1: Nombre: "+p1.getNombre()+", Precio: "+p1.getPrecio());
        System.out.println("Plato top 2: Nombre: "+p2.getNombre()+", Precio: "+p2.getPrecio());
        System.out.println("Plato top 3: Nombre: "+p3.getNombre()+", Precio: "+p3.getPrecio());
    }

}
