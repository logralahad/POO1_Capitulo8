/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone1;

/**
 *
 * @author logra
 */
public class Test {
    public static void main(String[] args) {
        Quiz cuestionario = new Quiz();

        cuestionario.rellenarQuiz();
        cuestionario.responder();
        System.out.println(cuestionario.resultados());
    }
}
