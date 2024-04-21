import java.util.Random;
//🍷🐛 Bot
public class Alae {

    private boolean ciega = false;
    private boolean igualar = false;
    private int fichas;
    private int fichasApostadas = 0;
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

    public boolean isIgualar() {
        return igualar;
    }

    public void setIgualar(boolean igualar) {
        this.igualar = igualar;
    }

    public int getFichasApostadas() {
        return fichasApostadas;
    }

    public void setFichasApostadas(int fichasApostadas) {
        this.fichasApostadas = fichasApostadas;
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

    public void subir(int apuestaJugador) {
        if (apuestaJugador > this.fichas) {
            System.out.println("Alae no cuenta con las fichas suficientes");
        } else {
            Random randi = new Random();
            int min = apuestaJugador;
            int max = 300;
            int apuestaAlae = randi.nextInt(max - apuestaJugador + 1) + apuestaJugador;
            System.out.println("Ale sube la apuesta a " + apuestaAlae);
            this.fichasApostadas = apuestaAlae;
        }
    }

    public void igualar(int apuestaJugador) {
        if (apuestaJugador > this.fichas) {
            System.out.println("Alae no cuenta con las fichas suficientes"); //cambiar
        } else {
            int apuestaAlae = apuestaJugador;
            this.fichas -= apuestaAlae;
            System.out.println("Alae iguala la apuesta.");
            System.out.println(apuestaAlae);
            this.fichas -= apuestaAlae;
            this.fichasApostadas = apuestaAlae;
        }
    }

    public void desicion(int apuestaJugador) {
        Random randi = new Random();
        int min = 0;
        int max = 500;
        int desicion = randi.nextInt(max - min +1) + min;
        
        if (desicion <= 165) { //subir
            subir(apuestaJugador);
        } else if (desicion >= 166) { //Igualar  
            igualar(apuestaJugador);
        }
    }

}
