import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Baraja baraja = new Baraja();
        Dealer dealer = new Dealer(baraja);
        inOut io = new inOut(baraja);
        Mano mano = new Mano(null, null);

        dealer.shuffleBaraja();

        Alae alae = new Alae(1000);

        alae.recibirMano(dealer.repartirMano());

        System.out.println("Mano jugador 2 " + alae.getMano());
        
        System.out.println(alae.primeraCarta());
        System.out.println(alae.segundaCarta());

        System.out.println("-------------------------------------------------------------------------------");
        
        if (alae.primeraCarta().getPalos().equals(Palo.PICAS)) {
            System.out.println("Funciono :0 increiblemente");
        }

    }
}