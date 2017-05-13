/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatos;

/**
 *
 * @author educacionit
 */
public class Pila <t>{
    private final int max;
    private t[] elementos;
    private int tope=-1;
    
    
    public void empujar(t e) throws PilaLlenaException{
        if((max-1)==tope){
            throw new PilaLlenaException("ERROR, Pila llena");
            
    }
        else{
            elementos[++tope]=e;
            
        }
    }
    public t sacar() throws PilaVaciaException {
        if (tope<0){
           throw new PilaVaciaException("Error, Pila vacia");
            //return null;
            
        }else{
            Object e=elementos[tope];
            elementos[tope--]=null;
            return (t)e;
        }
    }
    public boolean estaVacia(){
        return (tope<0);
    }
    public Pila(int max){
        this.max=max;
        elementos=(t[])new Object[max];
    }
    public void mostrar(){
        for(int i=tope; i>=0;i--){
            System.out.println(elementos[i]);
        }
    }
}