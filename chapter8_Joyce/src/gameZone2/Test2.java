/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone2;

import java.util.Scanner;

/**
 *
 * @author logra
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FiveDice3 jugador = new FiveDice3();
        FiveDice3 computadora = new FiveDice3();
        
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        
        do {
            System.out.print("Jugador: ");
            jugador.valores();
            
            System.out.print("Computadora: ");
            computadora.valores();
            
            FiveDice3.compararDecks(jugador, computadora);
            jugador.lanzar();
            computadora.lanzar();
            
            System.out.print("Seguir jugando? [0]No [1]Si: ");
            opc = sc.nextInt();
            System.out.println("");
            
        } while (opc == 1);
        
    }
    
}
