public class Main {
    public static void main(String[] args) {

        Baraja baraja = new Baraja();
        inOut io = new inOut(baraja);

        baraja.shuffle();

        io.name();

        Carta carta1 = baraja.quitarUno();
        Carta carta2 = baraja.quitarUno();

        Mano maJ1 = new Mano(carta1, carta2);

        System.out.println(maJ1);
        System.out.println(baraja.getSize());

    }
}