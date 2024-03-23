public class Carta {

    private final Palos palos;
    private final Valor valor;

    public Carta(Palos palos, Valor valor) {
        this.palos = palos;
        this.valor = valor;
    }

    public Palos getPalos() {
        return palos;
    }

    public Valor getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Carta " +
                "palo = " + palos +
                ", valor = " + valor;
    }
}
