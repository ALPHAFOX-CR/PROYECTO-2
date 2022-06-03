
package Modelo;

public class Cibercrimen extends Caso {
    private String tiposCiber;

    public Cibercrimen() {
    }

    public Cibercrimen(String tiposCiber){
        this.tiposCiber = tiposCiber;
    }

    public String getTiposCiber() {
        return tiposCiber;
    }

    public void setTiposCiber(String tiposCiber) {
        this.tiposCiber = tiposCiber;
    }


    public String Casos7() {
        return "Cibercrimen{" + "tiposCiber=" + tiposCiber + '}';
    }
}
