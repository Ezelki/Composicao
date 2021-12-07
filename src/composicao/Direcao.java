package composicao;

/**
 *
 * @author Ezequiel Henrique Grützmann Tomazini
 */
public class Direcao {

    private String cor;

    public Direcao() {
        cor = "Branco"; //padrão
    }

    public Direcao(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
