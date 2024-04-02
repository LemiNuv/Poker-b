public class Dealer {
    private Baraja baraja;

    public Dealer(Baraja baraja) {
        this.baraja = baraja;
    }

    public void shuffleBaraja() {
        baraja.shuffle();
    }
}
