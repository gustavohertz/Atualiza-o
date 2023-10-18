import java.util.Random;

public class Heroi implements Personagem {
    private String nome;
    private int hitPoints;
    private int forca;
    private int defesa;
    private int agilidade;
    private int fatorDano;
    private Random dadosRolar = new Random();

    public Heroi(String nome, int hitPoints, int forca, int defesa, int agilidade, int fatorDano) {
        this.nome = nome;
        this.hitPoints = hitPoints;
        this.forca = forca;
        this.defesa = defesa;
        this.agilidade = agilidade;
        this.fatorDano = fatorDano;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }
    @Override
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
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

    public String getNome() {
        return nome;
    }
}
