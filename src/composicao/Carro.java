package composicao;

/**
 *
 * @author Ezequiel Henrique Grützmann Tomazini
 */
public class Carro {
    private Motor motor;
    private Direcao direcao;
    
    public void showCar(){
        System.out.println("----------Carro----------");
        System.out.println("Potência: "+motor.getPotencia());
        System.out.println("Cor: "+direcao.getCor());
    }
    
    public void lPPV(){
        motor = new Motor();
        direcao = new Direcao();
    }
    
    public void lPPV(int potencia, String cor){
        motor = new Motor(potencia);
        direcao = new Direcao(cor);
    }
    
    public Carro(){
        motor = new Motor();
        direcao = new Direcao();
    }
    
    public Carro(int potencia, String cor){
        motor = new Motor(potencia);
        direcao = new Direcao(cor);
    }
    
}
