import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Baraja baraja = new Baraja();
        Dealer dealer = new Dealer(baraja);
        inOut io = new inOut(baraja);

        dealer.shuffleBaraja();

        /*System.out.println("");
        System.out.println("Leo " + leo.getMano());

        System.out.println("Alae " + alae.getMano());
        System.out.println("");

        System.out.println("Leo");
        System.out.println(leo.primeraCarta());
        System.out.println(leo.segundaCarta());
        System.out.println("");
        System.out.println("Alae");
        System.out.println(alae.primeraCarta());
        System.out.println(alae.segundaCarta());

        //Compare TO --> int resultado = leo.primeraCarta().getValor().compareTo(alae.primeraCarta().getValor());

        /*if (resultado < 0) {
            System.out.println("Leo tiene una carta menor --> " + leo.primeraCarta());
            System.out.println("Alae tiene una carta más alta -->  " + alae.primeraCarta());

        } else if (resultado > 0) {
            System.out.println("Alae tiene una carta menor --> " + alae.primeraCarta());
            System.out.println("Leo tiene una carta más alta --> " + leo.primeraCarta());

        } else {
            System.out.println("Mismo valor.");
            System.out.println(leo.primeraCarta());
            System.out.println(alae.primeraCarta());

        }
------
        /*if (alae.primeraCarta().getPalo().equals(Palo.PICAS)) {
            System.out.println("Funciono :0 increiblemente");
        }*/

        while (true) {   
            Scanner in = new Scanner(System.in);
            Alae alae = new Alae(1000);
            Jugador jugador = new Jugador(1000);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("...");
            }

            System.out.println("Comienza el Preflop...");
            System.out.println(" - Como solo jugarás contra Alae, el bote tendrá dinero por parte del Dealer.");
            System.out.println(" - Será un pequeña variante del Poker Texas Hold'em");
            System.out.println(" > ¡El bote tiene 350 fichas! < ");
            alae.recibirMano(dealer.repartirMano()); //Mano Alae
            jugador.recibirMano(dealer.repartirMano()); //Mano jugador
            System.out.println("Recibes dos cartas: ");
            System.out.println(jugador.getMano());

            if (dealer.turnoCiega() == 1) {
                //JUGADOR
                System.out.println("Apuestas primero.");
                int apuestaJugador = jugador.apuesta();
                alae.desicion(apuestaJugador);
                
                int apuestaAlae = alae.getFichasApostadas();
                System.out.println("Apuestas hechas, todas se van al bote.");
                dealer.setBote(dealer.getBote() + apuestaJugador + apuestaAlae);
                System.out.println(" > ¡El bote tiene " + dealer.getBote() + " fichas! < ");

                System.out.println("Se reparte el Flop...");
                dealer.recibirMano(dealer.manoDealer());
                System.out.println(" • " + dealer.primeraCarta());
                System.out.println(" • " + dealer.segundaCarta());
                System.out.println(" • " + dealer.terceraCarta());
                
                System.out.println("");

            } else {
                //ALAE
            }

            break;
        }

    }
}