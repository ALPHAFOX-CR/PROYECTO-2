
package Modelo;

import java.util.ArrayList;

public class Detective extends Caso{
    private String id;
    private String nombre;
    private String apellido;
    private int Experiencia;
    private String tipoCaso;
    ArrayList<Caso> casos = new ArrayList<>();
    

    public Detective() {
    }

    public Detective(String id, String nombre, String apellido, int Experiencia, String tipoCaso) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Experiencia = Experiencia;
        this.tipoCaso = tipoCaso;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getAñosExperiencia() {
        return Experiencia;
    }

    public String getTipoCaso() {
        return tipoCaso;
    }

    public ArrayList<Caso> getCasos() {
        return casos;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.Experiencia = añosExperiencia;
    }

    public void setTipoCaso(String tipoCaso) {
        this.tipoCaso = tipoCaso;
    }

    public void setCasos(ArrayList<Caso> casos) {
        this.casos = casos;
    }

  
    public String Casos6() {
        return "Detective{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", Experiencia=" + Experiencia + ", tipoCaso=" + tipoCaso + ", casos=" + casos + '}';
    }
}
