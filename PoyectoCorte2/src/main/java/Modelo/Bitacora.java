
package Modelo;

import java.util.ArrayList;

public class Bitacora extends Anotacion {
    ArrayList<Anotacion> anotaciones = new ArrayList<>();

    public Bitacora() {
    }
    

    public Bitacora(Anotacion anotacion1) {
    
    }
    public ArrayList<Anotacion> getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(ArrayList<Anotacion> anotaciones) {
        this.anotaciones = anotaciones;
    }


    public String Casos9() {
        return "Bitacora{" + "anotaciones=" + anotaciones + '}';
    }
}
