
package Dominio;


public class Respuestas {
    
    String Correcta, Incorrecta_1, Incorrecta_2, Incorrecta_3, Respuesta;

    public Respuestas() {
    }

    public Respuestas(String Correcta, String Incorrecta_1, String Incorrecta_2, String Incorrecta_3, String Respuesta) {
        this.Correcta = Correcta;
        this.Incorrecta_1 = Incorrecta_1;
        this.Incorrecta_2 = Incorrecta_2;
        this.Incorrecta_3 = Incorrecta_3;
        this.Respuesta = Respuesta;
    }

    public String getCorrecta() {
        return Correcta;
    }

    public void setCorrecta(String Correcta) {
        this.Correcta = Correcta;
    }

    public String getIncorrecta_1() {
        return Incorrecta_1;
    }

    public void setIncorrecta_1(String Incorrecta_1) {
        this.Incorrecta_1 = Incorrecta_1;
    }

    public String getIncorrecta_2() {
        return Incorrecta_2;
    }

    public void setIncorrecta_2(String Incorrecta_2) {
        this.Incorrecta_2 = Incorrecta_2;
    }

    public String getIncorrecta_3() {
        return Incorrecta_3;
    }

    public void setIncorrecta_3(String Incorrecta_3) {
        this.Incorrecta_3 = Incorrecta_3;
    }

    public String getRespuesta() {
        return Respuesta;
    }

    public void setRespuesta(String Respuesta) {
        this.Respuesta = Respuesta;
    }

    @Override
    public String toString() {
        return "Respuestas{" + "Correcta=" + Correcta + ", Incorrecta_1=" + Incorrecta_1 + ", Incorrecta_2=" + Incorrecta_2 + ", Incorrecta_3=" + Incorrecta_3 + ", Respuesta=" + Respuesta + '}';
    }
   
    
}
