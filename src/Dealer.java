public class Dealer {
    private Baraja baraja;

    public Dealer(Baraja baraja) {
        this.baraja = baraja;
    }

    public Mano repartirMano() {
        Carta carta1 = baraja.quitarUnaCarta();
        Carta carta2 = baraja.quitarUnaCarta();
        return new Mano(carta1, carta2);
    }

    public void shuffleBaraja() {
        baraja.shuffle();
    }
}
