#include <vector>
#include <string>
#include <iostream>
using namespace std;

struct Producto{
    string nombre;
    int cant;
    float precio;
};

struct Pedido{
    string nombrec;
    int num;
    vector<Producto> prods;
};

void novoPedido(vector<Pedido>&euQueroComida){
    int novosPedidos=0;
    cout<<"Quantos pedidos você deseja inserir?"<<endl;
    cin>>novosPedidos;
    for(int i=0; i<novosPedidos; i++){
        Pedido novoPedido;
        int cantComidas=0;
        cin>>novoPedido.nombrec;
        cin>>novoPedido.num;
        cout<<"Quantas refeições você quer entrar?"<<endl;
        cin>>cantComidas;
        for(int j=0; j<cantComidas; j++){
            Producto novoProducto;
            cin>>novoProducto.nombre;
            cin>>novoProducto.cant;
            cin>>novoProducto.precio;
            novoPedido.prods.push_back(novoProducto);
        }
        euQueroComida.push_back(novoPedido);
    }
}

void cancelarPedidinho(vector<Pedido>&euQueroComida){
    int PedidinhoCanceladinhoNum=0;
    cin>>PedidinhoCanceladinhoNum;
    for(int i=0; i<euQueroComida.size(); i++){
        if(PedidinhoCanceladinhoNum==euQueroComida[i].num){
            euQueroComida.erase(euQueroComida.begin() + i);
        }
    }
}

void verPedidinhos(vector<Pedido>&euQueroComida){
    for(Pedido pedidinho : euQueroComida) {
        float total=0;
        cout<<"Nome do clientinho: "<<pedidinho.nombrec<<endl;
        cout<<"Código do pedidinho: "<<pedidinho.num<<endl;
        for(Producto produto : pedidinho.prods) {
            cout<<"Nome do Refeição: "<<produto.nombre<<endl;
            cout<<"Quantia: "<<produto.cant<<endl;
            cout<<"Preço: "<<produto.precio<<endl;
            total+=produto.cant*produto.precio;
        }
        cout<<"Total do pedidinho: "<<total<<endl;
    }
}

void totalDia(vector<Pedido>&euQueroComida){
    int total=0;
    for(Pedido pedidinho : euQueroComida) {
        int totalp=0;
        for(Producto produto : pedidinho.prods) {
            total+=produto.cant*produto.precio;
        }
        total+=totalp;
    }
    cout<<"Total do dia: "<<total<<endl;
}

// Eu sou Masivo Bro

int main(){
    vector<Pedido>euQueroComida;
}
//masicvo bro masivo bro maisvo bro mmas
//enorme mano
//amo a el colo ponzi ojala me nserte su colorada y me lo deje colroado
//Eu amo Colo Ponzi, espero que ele insira sua cor vermelha em mim e deixe vermelho