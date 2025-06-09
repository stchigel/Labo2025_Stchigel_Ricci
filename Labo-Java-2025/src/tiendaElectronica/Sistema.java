package tiendaElectronica;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Producto> productos;

    public Sistema() {
        this.productos = new ArrayList<>();
    }

    public Sistema(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void addProducto(Producto producto){
        productos.add(producto);
    }

    public void modificarProducto(Producto productoViejo, Producto productoNuevo){
        for(Producto p : productos){
            if(p.equals(productoViejo)){
                p=productoNuevo;
            }
        }
    }

    public void eliminarProducto(Producto productoEliminar){
        productos.remove(productoEliminar);
    }

    public void calcStock(){
        Producto moreS=productos.getFirst();
        Producto lessS=productos.getFirst();
        for(Producto p: productos){
            if(p.getStock()> moreS.getStock()){
                moreS=p;
            }
            else if(p.getStock()< lessS.getStock()){
                lessS=p;
            }
        }
    }

    public Producto maxStock(){
        Producto moreS=productos.getFirst();
        for(Producto p: productos){
            if(p.getStock()> moreS.getStock()){
                moreS=p;
            }
        }
        return moreS;
    }

    public Producto minStock(){
        Producto lessS=productos.getFirst();
        for(Producto p: productos){
            if(p.getStock()< lessS.getStock()){
                lessS=p;
            }
        }
        return lessS;
    }
}
