import java.util.Random;

public class Monstro implements Personagem {
    private String nomeMonstro;
    private int hitPoints;
    private int forca;
    private int defesa;
    private int agilidade;
    private int fatorDano;

    public Monstro(int monstroIndex) {
        Random random = new Random();
        switch (monstroIndex) {
            case 1:
                nomeMonstro = "Morto-vivo";
                hitPoints = 25;
                forca = 4;
                defesa = 0;
                agilidade = 1;
                fatorDano = random.nextInt(4) + random.nextInt(4) + 2;
                break;
            case 2:
                nomeMonstro = "Ork";
                hitPoints = 20;
                forca = 6;
                defesa = 2;
                agilidade = 2;
                fatorDano = random.nextInt(8) + 2;
                break;
            case 3:
                nomeMonstro = "Kobold";
                hitPoints = 20;
                forca = 4;
                defesa = 2;
                agilidade = 4;
                fatorDano = random.nextInt(6) + 2;
                break;
            default:
                // Caso inválido
                break;
        }
    }

    public String getNome() {
        return nomeMonstro;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    @Override
    public void setHitPoints(int hitPoints) {

    }

    public int getForca() {
        return forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public int getFatorDano() {
        return fatorDano;
    }
}
