package it.edu.iisgubbio.macchinetta;

public class Macchinetta {
    private double creditoRimanente;
    private double resto;
    private double costi;
    private int rifornimentoProdotti;
    private double costiGiornalieri;
    private double profittoMensile;

    public Macchinetta() {
        this.creditoRimanente = 0.0;
        this.resto = 0.0;
        this.costi = 0.0;
        this.rifornimentoProdotti = 0;
        this.costiGiornalieri = 0.0;
        this.profittoMensile = 0.0;
    }

    public double calcolaCreditoRimanente() {
        return creditoRimanente;
    }

    public double calcolaResto() {
        return resto;
    }

    public double calcolaCosti() {
        return costi;
    }

    public double calcoloCostiGiornalieri() {
        return costiGiornalieri;
    }

    public double calcoloProfittoMensile() {
        return profittoMensile;
    }

    public void setRifornimentoProdotti(int rifornimentoProdotti) {
        this.rifornimentoProdotti = rifornimentoProdotti;
    }

    public void setCostiGiornalieri(double costiGiornalieri) {
        this.costiGiornalieri = costiGiornalieri;
    }

    public void setProfittoMensile(double profittoMensile) {
        this.profittoMensile = profittoMensile;
    }
}
