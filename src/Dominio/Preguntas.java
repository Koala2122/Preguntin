package Dominio;

public class Preguntas {
    
    private int id_pregunta, Id_Correcta, Id_Incorrecta1, Id_Incorrecta2, Id_Incorrecta3;
    String Categoria, pregunta;  

    public Preguntas() {
    }

    public Preguntas(int id_pregunta, String Categoria, String pregunta, int Id_Correcta, int Id_Incorrecta1, int Id_Incorrecta2, int Id_Incorrecta3) {
        this.id_pregunta = id_pregunta;
        this.Categoria = Categoria;
        this.pregunta = pregunta;
        this.Id_Correcta = Id_Correcta;
        this.Id_Incorrecta1 = Id_Incorrecta1;
        this.Id_Incorrecta2 = Id_Incorrecta2;
        this.Id_Incorrecta3 = Id_Incorrecta3;
    }

    public int getId_pregunta() {
        return id_pregunta;
    }

    public void setId_pregunta(int id_pregunta) {
        this.id_pregunta = id_pregunta;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public int getId_Correcta() {
        return Id_Correcta;
    }

    public void setId_Correcta(int Id_Correcta) {
        this.Id_Correcta = Id_Correcta;
    }

    public int getId_Incorrecta1() {
        return Id_Incorrecta1;
    }

    public void setId_Incorrecta1(int Id_Incorrecta1) {
        this.Id_Incorrecta1 = Id_Incorrecta1;
    }

    public int getId_Incorrecta2() {
        return Id_Incorrecta2;
    }

    public void setId_Incorrecta2(int Id_Incorrecta2) {
        this.Id_Incorrecta2 = Id_Incorrecta2;
    }

    public int getId_Incorrecta3() {
        return Id_Incorrecta3;
    }

    public void setId_Incorrecta3(int Id_Incorrecta3) {
        this.Id_Incorrecta3 = Id_Incorrecta3;
    }


    @Override
    public String toString() {
        return "Preguntas{" + "id_pregunta=" + id_pregunta + ", tipo=" + Categoria + ", pregunta=" + pregunta + ", Id_Correcta=" + Id_Correcta + ", Id_Incorrecta1=" + Id_Incorrecta1 + ", Id_Incorrecta2=" + Id_Incorrecta2 + ", Id_Incorrecta3=" + Id_Incorrecta3 + '}';
    }
          
    
}
