import java.text.SimpleDateFormat;
import java.util.Date;

public class BatalhaRegistro {
    private Date dataPartida;
    private Personagem heroiEscolhido;
    private String resultado;
    private Personagem monstroEnfrentado;
    private int quantidadeDeRodadas;

    public BatalhaRegistro(Date dataPartida, Personagem heroiEscolhido, String resultado, Personagem monstroEnfrentado, int quantidadeDeRodadas) {
        this.dataPartida = dataPartida;
        this.heroiEscolhido = heroiEscolhido;
        this.resultado = resultado;
        this.monstroEnfrentado = monstroEnfrentado;
        this.quantidadeDeRodadas = quantidadeDeRodadas;
    }

    public Date getDataPartida() {
        return dataPartida;
    }

    public String getHeroiEscolhido() {
        return heroiEscolhido.getNome();
    }

    public String getResultado() {
        return resultado;
    }

    public String getMonstroEnfrentado() {
        return monstroEnfrentado.getNome();
    }

    public int getQuantidadeDeRodadas() {
        return quantidadeDeRodadas;
    }

    public String toCSV() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(dataPartida) + ";" + heroiEscolhido.getNome() + ";" + resultado + ";" + monstroEnfrentado.getNome() + ";" + quantidadeDeRodadas;
    }
}
