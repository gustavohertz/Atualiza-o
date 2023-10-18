public class Batalha {
    private Random dadosRolar = new Random();
    private Boolean heroiVivo = true;
    private int rodada = 0;

    public void iniciarBatalha(Heroi heroi, Monstro monstro) {
        while (heroiVivo && monstro.getHitPoints() > 0) {
            rodada++;
            System.out.println("\nRodada #" + rodada + ":");

            int iniciativaHeroi = dadosRolar.nextInt(10) + heroi.getAgilidade();
            int iniciativaMonstro = dadosRolar.nextInt(10) + monstro.getAgilidade();

            System.out.println("Iniciativa do Herói: " + iniciativaHeroi);
            System.out.println("Iniciativa do Monstro: " + iniciativaMonstro);

            // Define o atacante e o defensor com base na iniciativa
            Personagem atacante = (iniciativaHeroi > iniciativaMonstro) ? heroi : monstro;
            Personagem defensor = (atacante == heroi) ? monstro : heroi;

            System.out.println(atacante.getNome() + " ataca primeiro!");

            int fatorAtaque = dadosRolar.nextInt(10) + atacante.getAgilidade() + atacante.getForca();
            int fatorDefesa = dadosRolar.nextInt(10) + defensor.getAgilidade() + defensor.getDefesa();

            if (fatorAtaque > fatorDefesa) {
                int dano = dadosRolar.nextInt(atacante.getFatorDano()) + atacante.getForca();
                defensor.setHitPoints(defensor.getHitPoints() - dano);
                System.out.println(atacante.getNome() + " causou " + dano + " pontos de dano ao " + defensor.getNome() + ".");
            } else {
                System.out.println(atacante.getNome() + " errou o ataque.");
            }

            if (defensor.getHitPoints() <= 0) {
                System.out.println(atacante.getNome() + " venceu a batalha!");
                heroiVivo = (atacante == heroi);
            }
        }

        if (!heroiVivo) {
            System.out.println("Herói foi derrotado!");
        } else {
            System.out.println("Herói venceu a batalha!");
        }
    }

    public boolean vitoria(Monstro monstroEnfrentado) {
        return false;
    }

    public int getRodadas() {
        return 0;
    }
}
