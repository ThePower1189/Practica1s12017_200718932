/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_200718932;

/**
 *
 * @author Lisbeth
 */
public class ListaDiccionario {
    
    private NodoDiccionario inicio;
    private int tamano;
    
    public void Lista(){
        
        inicio = null;
        tamano = 0;
        
    }
    
    public boolean esVacia(){
        
        return inicio == null;
       
    }
    
    public int getTamano(){
        
        return tamano;
        
    }
    
    public void agregarAlFinal(int tamano){
        
         NodoDiccionario nuevo = new NodoDiccionario();
         
         if (esVacia()){
             
             inicio = nuevo;
             
         }else{
             
             NodoDiccionario aux = inicio;
             
             while (aux.getSiguiente()!= null){
                 
                 aux = aux.getSiguiente();
             }
             
             aux.setSiguiente(nuevo);
         }
     
         tamano++;
         
    }
            
            
    
}
