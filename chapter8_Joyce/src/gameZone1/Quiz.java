/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author logra
 */
public class Quiz {

    private ArrayList<Pregunta> quiz;
    private Integer aciertos;
    private Integer errores;
    private Double score;

    public Quiz() {
        this.quiz = new ArrayList<>();
        this.aciertos = 0;
        this.errores = 0;
        this.score = 0.0;
    }
    
    public Double getScore(){
        return this.score;
    }
    
    public Integer getAciertos(){
        return this.aciertos;
    }
    
    public Integer getErrores(){
        return this.errores;
    }

    public void addPregunta(Pregunta pregunta) {
        quiz.add(pregunta);
    }

    public void addInciso(Integer num_pregunta, Inciso inciso) {
        Pregunta pregunta = quiz.get(num_pregunta - 1);
        pregunta.setInciso(inciso);
        quiz.set(num_pregunta - 1, pregunta);

    }

    public void responder() {
        Scanner sc = new Scanner(System.in);
        
        for (int j = 0; j < this.quiz.size(); j++) {
            Pregunta pr = quiz.get(j);
            char opc;
            System.out.print(String.format("%s", pr.toString()));
            do {
                System.out.print("Respuesta: ");
                opc = sc.nextLine().charAt(0);
            } while (!pedirRespuesta(opc));
            
            if(pr.getCorrecto(convertirOpcion(opc) - 1)){
                System.out.println("Correcto.\n");
                this.aciertos++;
            }
            else{
                System.out.println("Incorrecto. La respuesta es " + pr.getRespuesta() + "\n");
            }
            quiz.set(j, pr);
        }
        
        this.errores = quiz.size() - this.aciertos;
        this.score = ((double)this.aciertos / quiz.size()) * 100;
    }
    
    public String resultados(){
        return String.format("Calificacion: %.2f\nAciertos: %d\nErrores: %d", this.score, this.aciertos, this.errores);
    }
    
    private Boolean pedirRespuesta(char opc){
        if(opc == 'A' || opc == 'B' || opc == 'C'){
            return true;
        }else{
            return false;
        }
    }
    
    private Integer convertirOpcion(char opc){
        switch (opc) {
            case 'A':
                return 1;
                
            case 'B':
                return 2;
                
            case 'C':
                return 3;
                
            default:
                return 0;
        }
    }
    
    public void rellenarQuiz(){
        this.addPregunta(new Pregunta("Cuantos capitulos de Flash hay"));
        this.addInciso(1, new Inciso("500", true));
        this.addInciso(1, new Inciso("1500", false));
        this.addInciso(1, new Inciso("100", false));
        
        this.addPregunta(new Pregunta("Si le sabe o no?"));
        this.addInciso(2, new Inciso("si", false));
        this.addInciso(2, new Inciso("no", false));
        this.addInciso(2, new Inciso("tal vez", true));
        
        this.addPregunta(new Pregunta("Mejor jugador"));
        this.addInciso(3, new Inciso("Messi", false));
        this.addInciso(3, new Inciso("Maradona", true));
        this.addInciso(3, new Inciso("CR7", false));
        
        this.addPregunta(new Pregunta("Quieres mimir?"));
        this.addInciso(4, new Inciso("no", false));
        this.addInciso(4, new Inciso("si", true));
        this.addInciso(4, new Inciso("quiero morir", false));
        
        this.addPregunta(new Pregunta("Tengo hambre, que comemos?"));
        this.addInciso(5, new Inciso("helado", false));
        this.addInciso(5, new Inciso("pizza", true));
        this.addInciso(5, new Inciso("10 ordenes de tacos", false));
    }

}
