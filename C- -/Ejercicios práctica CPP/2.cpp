#include <vector>
#include <string>
#include <iostream>
using namespace std;

struct Producto{
    string nombre;
    string marca;
    int codigo;
    float precio;
    bool vencimiento;
};

int main(){
    Producto pasillo[3][4]/* = {
        { {"Leche", "La Serenísima", 1001, 120.5, true}, {"Pan", "Bimbo", 1002, 250.0, true}, {"Arroz", "Gallo", 1003, 180.0, false}, {"Fideos", "Matarazzo", 1004, 200.0, false} },
        { {"Gaseosa", "Coca-Cola", 1005, 350.0, false}, {"Yerba", "Taragüí", 1006, 800.0, false}, {"Azúcar", "Ledesma", 1007, 450.0, false}, {"Café", "Nescafé", 1008, 1000.0, false} },
        { {"Dulce de leche", "Havanna", 1009, 1200.0, false}, {"Queso", "La Paulina", 1010, 1500.0, true}, {"Manteca", "Sancor", 1011, 950.0, true}, {"Galletitas", "Oreo", 1012, 500.0, false} }
    }*/;
    float sump=0; //suma de los precios
    float promp=0; //promedio
    float maxp=0; //precio mayor
    int maxc=0; //columna del p. mayor
    int cantv=0; //cant de prod con venc
    for (int i = 0; i < 3; i++) { 
        for (int j = 0; j < 4; j++) { 
            cout<<"Producto fila "<<i+1<<" columna "<<j+1<<endl;
            cout<<"Ingrese nombre"<<endl;
            cin>>pasillo[i][j].nombre;
            cout<<"Ingrese marca"<<endl;
            cin>>pasillo[i][j].marca;
            cout<<"Ingrese codigo"<<endl;
            cin>>pasillo[i][j].codigo;
            cout<<"Ingrese precio"<<endl;
            cin>>pasillo[i][j].precio;
            cout<<"Vence o no? 0=No 1=Si"<<endl;
            cin>>pasillo[i][j].vencimiento;
        }
    }

    for (int i = 0; i < 3; i++) { 
        for (int j = 0; j < 4; j++) { 
            Producto prod = pasillo[i][j];
            if (prod.precio>maxp){
                maxc=j;
            }
            sump+=prod.precio;
            if (prod.vencimiento) cantv+=1;
        }
    }

    promp=sump/12;

    cout<<"Columna con el producto mas caro: "<<endl;
    cout<<maxc+1<<endl;

    cout<<"Producto fila 2 columna 3: "<<endl;
    cout<<pasillo[1][2].nombre<<endl;

    cout<<"Promedio precios: "<<endl;
    cout<<promp<<endl;

    cout<<"Cantidad de productos que vencen: "<<endl;
    cout<<cantv<<endl;
}

//masivo bro