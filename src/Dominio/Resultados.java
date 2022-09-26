package Dominio;

public class Resultados {
    
    private int Juego;
    private String Jugador_1, Jugador_2, Ganador, Fecha;

    public Resultados(int Juego, String Jugador_1, String Jugador_2, String Ganador, String Fecha) {
        this.Juego = Juego;
        this.Fecha = Fecha;
        this.Jugador_1 = Jugador_1;
        this.Jugador_2 = Jugador_2;
        this.Ganador = Ganador;
    }

    public Resultados() {
    }

    public int getJuego() {
        return Juego;
    }

    public void setJuego(int Juego) {
        this.Juego = Juego;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getJugador_1() {
        return Jugador_1;
    }

    public void setJugador_1(String Jugador_1) {
        this.Jugador_1 = Jugador_1;
    }

    public String getJugador_2() {
        return Jugador_2;
    }

    public void setJugador_2(String Jugador_2) {
        this.Jugador_2 = Jugador_2;
    }

    public String getGanador() {
        return Ganador;
    }

    public void setGanador(String Ganador) {
        this.Ganador = Ganador;
    }

    @Override
    public String toString() {
        return "Resultados{" + "Juego=" + Juego + ", Jugador_1=" + Jugador_1 + ", Jugador_2=" + Jugador_2 + ", Ganador=" + Ganador + ", Fecha=" + Fecha + '}';
    }

    
    
    
}
