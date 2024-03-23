public class Main {
    public static void main(String[] args) {

        Baraja baraja = new Baraja();

        baraja.shuffle();

/*        for (Carta carta : baraja.getCartas()) {
            System.out.println(carta);
        }
*/
        System.out.println(baraja.getSize());
    }
}