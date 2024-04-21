import java.util.Scanner;

public class Jugador {

    private int fichas;
    private Mano mano;

    public Jugador(int fichas) {
        this.fichas = fichas;
    }

    public void recibirMano(Mano mano) {
        this.mano = mano;
    }

    public int apuesta() {
        Scanner in = new Scanner(System.in);
        while (true) {

            System.out.println("¿Cuanto quieres apostar?");
            int apuesta = in.nextInt();

            if (apuesta > this.fichas) {
                System.out.println("No tienes suficientes fichas para la apuesta.");
            } else if (apuesta < 100) {
                System.out.println("La apuesta mínima es de 100 fichas.");
            } else {
                this.fichas -= apuesta;
                System.out.println("Apuesta realizada de " + apuesta + " fichas.");
                in.close();
                return apuesta;
            }
        }
    }
    

    public Carta primeraCarta() {
        if (mano != null) {
            return mano.cartaUno();
        } else {
            return null;
        }
    }

    public Carta segundaCarta() {
        if (mano != null) {
            return mano.cartaDos();
        } else {
            return null;
        }
    }

    //Getters y Setters
    public Mano getMano() {
        return mano;
    }

    public int getFichas() {
        return fichas;
    }

    public void setFichas(int fichas) {
        this.fichas = fichas;
    }

}
