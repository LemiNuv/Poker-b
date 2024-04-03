public class Jugador {

    private int fichas;
    private Mano mano;

    public Jugador(int fichas) {
        this.fichas = fichas;
    }

    public void recibirMano(Mano mano) {
        this.mano = mano;
    }

    public Mano getMano(){
        return mano;
    }

}
