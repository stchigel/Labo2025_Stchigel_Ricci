#include <vector>
#include <string>
#include <iostream>
using namespace std;

struct Vuelta_rapida {
    int numero_vuelta;
    float tiempo;
};

struct carrera{
    int posicionQualy=0;
    int posicionCarrera=0;
    Vuelta_rapida vueltaRapida;
};

struct Piloto{
    string nombre;
    string apellido;
    int numeroAuto=0;
    float puntos=0;
    string equipo;
    int idEquipo=0;
    vector<carrera>Carreras;
};

struct equipo{
    string nombre;
    string piloto1;
    string piloto2;
    float puntos=0;
};

void cargar_pilotos(vector<Piloto>&pilotos, vector<equipo>&Equipos){
    pilotos.resize(20);
    for(int i=0; i<20; i++){
        cin>>pilotos[i].nombre;
        cin>>pilotos[i].apellido;
        cin>>pilotos[i].numeroAuto;
        cin>>pilotos[i].equipo;
        for (int ii=0; ii<Equipos.size(); ii++){
            if(Equipos[ii].nombre==pilotos[i].equipo){
                pilotos[i].idEquipo=ii;
            }
        }
    }
}

void cargar_equipos(vector<equipo>&equipos){
    equipos.resize(10);
    for(int i=0; i<10; i++){
        cin>>equipos[i].nombre;
    }
}

void cargar_datos_carrera(vector<Piloto>&pilotos){
    for(int i=0; i<pilotos.size(); i++){
        carrera nuevCarr;
        cout<<"Piloto: "<<pilotos[i].nombre<<" "<<pilotos[i].apellido<<endl;
        cout<<"Ingrese posición inicial: ";
        cin>>nuevCarr.posicionQualy;
        cout<<"Ingrese posición final: ";
        cin>>nuevCarr.posicionCarrera;
        cout<<"Ingresa tiempo de vuelta mas rapido"<<endl;
        cin>>nuevCarr.vueltaRapida.tiempo;
        cout<<"Ingresa vuelta del tiempo de vuelta mas rapido"<<endl;
        cin>>nuevCarr.vueltaRapida.numero_vuelta;
        pilotos[i].Carreras.push_back(nuevCarr);
    }
}

void calcular_puntaje_piloto_equipo(vector<Piloto>&pilotos, vector<equipo>&Equipos){
    float masRAP=0;
    int posmasRAP=0;
    for(int i=0; i<pilotos.size(); i++){
        int ii=pilotos[i].Carreras.size()-1;
        switch (pilotos[i].Carreras[ii].posicionCarrera)
        {
        case 1:
            pilotos[i].puntos+=25;
            break;
        
        case 2:
            pilotos[i].puntos+=18;
            break;

        case 3:
            pilotos[i].puntos+=15;
            break;
        
        case 4:
            pilotos[i].puntos+=12;
            break;

        case 5:
            pilotos[i].puntos+=10;
            break;

        case 6:
            pilotos[i].puntos+=8;
            break;
        
        case 7:
            pilotos[i].puntos+=6;
            break;

        case 8:
            pilotos[i].puntos+=4;
            break;
        
        case 9:
            pilotos[i].puntos+=2;
            break;

        case 10:
            pilotos[i].puntos+=1;
            break;
        
        default:
            break;
        }
        if(pilotos[i].Carreras[ii].vueltaRapida.tiempo<masRAP){
            masRAP=pilotos[i].Carreras[ii].vueltaRapida.tiempo;
            posmasRAP=i;
        }
    }
    int ii=pilotos[posmasRAP].Carreras.size()-1;
    if (pilotos[posmasRAP].Carreras[ii].posicionCarrera>=10) {
        pilotos[posmasRAP].puntos+=1;
    }
    for(int i=0; i<pilotos.size(); i++){
        Equipos[pilotos[i].idEquipo].puntos+=pilotos[i].puntos;
    }

}

ordenar_tabla_equipos(vector<equipo> Equipos;){

}

ordenar_tabla_equipos(vector<equipo> Equipos;){
    
}

int main(){
    vector<equipo> Equipos;
    vector<Piloto> pilotos;
    cargar_pilotos(pilotos, Equipos);
    for (int i = 0; i < 24; i++){
       // 1
       cargar_datos_carrera(pilotos);
       // 2
       calcular_puntaje_piloto_equipo(pilotos, Equipos);
    }
    // 3
    ordenar_tabla_equipos(Equipos);
    mostrar_tabla_equipos(Equipos);
}
