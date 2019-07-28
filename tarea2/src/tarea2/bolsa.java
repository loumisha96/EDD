package tarea2;
public class bolsa {
   public bolsa inicio;
   public String elemento;
   public bolsa sig;
   
   int cont;
   public void insertar(bolsa Bolsa, String e){
      if(esvacia(Bolsa)){
          Bolsa.elemento = e;
          inicio = Bolsa;
          inicio.sig = inicio;
          cont++;
      }
      else{
          bolsa aux = new bolsa();
          aux = inicio;
          while(aux.sig != inicio){
              aux = aux.sig;
          }
          Bolsa.sig = inicio;
          inicio.sig = Bolsa;
          cont++;
      }
   }
   public boolean esvacia(bolsa Bolsa){
       if(inicio == null){
           return true;
       }
       else 
           return false;
   }
   public void cuantos(bolsa Bolsa, String e){
      if(esvacia(Bolsa)){
          cont = 0;
      } 
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


