package sistemaDePedidos;

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
}
