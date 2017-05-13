/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author educacionit
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Pila<String> p = new Pila<>(5);

            p.empujar("A");
            p.empujar("B");
            p.empujar("C");
            System.out.println(p.sacar());

            p.mostrar();
            String e = p.sacar();

            Pila<Integer> pi = new Pila<>(30);
            pi.empujar(30);
        } catch (PilaLlenaException ex) {
            Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PilaVaciaException ex) {
            Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
