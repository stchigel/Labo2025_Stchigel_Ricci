#include <vector>
#include <string>
#include <iostream>
using namespace std;

/*


Realizar un sistema para la gestión de un McDonald’s.
El sistema cuenta con un menú de 20 productos diferentes, cada uno esta conformado por:
Un nombre, si tiene promoción o no, cantidad de ventas, el precio y la categoría a la que pertenece
(Hamburguesa, Bebida, Postre, etc.).
Ademas, cada pedido realizado debe registrar los siguientes datos:
El nombre del cliente, productos pedidos, cantidad de cada producto,
la fecha que se pidió y el precio total.

Requerimientos:

    Se deberá implementar al menos 2 estructuras y 4 funciones.

Funcionalidades:

    El usuario, antes de poder realizar cualquier acción en el sistema, deberá ingresar todos los 
    productos al mismo.

    Luego de cargar los productos al sistema, el usuario deberá poder registrar un pedido, calculando 
    automáticamente el precio total, considerando las promociones activas (Para los productos que tienen
    promociones activas, se les aplicará un descuento del 20% al precio del producto).

    El usuario deberá poder consultar un pedido específico por el nombre del cliente. Mostrando por 
    pantalla la información del pedido.

    El sistema deberá mostrar por pantalla los productos ordenados por ventas de mayor a menor.


*/

struct fecha{
    int dia;
    int mes;
    int anio;
};

struct producto{
    string nombre;
    bool promo;
    int ventas;
    float precio;
    string categoria;
};

struct pedido{
    string nombre;
    vector<producto>prods;
    vector<int>cants;
    fecha fecha;
    float total;
};

producto busqProd(string nombre, vector<producto> productos){
    for(producto prod : productos){
        if (prod.nombre==nombre) return prod;
    }
    /*terminar*/
};

void ingresoProd(vector<producto>&productos){
    /*productos = {
        {"Big Mac", true, 1500, 5.99, "Hamburguesa"},
        {"Cuarto de Libra", false, 1200, 6.49, "Hamburguesa"},
        {"McNuggets 10 piezas", true, 2000, 4.99, "Pollo"},
        {"McChicken", false, 1000, 5.29, "Pollo"},
        {"Filet-O-Fish", false, 800, 5.79, "Pescado"},
        {"Papas Fritas Pequeñas", true, 3000, 2.49, "Acompañamiento"},
        {"Papas Fritas Medianas", false, 2800, 3.19, "Acompañamiento"},
        {"Papas Fritas Grandes", false, 2600, 3.89, "Acompañamiento"},
        {"McFlurry Oreo", true, 1500, 3.99, "Postre"},
        {"McFlurry M&M's", false, 1300, 4.19, "Postre"},
        {"Sundae de Chocolate", false, 1200, 2.89, "Postre"},
        {"Sundae de Caramelo", true, 1100, 2.89, "Postre"},
        {"McMuffin con Huevo", true, 900, 3.79, "Desayuno"},
        {"McMuffin con Salchicha", false, 850, 3.99, "Desayuno"},
        {"Hash Browns", false, 1400, 1.99, "Desayuno"},
        {"Café Pequeño", true, 2500, 1.49, "Bebida"},
        {"Café Mediano", false, 2400, 1.89, "Bebida"},
        {"Coca-Cola Mediana", false, 2200, 2.29, "Bebida"},
        {"Sprite Grande", true, 2000, 2.49, "Bebida"},
        {"Batido de Vainilla", false, 1600, 3.59, "Bebida"}
    };*/
    for(int i=0; i<20; i++){
        producto prod;
        cout<<"Nombre del producto N°"<<i+1<<": ";
        cin>>prod.nombre;
        cout<<"Precio del producto N°"<<i+1<<": ";
        cin>>prod.precio;
        cout<<"Categoria del producto N°"<<i+1<<": ";
        cin>>prod.categoria;
        cout<<"Tiene promoción? 1=Si 0=No"<<i+1<<": ";
        cin>>prod.promo;
        prod.ventas=0;
        productos.push_back(prod);
    }
}

void regPedido(vector<producto>&productos, vector<pedido>&pedidos){
    pedido ped;
    string nomProd;
    cout<<"Nombre del cliente: ";
    cin>>ped.nombre;
    cout<<"Fecha: ";
    cin>>ped.fecha.dia;
    cout<<"/";
    cin>>ped.fecha.mes;
    cout<<"/";
    cin>>ped.fecha.anio;
    while(nomProd!="listo"){
        producto Prodn;
        int Cant;
        cout<<"Nombre del producto (Si ya no quiere ingresar, ponga \"listo\"): ";
        cin>>nomProd;
        if(nomProd=="listo"){
            cout<<"Listo confirmado";
        }else{
            for(int i=0; i<productos.size(); i++){
                if(productos[i].nombre==nomProd){
                    productos[i].ventas+=1;
                    Prodn.categoria=productos[i].categoria;
                    Prodn.nombre=productos[i].nombre;
                    Prodn.precio=productos[i].precio;
                    Prodn.promo=productos[i].promo;
                    Prodn.ventas=productos[i].ventas;
                }
            }
            ped.prods.push_back(Prodn);
            cout<<"Cantidad";
            cin>>Cant;
            ped.cants.push_back(Cant);
            if(Prodn.promo){
                ped.total+=(Prodn.precio*0.8);
            } else {
                ped.total+=Prodn.precio;
            }
        }
    }
    pedidos.push_back(ped);
}