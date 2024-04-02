public class Main {
    public static void main(String[] args) {

        Baraja baraja = new Baraja();
        inOut io = new inOut(baraja);
        Dealer dealer = new Dealer(baraja);

        //dealer.shuffleBaraja();

        for (Carta carta : baraja.getCartas()) {
            System.out.println(carta);
        }

    }
}