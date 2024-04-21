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
            
            System.out.println("PreFlop");

            /*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("...");
            }*/

            System.out.println("Inicia la ronda de apuestas.");
            //ALAE
            if (dealer.turnoCiega() == 0) { //0 Será el jugador
                System.out.println("Alae ha apostado: ");
                alae.setCiega(true);
                int apuestaAlae = alae.apuestaInicial();
                System.out.println(apuestaAlae);
                break;
            //JUGADOR    
            } else { //1 Será Alae
                //Preplof
                System.out.println("Pon tu apuesta: ");
                int apuestaJug = in.nextInt();
                jugador.apuesta(apuestaJug);
                int apuestaAlae = alae.redoblarCiega(apuestaJug);
                System.out.println("Alae redobla la ciega pequeña:\n" + apuestaAlae);
                //Repartir Mano
                System.out.println("Se te entregan dos cartas:");
                jugador.recibirMano(dealer.repartirMano());
                System.out.println(jugador.getMano());
                alae.recibirMano(dealer.repartirMano());
                //Igualar o Subir cartas
                System.out.println("Tu turno, ¿que quieres hacer? (Tienes que igualar la apuesta o no podrás ver el bote)");
                System.out.println(jugador.getMano());
                System.out.println("- Apuesta de Alae --> " + apuestaAlae);
                System.out.println("- Tus fichas --> " + jugador.getFichas());
                System.out.println("- Tus Apuesta anterior --> " + apuestaJug);
                io.opciones();
                int opcionJug = in.nextInt();
                apuestaJug = jugador.opciones(opcionJug, apuestaAlae, apuestaJug);
                if (apuestaJug >= apuestaAlae) {
                    System.out.println("Verás el bote.");
                    System.out.println("Comienza el Flop...");
                    dealer.setBote(apuestaJug + apuestaAlae);
                } else {
                    System.out.println("No has igualado o subido tu apuesta. No podrás ver el bote.");
                }
                //Flop
                System.out.println("Se reparten la cartas comunitarias");
                dealer.recibirMano(dealer.manoDealer());
                System.out.println(" - " + dealer.primeraCarta() + " - ");
                System.out.println(" - " + dealer.segundaCarta() + " - ");
                System.out.println(" - " + dealer.terceraCarta() + " - ");
                System.out.println("Comienza una nueva ronda de apuestas");                
                break;
            }
        }

    }
}