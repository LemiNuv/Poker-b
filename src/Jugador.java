import java.util.Scanner;

public class Jugador {

    private int fichas;
    private Mano mano;

    public Jugador(int fichas) {
        this.fichas = fichas;
    }

    public void recibirMano(Mano mano) {
        this.mano = mano;
    }

    public void apuesta(int apuesta) {
        if (apuesta > this.fichas) {
            System.out.println("No tienes suficientes fichas para la apuesta.");
        } else if (apuesta < 0) {
            System.out.println("No puedes realizar una apuesta negativa.");
        } else {
            this.fichas = this.fichas - apuesta;
        }
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

    public int opciones(int opciones, int apuestaAlae, int apuestaJug) {
        switch (opciones) {
            case 1: //Igualar
                if (this.fichas < apuestaAlae) {
                    System.out.println("¡No cuentas con las fichas suficientes!.\nTus fichas:");
                    return this.fichas;
                } else {
                    int restar = apuestaAlae - apuestaJug;
                    this.fichas -= restar;
                    System.out.println("Igualaste la apuesta:");
                    System.out.println(apuestaJug + restar);
                    System.out.println(this.fichas);
                    return apuestaJug + restar; //Retorna la apuesta igualada
                }
            case 2: //Subir la apuesta
                if (this.fichas < apuestaAlae) {
                    System.out.println("¡No cuentas con las fichas suficientes!.\nTus fichas:");
                    return this.fichas;
                } else {
                    Scanner in = new Scanner(System.in);
                    System.out.println("¿Cuanto quieres subir la apuesta?");
                    System.out.println("- Apuesta de Alae --> " + apuestaAlae);
                    System.out.println("- Tus fichas --> " + this.fichas);
                    System.out.println("- Tu apuesta anterior --> " + apuestaJug);
                    int subirApuesta = in.nextInt();
                    if (subirApuesta > this.fichas) {
                        System.out.println("¡No cuentas con las fichas suficientes!");
                        in.close();
                        return this.fichas;
                    } else {
                        this.fichas -= subirApuesta;
                        System.out.println(this.fichas);
                        System.out.println("Tu apuesta ahora es de --> " + (subirApuesta + apuestaJug));
                        System.out.println("Tus fichas --> " + this.fichas);
                        //in.close();
                        return apuestaJug + subirApuesta; //Retorna la apuesta anterior más lo que el jugador quiera subir
                    }
                }
            case 3:
                System.out.println("Te retiras de la partida :(");
                return 0;
            default:
                System.out.println("Opción no valida.");
                return this.fichas;
        }
    }

    //Getters y Setters
    public Mano getMano() {
        return mano;
    }

    public int getFichas() {
        return fichas;
    }

    public void setFichas(int fichas) {
        this.fichas = fichas;
    }

}
