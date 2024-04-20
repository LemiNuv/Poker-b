import java.util.Random;

public class Dealer {
    private Baraja baraja;
    private Mano manoc;

    public Dealer(Baraja baraja) {
        this.baraja = baraja;
    }

    public void recibirMano(Mano mano) {
        this.manoc = mano;
    }

    public Mano repartirMano() {
        Carta carta1 = baraja.quitarUnaCarta();
        Carta carta2 = baraja.quitarUnaCarta();
        return new Mano(carta1, carta2);
    }

    //Mano del Dealer
    public Mano manoDealer() {
        baraja.shuffle();
        Carta carta1 = baraja.quitarUnaCarta();
        Carta carta2 = baraja.quitarUnaCarta();
        Carta carta3 = baraja.quitarUnaCarta();
        Carta carta4 = baraja.quitarUnaCarta();
        Carta carta5 = baraja.quitarUnaCarta();
        return new Mano(carta1, carta2, carta3, carta4, carta5);
    }

    //------------- Recibir cartas -------------//

    public Carta primeraCarta() {
        if (manoc != null) {
            return manoc.cartaUno();
        } else {
            return null;
        }
    }

    public Carta segundaCarta() {
        if (manoc != null) {
            return manoc.cartaDos();
        } else {
            return null;
        }
    }

    public Carta terceraCarta() {
        if (manoc != null) {
            return manoc.cartaTres();
        } else {
            return null;
        }
    }

    public Carta cuartaCarta() {
        if (manoc != null) {
            return manoc.cartaCuatro();
        } else {
            return null;
        }
    }

    public Carta quintaCarta() {
        if (manoc != null) {
            return manoc.cartaCinco();
        } else {
            return null;
        }
    }
    //-------------------------------------------------//

    public int turnoCiega() {
        Random random = new Random();
        int cg = random.nextInt(2);
        return cg;
    }
   
    public void shuffleBaraja() {
        baraja.shuffle();
    }

    public Mano getMano() {
        return manoc;
    }

}
