#include <vector>
#include <string>
#include <iostream>
using namespace std;

struct Empleado{
    string nombre;
    string apellido;
    string fecha;
    string sexo;
    float salario=0;
};

void ingresarEmpleados(vector<Empleado>&empleados){
    int resp;
    Empleado empNuevo;
    cout<<"1- Ingresar nuevo empleado"<<endl<<"2- Salir"<<endl;
    cin>>resp;
    while(resp!=1&&resp!=2){
        cout<<"Opción no válida, intente denuevo"<<endl;
        cin>>resp;
    }
    if (resp==1){
        cout<<"Nombre del empleado"<<endl;
        cin>>empNuevo.nombre;
        cout<<"Apellido del empleado"<<endl;
        cin>>empNuevo.apellido;
        cout<<"Fecha de nacimiento (AAAA/MM/DD)"<<endl;
        cin>>empNuevo.fecha;
        cout<<"Sexoooooooo del empleado (M/F)"<<endl;
        cin>>empNuevo.sexo;
        cout<<"Salario del empleado"<<endl;
        cin>>empNuevo.salario;
    } else {
        return;
    }
    
}

void empleadoConMayorSueldo(vector<Empleado>empleados, vector<Empleado>&empVacios,Empleado&empleadoMejor){
    empVacios.clear();
    empleadoMejor=empleados[0];
    for(int i=0; i<empleados.size(); i++){
        if(empleados[i].salario<=400000){
            empVacios.push_back(empleados[i]);
        }
        if(empleadoMejor.salario<empleados[i].salario){
            empleadoMejor=empleados[i];
        }
    }
}

void MostrarDatos(vector<Empleado>&empVacios,Empleado empleadoMejor){
    cout<<"El empleado con mas sueldo es: "<< empleadoMejor.nombre<< " " << empleadoMejor.apellido << endl;
    for(int i=0; i<empVacios.size();i++){
        cout<<empVacios[i].nombre<< " " << empVacios[i].apellido << " cobra: " << empVacios[i].salario << endl;
    }

}

int main(){
    vector<Empleado>empleados;
    vector<Empleado>empVacios;
    Empleado empleadoMejor;
    int resp=0;
    
    while(resp!=3){
        cout<<"1- ingresar personas"<<endl<<"2- Ver mayor y menor sueldo"<<endl<<"3- Salir"<<endl;
        cin>>resp;
        switch (resp)
        {
            case 1:
                ingresarEmpleados(empleados);
                break;
    
            case 2:
                empleadoConMayorSueldo(empleados, empVacios,empleadoMejor);
                MostrarDatos(empVacios, empleadoMejor);
                break;
    
            default:
                cout<<"Opción no válida, intente denuevo"<<endl;
        }
    }
}