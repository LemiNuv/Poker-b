import java.util.ArrayList;
import java.util.Collections;
public class Mano {

    private ArrayList<Carta> cartas;

    public Mano(Carta carta1, Carta carta2) {
        this.cartas = new ArrayList<>();
        cartas.add(carta1);
        cartas.add(carta2);
        
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

    @Override
    public String toString() {
        return "Mano" + cartas ;
    }
}
