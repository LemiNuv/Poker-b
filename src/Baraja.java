import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {

    private List<Carta> cartas;

    public Baraja() {
        cartas = new ArrayList<>();
        for (Palos palos : Palos.values()) {
            for (Valor valor : Valor.values()) {
                cartas.add(new Carta(palos,valor));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cartas);
    }

    public int getSize() {
        return cartas.size();
    }

    public List<Carta> getCartas() {
        return cartas;
    }

}
