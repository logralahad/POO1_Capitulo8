/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone2;

/**
 *
 * @author logra
 */
public class FiveDice3 {
    
    private Die[] dados;
    private Integer mayor_valor;
    private Integer repetidos;

    public FiveDice3() {
        this.dados = new Die[5];
        for (int i = 0; i < 5; i++) {
            this.dados[i] = new Die();
        }
        setRepetidos();
        setMayorValor();
    }
    
    public void lanzar(){
        for (int i = 0; i < 5; i++) {
            this.dados[i] = new Die();
        }
        setRepetidos();
        setMayorValor();
    }
    
    private void setRepetidos(){
        Integer contador = 0, maximo = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < 5; j++) {
                if(this.dados[j].getValor() == i){
                    contador++;
                }
            }
            if(contador > maximo){
                maximo = contador;
            }
            contador = 0;
        }
        this.repetidos = maximo;
    }
    
    private void setMayorValor(){
        Integer contador = 0, maximo = 0, valor = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < 5; j++) {
                if(this.dados[j].getValor() == i){
                    contador++;
                }
            }
            if(contador > maximo){
                maximo = contador;
                valor = i;
            }
            contador = 0;
        }
        this.mayor_valor = valor;
    }

    public Integer getMayorValor(){
        return this.mayor_valor;
    }
    
    public Integer getRepetidos(){
        return this.repetidos;
    }
    
    public void valores(){
        for (int i = 0; i < this.dados.length; i++) {
            System.out.print(this.dados[i].getValor() + " ");
        }
        System.out.print("\n");
        System.out.print(String.format("Saco %d de %d\n\n", this.repetidos, this.mayor_valor));
    }
    
    public static void compararDecks(FiveDice3 jugador, FiveDice3 computadora){
        if(jugador.getRepetidos() > computadora.getRepetidos()){
            System.out.println("Gano el jugador.");
        }
        else if(jugador.getRepetidos() < computadora.getRepetidos()){
            System.out.println("Gano la computadora.");
        }
        else{
            if(jugador.getMayorValor() > computadora.getMayorValor()){
                System.out.println("Gano el jugador.");
            }
            else if(jugador.getMayorValor() < computadora.getMayorValor()){
                System.out.println("Gano la computadora.");
            }
            else{
                System.out.println("Empate.");
            }
        }
    }
    
}
