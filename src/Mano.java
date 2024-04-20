import java.util.ArrayList;
import java.util.Collections;
public class Mano {

    private ArrayList<Carta> cartas;

    public Mano(Carta carta1, Carta carta2) {
        this.cartas = new ArrayList<>();
        cartas.add(carta1);
        cartas.add(carta2);
    }

    public Mano(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
        this.cartas = new ArrayList<>();
        cartas.add(carta1);
        cartas.add(carta2);
        cartas.add(carta3);
        cartas.add(carta4);
        cartas.add(carta5);
    }

    public void agregarCarta(Carta carta) {
        cartas.add(carta);
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public Carta cartaUno() {
        if (!cartas.isEmpty()) {
            return cartas.get(0);
        } else {
            return null;
        }
    }

    public Carta cartaDos() {
        if (!cartas.isEmpty()) {
            return cartas.get(1);
        } else {
            return null;
        }
    }

    //------------- Para el Dealer -------------//

    public Carta cartaTres() {
        if (!cartas.isEmpty()) {
            return cartas.get(2);
        } else {
            return  null;
        }
    }

    public Carta cartaCuatro() {
        if (!cartas.isEmpty()) {
            return cartas.get(3);
        } else {
            return  null;
        }
    }

    public Carta cartaCinco() {
        if (!cartas.isEmpty()) {
            return cartas.get(4);
        } else {
            return  null;
        }
    }

    //------------------------------------------//


    @Override
    public String toString() {
        return "Mano " + cartas ;
    }
}
