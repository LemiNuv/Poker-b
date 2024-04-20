import java.util.Collections;
import java.util.Scanner;
import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
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

            Alae alae = new Alae(1000);
            Jugador jugador = new Jugador(1000);
            
            System.out.println("PreFlop");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("...");
            }

            System.out.println("Inicia la ronda de apuestas.");
            if (dealer.turnoCiega() == 0) { //0 Será el jugador
                System.out.println("Alae apuesta: ");
            } else { //1 Será Alae
                System.out.println("Jugador apuesta: ");
            }

        }

    }
}