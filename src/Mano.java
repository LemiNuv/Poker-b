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

    @Override
    public String toString() {
        return "Mano" + cartas ;
    }
}
