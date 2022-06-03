
package Modelo;

public class Homicidio extends Detective {
    private String detectiveSecundario;

    public Homicidio(){
    }
    public Homicidio( String id, String nombre, String apellido, int Experiencia,String tipoCaso, String detectiveSecundario){
    super(id, nombre, apellido, Experiencia, tipoCaso);
    this.detectiveSecundario = detectiveSecundario;
    }

    public Homicidio(String detectiveSecundario) {
        this.detectiveSecundario = detectiveSecundario;
    }

    public String getDetectiveSecundario() {
        return detectiveSecundario;
    }

    public void setDetectiveSecundario(String detectiveSecundario) {
        this.detectiveSecundario = detectiveSecundario;
    }


    public String Casos4() {
        return "Homicidio{" + "detectiveSecundario=" + detectiveSecundario + '}';
    }
}
