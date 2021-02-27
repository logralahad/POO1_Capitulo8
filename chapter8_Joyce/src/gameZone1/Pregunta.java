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
public class Pregunta {

    private String pregunta;
    private Inciso[] incisos;
    private Integer indice;

    public Pregunta(String pregunta) {
        this.pregunta = pregunta;
        this.incisos = new Inciso[3];
        this.indice = 0;
    }

    public void setInciso(Inciso inciso) {
        if (this.indice < 3) {
            this.incisos[indice] = inciso;
        }
        indice++;
    }
    
    public Boolean getCorrecto(Integer inciso){
        return incisos[inciso].getCorrecto();
    }
    
    public String getRespuesta(){
        String texto_correcto = "";
        for (int i = 0; i < 3; i++) {
            if(this.incisos[i].getCorrecto()){
                texto_correcto = this.incisos[i].getTexto();
            }
        }
        return texto_correcto;
    }
    
    @Override
    public String toString(){
        return String.format("%s\n(A)%s\n(B)%s\n(C)%s\n", this.pregunta, incisos[0].getTexto(),
                incisos[1].getTexto(),incisos[2].getTexto()); 
    }
}
