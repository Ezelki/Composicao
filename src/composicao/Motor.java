package composicao;

/**
 *
 * @author Ezequiel Henrique Grützmann Tomazini
 */
public class Motor {
    int potencia;
    
    public Motor(){
        potencia=1000; //valor padrão
    }
    
    public Motor(int potencia){
        this.potencia=potencia; //valor a ser definido
    }
    
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    
}
