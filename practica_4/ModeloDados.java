/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_4;

import java.util.Random;

/**
 *
 * @author Alex
 */
public class ModeloDados {

    int limiteInferiorDados = 1;
    int limiteSuperiorDados = 6;
    int dado1, dado2 = 0;
    int sumaDados = 0;
    //int dado2;
//otra prueba

    public int getSumaDados() {
        return sumaDados;
    }

    public void setSumaDados(int sumaDados) {
        this.sumaDados = sumaDados;
    }
    
    public void jugar(){
        dado1 = generaUnDado();
        dado2 = generaUnDado();
    }

    public int getDado1() {
        return dado1;
    }

    public void setDado1(int dado1) {
        this.dado1 = dado1;
    }

    public int getDado2() {
        return dado2;
    }

    public void setDado2(int dado2) {
        this.dado2 = dado2;
    }

    public int getLimiteInferiorDados() {
        return limiteInferiorDados;
    }

    public void setLimiteInferiorDados(int limiteInferiorDados) {
        this.limiteInferiorDados = limiteInferiorDados;
    }

    public int getLimiteSuperiorDados() {
        return limiteSuperiorDados;
    }

    public void setLimiteSuperiorDados(int limiteSuperiorDados) {
        this.limiteSuperiorDados = limiteSuperiorDados;
    }

    public int generaUnDado() {
        Random rnd = new Random();
        int dado;
        dado = (int) (rnd.nextDouble() * limiteSuperiorDados 
                + limiteInferiorDados);
        return dado;
    }
    public int sumaDados(){
        sumaDados = dado1+ dado2;
        return sumaDados;
    }

    public int compruebaDados(int numeroApostado) {
        if (sumaDados == numeroApostado) {
            return 1;
        } else {
            return 0;
        }
    }
}
