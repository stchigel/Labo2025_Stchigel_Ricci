#include <vector>
#include <string>
#include <iostream>
using namespace std;

struct fecha{
    int dia;
    int mes;
    int anio;
};

struct paciente{
    string nombre;
    string apellido;
    int edad;
    int num;
    fecha proxcita;
};

void ingPaciente(vector<paciente>&Pacientes){
    int cantPAC=0;
    cout<<"Cuantos pacientes queres ingresar"<<endl;
    cin>>cantPAC;
    for(int i=0; i<cantPAC; i++){
        paciente pacienteNuevo;
        cout<<"Ingresa el nombre del nuevo paciente"<<endl;
        cin>>pacienteNuevo.nombre;
        cout<<"Ingresa el apellido del nuevo paciente"<<endl;
        cin>>pacienteNuevo.apellido;
        cout<<"Ingresa la edad del nuevo paciente"<<endl;
        cin>>pacienteNuevo.edad;
        cout<<"Ingresa el numeroMedico del nuevo paciente"<<endl;
        cin>>pacienteNuevo.num;
        cout<<"Ingresa la fecha de la proxima cita del nuevo paciente"<<endl;
        cin >> pacienteNuevo.proxcita.dia;
        cin >> pacienteNuevo.proxcita.mes;
        cin >> pacienteNuevo.proxcita.anio;
        Pacientes.push_back(pacienteNuevo);
    }
}

void cancelarCita(vector<paciente>&Pacientes){
    int numPACcan=0;
    cout<<"Ingresa el numero del paciente el cual quieras cancelar su turno medico"<<endl;
    cin>>numPACcan;
    for (paciente paciente : Pacientes) {
        if (paciente.num==numPACcan){
        paciente.proxcita.dia=0;
        paciente.proxcita.mes=0;
        paciente.proxcita.anio=0;
        }
    }
}

void mostrarTurno(vector<paciente>&Pacientes){
    fecha fechaTURNO;
    cout<<"Ingresa la fecha que quieras ver los turnos"<<endl;
    cin>>fechaTURNO.dia;
    cin>>fechaTURNO.mes;
    cin>>fechaTURNO.anio;
    for(int i=0; i<Pacientes.size(); i++){
        if(Pacientes[i].proxcita.dia==fechaTURNO.dia && Pacientes[i].proxcita.mes==fechaTURNO.mes && Pacientes[i].proxcita.anio==fechaTURNO.anio){
            cout<<Pacientes[i].nombre<<" "<<Pacientes[i].apellido<<endl;
        }
    }
}

void mostrarInfo(vector<paciente>&Pacientes){
    int numPAC=0;
    int indPAC=0;
    int existe=0;
    cout<<"Ingresa el numero del paciente el cual quieras ver su informacion"<<endl;
    cin>>numPAC;
    for(int i=0; i<Pacientes.size(); i++){
        if(Pacientes[i].num==numPAC){
            indPAC = i;
            existe=1;
        } 
    }
    if(existe){
    cout<<"Nombre: "<<Pacientes[indPAC].nombre<<endl;
    cout<<"Apellido: "<<Pacientes[indPAC].apellido<<endl;
    cout<<"Edad: "<<Pacientes[indPAC].edad<<endl;
    cout<<"Numero medico: "<<Pacientes[indPAC].num<<endl;
    cout<<"Proximo turno: "<<Pacientes[indPAC].proxcita.dia<<"/"<<Pacientes[indPAC].proxcita.mes<<"/"<<Pacientes[indPAC].proxcita.anio;
}
    else{
        cout<<"No existe ese paciente"<<endl;
    }
}

int main(){
    vector<paciente>Pacientes;
    int resp = 0;
    while (resp != 5) {
        cout << "1- Ingresar paciente" << endl << "2- Cancelar cita" << endl << "3- Mostrar turno" << endl << "4- Mostrar informacion" << endl << "5- Salir"  <<endl;
        cin >> resp;
        switch (resp) {
            case 1:
                ingPaciente(Pacientes);
                break;
    
            case 2:
                cancelarCita(Pacientes);
                break;
    
            case 3:
                mostrarTurno(Pacientes);
                break;
            
            case 4:
                mostrarInfo(Pacientes);
                break;

            case 5:
                cout << "Saliendo del programa..." << endl;
                break;

            default:
                cout << "Opción no válida, intente de nuevo" << endl;
        }
    }
}