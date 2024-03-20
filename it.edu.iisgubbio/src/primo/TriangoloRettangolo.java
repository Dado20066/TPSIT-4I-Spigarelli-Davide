package primo;

public class TriangoloRettangolo {
    double base;
    double altezza;

    TriangoloRettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    double calcolaArea() {
        return (base * altezza / 2);
    }

    double calcolaIpotenusa() {
        return Math.sqrt(base * base + altezza * altezza);
    }

    double calcolaPerimetro() {
        return base + altezza + this.calcolaIpotenusa();
    }
}
