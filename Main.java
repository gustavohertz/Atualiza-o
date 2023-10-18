import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual é o seu nickname? ");
        String nickname = scanner.next();

        NickName nickName = new NickName();
        String classeEscolhida = nickName.escolherNomeEClasse();

        Heroi heroi;
        switch (classeEscolhida) {
            case "Guerreiro":
                heroi = new Heroi("Guerreiro", 12, 4, 3, 3, 2);
                break;
            case "Bárbaro":
                heroi = new Heroi("Bárbaro", 13, 6, 1, 3, 2);
                break;
            case "Paladino":
                heroi = new Heroi("Paladino", 15, 2, 5, 1, 2);
                break;
            default:
                System.out.println("Classe inválida. Saindo do programa.");
                return;
        }
        int monstroIndex = new Random().nextInt(3) + 1;
        Monstro monstroEnfrentado = new Monstro(monstroIndex);

        nickName.getNick();

        Batalha batalha = new Batalha();
        batalha.iniciarBatalha(heroi, monstroEnfrentado);

        BatalhaRegistro logBatalha = new BatalhaRegistro(new Date(), heroi, batalha.vitoria(monstroEnfrentado) ? "GANHOU" : "PERDEU", monstroEnfrentado, batalha.getRodadas());

        System.out.println("Registro da Batalha:");
        System.out.println(logBatalha.toCSV());
    }
}
