public class Main {
    public static void main(String[] args) {

        Baraja baraja = new Baraja();
        Dealer dealer = new Dealer(baraja);
        inOut io = new inOut(baraja);
        

        dealer.shuffleBaraja();

        Jugador jugador1 = new Jugador(1000);
        Alae alae = new Alae(1000);

        jugador1.recibirMano(dealer.repartirMano());
        alae.recibirMano(dealer.repartirMano());

        System.out.println("Mano jugador 1" + jugador1.getMano());
        System.out.println("Mano jugador 2" + alae.getMano());

        /*for (Carta carta : baraja.getCartas()) {
            System.out.println(carta);
        }*/
        
        

    }
}