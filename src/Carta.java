import java.util.Collections;

public class Carta {

    private final Palo palos;
    private final Valor valor;

    public Carta(Palo palos, Valor valor) {
        this.palos = palos;
        this.valor = valor;
    }

    public Palo getPalos() {
        return palos;
    }

    public Valor getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "palo = " + palos +
                ", valor = " + valor;

    }
}
