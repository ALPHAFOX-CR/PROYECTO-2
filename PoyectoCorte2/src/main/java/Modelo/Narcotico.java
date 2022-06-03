
package Modelo;

public class Narcotico extends Caso{
    private String tipoNarcotico;

    public Narcotico() {
    }

    public Narcotico(String tipoNarcotico) {
        this.tipoNarcotico = tipoNarcotico;
    }

    public String getTipoNarcotico() {
        return tipoNarcotico;
    }

    public void setTipoNarcotico(String tipoNarcotico) {
        this.tipoNarcotico = tipoNarcotico;
    }

  
    public String Casos3() {
        return "Narcotico{" + "tipoNarcotico=" + tipoNarcotico + '}';
    }
}
