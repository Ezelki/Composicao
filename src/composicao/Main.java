/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

/**
 *
 * @author IFSC
 */
public class Main {
    public static void main(String[] args) {
        //primeira forma do chastiefol
        Carro kadett = new Carro();
        Carro palio = new Carro(5000, "Azul");
        
        //segunda forma do chastiefol
        Carro fusca = new Carro();
        
        fusca.lPPV();
        fusca.lPPV(1049, "Branco");
        
        kadett.showCar();
        palio.showCar();
        fusca.showCar();
    }
}
