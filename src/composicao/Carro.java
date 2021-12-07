package composicao;

/**
 *
 * @author Ezequiel Henrique Grützmann Tomazini
 */
public class Carro {
    private Motor motor;
    private Direcao direcao;
    
    public void lPPV(){
        motor = new Motor();
    }
    
    public void lPPV(int potencia){
        motor = new Motor(potencia);
    }
    
    public Carro(){
        motor = new Motor();
    }
    
    public Carro(int potencia){
        motor = new Motor(potencia);
    }
}
