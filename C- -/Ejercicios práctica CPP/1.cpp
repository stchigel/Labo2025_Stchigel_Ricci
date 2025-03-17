#include <vector>
#include <string>
#include <iostream>
using namespace std;

//corregido

struct fechinia{
    int dia=0;
    int mes=0;
    int anio=0;
};

struct Empleado{
    string nombre;
    string apellido;
    fechinia fecha;
    string sexo;
    float salario = 0;
};



void ingresarEmpleados(vector<Empleado>& empleados){
    int resp;
    Empleado empNuevo;
    cout << "1- Ingresar nuevo empleado" << endl << "2- Salir" << endl;
    cin >> resp;
    while (resp != 1 && resp != 2) {
        cout << "Opción no válida, intente de nuevo" << endl;
        cin >> resp;
    }
    if (resp == 1) {
        cout << "Nombre del empleado: ";
        cin >> empNuevo.nombre;
        cout << "Apellido del empleado: ";
        cin >> empNuevo.apellido;
        cout << "Fecha de nacimiento (AAAA/MM/DD): ";
        cin >> empNuevo.fecha.dia;
        cin >> empNuevo.fecha.mes;
        cin >> empNuevo.fecha.anio;
        cout << "Sexo del empleado (M/F): ";
        cin >> empNuevo.sexo;
        while (empNuevo.sexo != "M" && empNuevo.sexo != "F") {
            cout << "Sexo no válido. Ingrese (M/F): ";
            cin >> empNuevo.sexo;
        }
        cout << "Salario del empleado: ";
        cin >> empNuevo.salario;
        while (empNuevo.salario < 0) {
            cout << "El salario no puede ser negativo. Ingrese nuevamente el salario: ";
            cin >> empNuevo.salario;
        }
        empleados.push_back(empNuevo);
    }
}

void empleadoConMayorSueldo(const vector<Empleado>& empleados, vector<Empleado>& empVacios, Empleado& empleadoMejor){
    empleadoMejor = empleados[0];  

    for (int i = 0; i < empleados.size(); i++) {
        if (empleados[i].salario <= 400000) {
            empVacios.push_back(empleados[i]);  
        }
        if (empleados[i].salario > empleadoMejor.salario) {
            empleadoMejor = empleados[i];  
        }
    }
}

void MostrarDatos(const vector<Empleado>& empVacios, const Empleado& empleadoMejor) {
    cout << "El empleado con mayor sueldo es: " << empleadoMejor.nombre << " " << empleadoMejor.apellido << " con un salario de: " << empleadoMejor.salario << endl;
    cout << "Empleados con salario inferior o igual a 400000:" << endl;
    for (int i = 0; i < empVacios.size(); i++) {
        cout << empVacios[i].nombre << " " << empVacios[i].apellido << " cobra: " << empVacios[i].salario << endl;
    }
}

int main() {
    vector<Empleado> empleados;
    vector<Empleado> empVacios;
    Empleado empleadoMejor;
    int resp = 0;

    while (resp != 3) {
        cout << "1- Ingresar empleados" << endl << "2- Ver mayor y menor sueldo" << endl << "3- Salir" << endl;
        cin >> resp;
        switch (resp) {
            case 1:
                ingresarEmpleados(empleados);
                break;
    
            case 2:
                empVacios.clear();  
                empleadoConMayorSueldo(empleados, empVacios, empleadoMejor);
                MostrarDatos(empVacios, empleadoMejor);
                break;
    
            case 3:
                cout << "Saliendo del programa..." << endl;
                break;
    
            default:
                cout << "Opción no válida, intente de nuevo" << endl;
        }
    }
}

//masivo bro