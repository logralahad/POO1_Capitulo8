/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone3;

import java.util.Random;

/**
 *
 * @author logra
 */
public class War3 {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        // TODO code application logic here
        FullDeck mazo = new FullDeck();
        
        while(mazo.getTam() > 0){
            Card jugador = mazo.pickRandomCart();
            Card pc = mazo.pickRandomCart();
            
            jugador.showCard();
            pc.showCard();
            mazo.winWar(jugador, pc);
        }
        
        System.out.println(mazo.resultados());
    }
    
}
