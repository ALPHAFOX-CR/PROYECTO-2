
package Modelo;



public class Anotacion {
    private String fechaRegistro;
    private String observacion;

    public Anotacion() {
    }

    public Anotacion(String fechaRegistro, String observacion) {
        this.fechaRegistro = fechaRegistro;
        this.observacion = observacion;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
   
    public String Casos10() {
        return "Anotacion{" + "fechaRegistro=" + fechaRegistro + ", observacion=" + observacion + '}';
    }
}
