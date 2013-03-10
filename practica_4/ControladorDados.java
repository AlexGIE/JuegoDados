/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_4;

/**
 *
 * @author Alex
 */
public class ControladorDados {

    ModeloDados modelo;
	//añado comentario de prueba

    ControladorDados(ModeloDados modelo) {
        this.modelo = modelo;
    }

    void jugar() {
        modelo.jugar(); //inicializa dado1 y dado2

    }

    int mostrarDado1() {
        return modelo.getDado1();
    }

    int mostrarDado2() {
        return modelo.getDado2();
    }
    //este metodo devuelve 1 si gana el dado 1 y 0 si gana el dado 2
    //la vista segun lo que reciba lanzara un aviso u otro de perder o ganar
    int mostrarSumaDados() {
        
        return modelo.sumaDados();
    }
    
    
    int compruebaResultado(int numeroApostado) {

        //Pasarlo a inst y darselo al modelo para sumar
        int aux;

        aux = modelo.compruebaDados(numeroApostado);
        return aux;//devuelve 1 si gana y 0 si pierde



    }
}
