//Bot
public class Alae {

    private int fichas;
    private Mano mano;

    public Alae(int fichas) {
        this.fichas = fichas;
    }

    public void recibirMano(Mano mano) {
        this.mano = mano;
    }

    public Mano getMano() {
        return mano;
    }

    

}
