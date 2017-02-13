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
public class NodoDiccionario {
    
    private int valor;
    private NodoDiccionario siguiente;
    
    public void Nodo(){
        
        valor = 0;
        siguiente = null;
    }
    
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoDiccionario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDiccionario siguiente) {
        this.siguiente = siguiente;
    }
    
}


