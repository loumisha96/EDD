#include <iostream>
#include <string.h>

using namespace std;

struct NodoActv{
   std::string nombre;
   NodoActv *sig;
};
struct NodoDia{
    std::string dia;
    NodoDia *sig;
    NodoActv act;
};

NodoDia *raiz;
NodoDia *ultimo;
int tam;
int main()
{
    
	cout << "Seleccionar día";
    cout << "1. Lunes";
    cout << "2. Martes";
    cout << "3. Miércoles";
    cout << "4. Jueves";
    cout << "5. Viernes";
    cout << "6. Sábado";
    cout << "7. Domingo";
    cin>>
    insertar("Lunes", "Leer");
    imprimir();
    return 0;
}
int vacia(){
    return tam = 0;
}
void insertar(std::string dia, std::string nombre){
  NodoDia *nuevoDia = new NodoDia() ;
  NodoActv *nuevaAct = new NodoActv();
  if(vacia()){
        nuevoDia->dia =dia;
        nuevaAct->nombre == nombre;
        raiz == nuevoDia;
        ultimo == nuevoDia;
        tam++;
  }
  else{
        nuevoDia->dia =dia;
        nuevaAct->nombe == nombre;
        *ultimo->sig = nuevoDia;
        *ultimo = nuevoDia;
        tam++;

     }
}
void imprimir(){
    aux = *raiz;
    while(aux->sig != nullptr){
        aux = aux->sig;
        cout<< << aux->dia;
    }

}

