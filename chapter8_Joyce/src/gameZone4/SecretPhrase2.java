/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author logra
 */
public class SecretPhrase2 {
    
    private String frase;
    private StringBuilder cifrado;
    private Boolean descifrado;
    
    public SecretPhrase2(){
        ArrayList<String> frases = new ArrayList(Arrays.asList("Siganme los buenos", "Eso es de gangsters", 
                    "Huevos con jamon", "Quiero una pizza", "Subir hacia arriba", "Bajar hacia abajo"));
        Random rd = new Random();
        
        this.frase = frases.get(rd.nextInt(frases.size()));
        setCifrado();
        this.descifrado = false;
        
    }
    
    public String getCifrado(){
        return this.cifrado.toString();
    }
    
    public Boolean isDescifrado(){
        return this.descifrado;
    }
    
    private void setDescifrado(){
        if(this.frase.equals(this.cifrado.toString()) == true){
            this.descifrado = true;
        }else{
            this.descifrado = false;
        }
    }
    
    private void setCifrado(){
        this.cifrado = new StringBuilder();
        for (int i = 0; i < this.frase.length(); i++) {
            if(this.frase.charAt(i) == ' '){
                this.cifrado.append(this.frase.charAt(i));
            }
            else{
                this.cifrado.append('*');
            }
        }
    }
    
    public void descifrar(Character guess){
        int pos = this.frase.indexOf(guess);
        if(pos != -1){
            for (int i = 0; i < this.frase.length(); i++) {
             if(this.frase.charAt(i) == guess){
                 this.cifrado.setCharAt(i, guess);
             }
         }
        }
        else{
            System.out.println("No esta la letra");
        }
        setDescifrado();
    }
    
    public void victoria(){
        System.out.println(String.format("\nGanaste, la frase era: %s", this.frase));
    }
    
}
