public class Jugador {

    private int fichas;
    private Mano mano;

    public Jugador(int fichas) {
        this.fichas = fichas;
    }

    public void recibirMano(Mano mano) {
        this.mano = mano;
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

    public Mano getMano(){
        return mano;
    }

}
