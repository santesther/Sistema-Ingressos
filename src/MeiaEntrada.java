public class MeiaEntrada extends Ingresso{

    public MeiaEntrada(float valor, String nomeDoFilme, Enum linguagem, int quantidade) {
        super(valor, nomeDoFilme, linguagem, quantidade);
    }

    @Override
    public float valorIngresso(float valor, int quantidade) {
        return (valor * quantidade) / 2;
    }
}
