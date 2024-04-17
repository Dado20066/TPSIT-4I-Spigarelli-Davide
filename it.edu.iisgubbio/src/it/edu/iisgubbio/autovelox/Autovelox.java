package autovelox;

public class Autovelox {
    private Poliziotto poliziotto;

    public Autovelox(Poliziotto poliziotto) {
        this.poliziotto = poliziotto;
    }

    public double calcolaMulta(int velocitaRegistrata) {
        int limiteVelocita = poliziotto.ottieniLimiteVelocita();
        double tariffa = poliziotto.ottieniTariffa();

        if (velocitaRegistrata <= limiteVelocita) {
            return 0.0;
        } else {
            int eccessoVelocita = velocitaRegistrata - limiteVelocita;
            double importoMulta = eccessoVelocita * (tariffa);
            return importoMulta;
        }
    }

    public static void main(String[] args) {
        Poliziotto poliziotto = new Poliziotto(100, 5);
        Autovelox autovelox = new Autovelox(poliziotto);

        int velocitaRegistrata = 120;
        double multa = autovelox.calcolaMulta(velocitaRegistrata);
        System.out.println("Multa dovuta: " + multa + " euro");
    }
}
