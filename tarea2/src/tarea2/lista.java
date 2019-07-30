/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author lourd
 */
public class lista {
    bolsa inicio, ultimo;
    int cont;
    public lista(){
        inicio = null;
        ultimo = null;
        cont = 0;
    }
    
    public void insertar(bolsa Bolsa, Object e){
      if(esvacia()){
          Bolsa.elemento = e;
          inicio = Bolsa;
          ultimo = Bolsa;
          ultimo.sig = inicio;
          cont++;
      }
      else{
          Bolsa.elemento = e;
          bolsa aux = inicio;
          while(aux.sig != inicio){
              aux = aux.sig;
          }
          aux.sig = Bolsa;
          Bolsa.sig = inicio;
          cont++;
      }
   }
   
   public boolean esvacia(){
       if(inicio == null){
           return true;
       }
       else 
           return false;
   }
   public void cuantos(){
       if (cont == 0){
           System.out.println("No hay valores agregados");
       }
       else
            System.out.println(cont + "valores agregados");
   }
   public void recorrer_mostrar(){
        bolsa aux;
        aux = inicio;
        for(int i =0; i<cont; i++){
            System.out.println(aux.elemento);
            aux = aux.sig;
        }
        
    }
}
