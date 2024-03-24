public class Dealer {
    private Baraja baraja;

    public Dealer() {
        baraja = new Baraja();
    }

    public void shuffleBaraja() {
        baraja.shuffle();
    }
}
