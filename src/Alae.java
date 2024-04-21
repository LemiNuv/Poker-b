import java.util.Random;
//🍷🐛 Bot
public class Alae {

    private boolean ciega = false;
    private int fichas;
    private Mano mano;

    public Alae(int fichas) {
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

    //Getters and Setters
    public Mano getMano() {
        return mano;
    }

    public int getFichas() {
        return fichas;
    }

    public void setFichas(int fichas) {
        this.fichas = fichas;
    }

    public void setCiega(boolean ciega) {
        this.ciega = ciega;
    }

    public boolean isCiega() {
        return ciega;
    }

    //Cerebro del Bot
    public int apuestaInicial() {
        if (ciega) {
            int min = 100;
            int max = 300;
            Random randi = new Random();
            int apuestaAlae = randi.nextInt(max - min + 1) + min;
            this.fichas = this.fichas - apuestaAlae;
            return apuestaAlae;
        } else {
            return 0;
        }
    }

    public int redoblarCiega(int apuestaJug) {
        if (apuestaJug > this.fichas) {
            System.out.println("Alae no cuenta con las fichas necesarias.");
            return this.fichas;
        } else {
            int redoble = (apuestaJug*2);
            this.fichas = this.fichas - redoble;
            return redoble;
        }
    }
}
