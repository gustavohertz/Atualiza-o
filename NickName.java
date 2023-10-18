import java.util.Scanner;

public class NickName {
    Scanner resposta = new Scanner(System.in);
    private String nick;
    private String classeEscolhida;

    public String escolherNomeEClasse() {
        System.out.println("Qual é o seu nome?");
        nick = resposta.next();
        System.out.println("Bem-vindo " + nick);

        System.out.println("Escolha uma classe:");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Bárbaro");
        System.out.println("3 - Paladino");

        int escolha = resposta.nextInt();
        switch (escolha) {
            case 1:
                classeEscolhida = "Guerreiro";
                break;
            case 2:
                classeEscolhida = "Bárbaro";
                break;
            case 3:
                classeEscolhida = "Paladino";
                break;
            default:
                classeEscolhida = "Classe Inválida";
                break;
        }
        return classeEscolhida;
    }
