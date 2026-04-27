public class Familia extends Ingresso {

    public Familia(float valor, String nomeDoFilme, Enum linguagem, int quantidade) {
        super(valor, nomeDoFilme, linguagem, quantidade);
    }

    @Override
    public float valorIngresso(float valor, int quantidade) {
        if (quantidade > 3){
            return valor * quantidade - (0.05F * valor);
        }
        return valor * quantidade;
    }
}
