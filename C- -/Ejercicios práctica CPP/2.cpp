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
    Producto pasillo[3][4];
    float sump=0; //suma de los precios
    float promp=0; //promedio
    float maxp=0; //precio mayor
    int maxc=0; //columna del p. mayor
    for (int i = 0; i < 3; i++) { 
        for (int j = 0; j < 4; j++) { 
            cout<<"Producto fila "<<i<<" columna "<<j<<endl;
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
        }
    }

    cout<<"Producto fila 2 columna 3"<<endl;
    cout<<pasillo[2][3].nombre<<endl;

}