#include "nodo.h"

Dias :: Dias()
{
    this->primero = NULL;
    this->ultimo = NULL;
    this->tam = 0;
    //ctor
}
void Dias::insertar(string dia){
   if(this->primero = NULL){
        this->primero = new Dia (dia);
        this->ultimo = this->primero;
        this->tam ++;
   }
   else{
        Dia nuevo = new Dia(dia);
        ultimo->sig = nuevo;
        this->ultimo = nuevo;
        this->tam++;

   }
}
void Dias::print(){
    Dia *aux = primero;
    while(aux->sig != NULL){
        cout << aux->dia;
        aux = aux->sig;
    }
}

Dias::~Dias()
{
    //dtor
}
