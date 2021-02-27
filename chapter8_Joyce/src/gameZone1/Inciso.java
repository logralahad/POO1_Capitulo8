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
public class Inciso {
    
    private String texto;
    private Boolean correcto;

    public Inciso(String respuesta, Boolean correcto) {
        this.texto = respuesta;
        this.correcto = correcto;
    }
    
    public Boolean getCorrecto() {
        return correcto;
    } 

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
}
