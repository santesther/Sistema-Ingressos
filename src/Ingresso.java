public abstract class Ingresso {

    private float valor;
    private String nomeDoFilme;
    private Enum linguagem;
    int quantidade;

    public Ingresso(float valor, String nomeDoFilme, Enum linguagem, int quantidade) {
        this.valor = valor;
        this.nomeDoFilme = nomeDoFilme;
        this.linguagem = linguagem;
        this.quantidade = quantidade;
    }

    public Ingresso(){
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public Enum getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(Enum linguagem) {
        this.linguagem = linguagem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public abstract float valorIngresso(float valor, int quantidade);
}
