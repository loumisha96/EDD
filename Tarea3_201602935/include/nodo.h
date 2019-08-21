#ifndef NODO_H
#define NODO_H
#include <iostream>
#include <string>
#include <fstream>
using namespace std;


struct Dia{
    string dia;
   // nodo(dia);
    Dia *sig;

};
struct Dias{
   Dia *primero;
   Dia *ultimo;
   int tam ;
   Dias();
   void insertar(string dia);
   void print();
};

#endif // NODO_H
