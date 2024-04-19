import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {

    private List<Carta> cartas;

    public Baraja() {
        cartas = new ArrayList<>();
        for (Palo palos : Palo.values()) {
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

    public Carta quitarUnaCarta() {
        if (getSize() > 0) {
            return cartas.remove(cartas.size() -1);
        } else {
            return null;
        }
    }

    public List<Carta> getCartas() {
        return cartas;
    }



}
