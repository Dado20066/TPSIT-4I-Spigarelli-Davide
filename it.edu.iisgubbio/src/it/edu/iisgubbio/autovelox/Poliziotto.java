package autovelox;

public class Poliziotto {
    private int limiteVelocita;
    private double tariffa;

    public Poliziotto(int limiteVelocita, double tariffa) {
        this.limiteVelocita = limiteVelocita;
        this.tariffa = tariffa;
    }

    public void impostaLimiteVelocita(int limiteVelocita) {
        this.limiteVelocita = limiteVelocita;
    }

    public void impostaTariffa(double tariffa) {
        this.tariffa = tariffa;
    }

    public int ottieniLimiteVelocita() {
        return limiteVelocita;
    }

    public double ottieniTariffa() {
        return tariffa;
    }

    public static void main(String[] args) {
        Poliziotto poliziotto = new Poliziotto(100, 5);

        System.out.println("Limite di velocità impostato dal poliziotto: " + poliziotto.ottieniLimiteVelocita() + " km/h");
        System.out.println("Tariffa della multa impostata dal poliziotto: " + poliziotto.ottieniTariffa());

        poliziotto.impostaLimiteVelocita(80);
        poliziotto.impostaTariffa(10);

        System.out.println("Nuovo limite di velocità impostato dal poliziotto: " + poliziotto.ottieniLimiteVelocita() + " km/h");
        System.out.println("Nuova tariffa della multa impostata dal poliziotto: " + poliziotto.ottieniTariffa());
    }
}
