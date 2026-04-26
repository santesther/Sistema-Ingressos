import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("==========CINEMA==========");
            System.out.println("Qual tipo de ingresso você quer comprar?");
            System.out.println("1 - Meia entrada");
            System.out.println("2 - Ingresso família");
            System.out.println("3 - Sair do programa");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Você escolheu o ingresso tipo meia entrada");
                    System.out.println();
                    System.out.print("Qual o nome do filme?");
                    String nome = scanner.next();
                    System.out.println();
                    System.out.print("Filme Dublado ou Legendado?");
                    Linguagem linguagem = Linguagem.valueOf(scanner.next().toUpperCase());
                    System.out.println();
                    System.out.print("Quantas pessoas vão assistir o filme?");
                    int quantidade = scanner.nextInt();
                    System.out.println();
                    float valor = 30.00F;
                    Ingresso ingresso = new MeiaEntrada(valor, nome, linguagem, quantidade);

                    System.out.println("Informações da sua compra: ");
                    System.out.println("Valor: " + ingresso.valorIngresso(valor, quantidade));
                    System.out.println("Nome do filme " + ingresso.getNomeDoFilme());
                    System.out.println("Linguagem: " + ingresso.getLinguagem());
                    System.out.println("Quantidade: " + ingresso.getQuantidade());
                    break;
                case 2:
                    System.out.println("Você escolheu o ingresso tipo família");
                    System.out.println();
                    System.out.print("Qual o nome do filme?");
                    String nomeDoFilme = scanner.next();
                    System.out.println();
                    System.out.print("Filme Dublado ou Legendado?");
                    Linguagem linguagem2 = Linguagem.valueOf(scanner.next().toUpperCase());
                    System.out.println();
                    System.out.print("Quantas pessoas vão assistir o filme?");
                    int quantidadePessoas = scanner.nextInt();
                    System.out.println();
                    float valor2 = 40.00F;
                    Ingresso ingressoFamilia = new Familia(valor2, nomeDoFilme, linguagem2, quantidadePessoas);

                    System.out.println("Informações da sua compra: ");
                    System.out.println("Valor: " + ingressoFamilia.valorIngresso(valor2, quantidadePessoas));
                    System.out.println("Nome do filme " + ingressoFamilia.getNomeDoFilme());
                    System.out.println("Linguagem: " + ingressoFamilia.getLinguagem());
                    System.out.println("Quantidade: " + ingressoFamilia.getQuantidade());
                    break;
                case 3:
                    System.out.println("Saindo do programa");
            }
        } while (opcao != 3);
    }
}