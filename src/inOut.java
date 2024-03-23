import java.util.Scanner;
public class inOut {

    Scanner in;
    Baraja baraja;

    public inOut(Baraja baraja) {
        this.baraja = baraja;
        in = new Scanner(System.in);
    }

    public void ejecutar() {
        while (true) {
            System.out.println("1. mostrar baraja");
            System.out.println("2. ver cantidad de cartas");
            System.out.println("3. quitar un carta");
            System.out.println("4. mezclar baraja");
            System.out.println("5. salir");

            int opcion = in.nextInt();
            opCase(opcion);

            if (opcion == 5) {
                System.out.println("Perate ya me voy...");
                break;
            }

        }
    }

    private void opCase(int opcion) {
        switch (opcion) {
            case 1:
                for (Carta carta : baraja.getCartas()) {
                    System.out.println(carta);
                }
                break;
            case 2:
                System.out.println(baraja.getSize());
                break;
            case 3:
                baraja.quitarUno();
                System.out.println("se quitó una carta de la baraja");
                break;
            case 4:
                baraja.shuffle();
                System.out.println("se ha mezclado la baraja");
                break;
            case 5:
                break;
            default:
                System.out.println("lee bien porfa :D");
                break;
        }
    }

}