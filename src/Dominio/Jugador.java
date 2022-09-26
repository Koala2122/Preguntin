
package Dominio;

public class Jugador {
    
    private String Nombre;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Jugador{" + "Nombre=" + Nombre + ", id=" + id + '}';
    }

    
}
