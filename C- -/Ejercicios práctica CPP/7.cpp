#include <vector>
#include <string>
#include <iostream>
#include <tuple>

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
    float puntos=0;
};

void inicializar_pilotos_y_equipos(vector<Piloto>& pilotos, vector<equipo>& equipos) {
    vector<string> nombres_equipos = {
        "Red Bull", "McLaren", "Ferrari", "Mercedes", "Aston Martin",
        "Haas", "Alpine", "Toro Rosso", "Sauber", "Williams"
    };
    
    equipos.resize(nombres_equipos.size());
    for (size_t i = 0; i < nombres_equipos.size(); i++) {
        equipos[i].nombre = nombres_equipos[i];
        equipos[i].puntos = 0;
    }

    vector<tuple<string, string, int, string>> datos_pilotos = {
        {"Max", "Verstappen", 1, "Red Bull"},
        {"Liam", "Lawson", 30, "Toro Rosso"},
        {"Lando", "Norris", 4, "McLaren"},
        {"Oscar", "Piastri", 81, "McLaren"},
        {"Lewis", "Hamilton", 44, "Ferrari"},
        {"Charles", "Leclerc", 16, "Ferrari"},
        {"George", "Russell", 63, "Mercedes"},
        {"Kimi", "Antonelli", 12, "Mercedes"},
        {"Fernando", "Alonso", 14, "Aston Martin"},
        {"Lance", "Stroll", 18, "Aston Martin"},
        {"Esteban", "Ocon", 31, "Haas"},
        {"Oliver", "Bearman", 87, "Haas"},
        {"Pierre", "Gasly", 10, "Alpine"},
        {"Franco", "Colapinto", 43, "Alpine"},
        {"Yuki", "Tsunoda", 22, "Red Bull"},
        {"Isack", "Hadjar", 6, "Toro Rosso"},
        {"Nico", "Hülkenberg", 27, "Sauber"},
        {"Gabriel", "Bortoleto", 5, "Sauber"},
        {"Alexander", "Albon", 23, "Williams"},
        {"Carlos", "Sainz", 55, "Williams"}
    };

    pilotos.resize(datos_pilotos.size());
    for (size_t i = 0; i < datos_pilotos.size(); i++) {
        pilotos[i].nombre = get<0>(datos_pilotos[i]);
        pilotos[i].apellido = get<1>(datos_pilotos[i]);
        pilotos[i].numeroAuto = get<2>(datos_pilotos[i]);
        pilotos[i].equipo = get<3>(datos_pilotos[i]);
        
        for (size_t j = 0; j < equipos.size(); j++) {
            if (equipos[j].nombre == pilotos[i].equipo) {
                pilotos[i].idEquipo = j;
                break;
            }
        }
    }
}
void cargar_pilotos(vector<Piloto>&pilotos, vector<equipo>&Equipos){
    pilotos.resize(20);
    for(int i=0; i<20; i++){
        cout<<"Ingresar nombre piloto "<<i+1<<": "<<endl;
        cin>>pilotos[i].nombre;
        cout<<"Ingresar apellido piloto "<<i+1<<": "<<endl;
        cin>>pilotos[i].apellido;
        cout<<"Ingresar numero del auto del piloto "<<i+1<<": "<<endl;
        cin>>pilotos[i].numeroAuto;
        cout<<"Ingresar equipo del piloto "<<i+1<<": "<<endl;
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
        cout<<"Ingresar nombre equipo "<<i+1<<": "<<endl;
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

void ordenar_tabla_equipos(vector<equipo>&Equipos,vector<Piloto>&pilotos) {
    for (int i = 0; i < Equipos.size() - 1; i++) {
        for (int j = 0; j < Equipos.size() - i - 1; j++) {
            if (Equipos[j].puntos > Equipos[j + 1].puntos) {
                equipo temp = Equipos[j];
                Equipos[j] = Equipos[j + 1];
                Equipos[j + 1] = temp;
            }
        }
    }
    for (int i = 0; i < pilotos.size() - 1; i++) {
        for (int j = 0; j < pilotos.size() - i - 1; j++) {
            if (pilotos[j].puntos > pilotos[j + 1].puntos) {
                Piloto temp = pilotos[j];
                pilotos[j] = pilotos[j + 1];
                pilotos[j + 1] = temp;
            }
        }
    }
}

void mostrar_tabla_equipos(vector<equipo> Equipos,vector<Piloto> pilotos){

    /*struct equipo{
    string nombre;
    string piloto1;
    string piloto2;
    float puntos=0;
    };*/
    cout<<"Posiciones Equipos"<<endl;
    cout<<endl;
    for(int i=0; i<Equipos.size();i++){
        cout<<"Posicion: "<<i+1<<" Equipo: "<<Equipos[i].nombre<<" Puntos: "<<Equipos[i].puntos<<endl;
    }
    cout<<"Posiciones Pilotos"<<endl;
    cout<<endl;
    for(int i=0; i<pilotos.size();i++){
        cout<<"Posicion: "<<i+1<<" Piloto: "<<pilotos[i].nombre<<" "<<pilotos[i].apellido;
        cout<<" Puntos: "<<pilotos[i].puntos<<endl;
    }   
}

int main(){
    vector<equipo> Equipos;
    vector<Piloto> pilotos;
    /*cargar_equipos(Equipos);
    cargar_pilotos(pilotos, Equipos);*/
    inicializar_pilotos_y_equipos(pilotos, Equipos); /*Funcion temporal, solo para probar*/
    for (int i = 0; i < 2; i++){
       // 1
       cargar_datos_carrera(pilotos);
       // 2
       calcular_puntaje_piloto_equipo(pilotos, Equipos);
    }
    // 3
    ordenar_tabla_equipos(Equipos, pilotos);
    mostrar_tabla_equipos(Equipos, pilotos);
}
