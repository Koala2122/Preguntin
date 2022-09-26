package Dominio;

public class Correctas {
    
    private String respuesta;
    private int id_respuesta;

    public Correctas() {
    }

    public Correctas(String respuesta, int id_respuesta) {
        this.respuesta = respuesta;
        this.id_respuesta = id_respuesta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getId_respuesta() {
        return id_respuesta;
    }

    public void setId_respuesta(int id_respuesta) {
        this.id_respuesta = id_respuesta;
    }

    @Override
    public String toString() {
        return "Correctas{" + "respuesta=" + respuesta + ", id_respuesta=" + id_respuesta + '}';
    }
    
    
}
