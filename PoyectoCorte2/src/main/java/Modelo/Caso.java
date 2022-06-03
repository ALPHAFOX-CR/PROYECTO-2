
package Modelo;

import java.util.ArrayList;

public class Caso {
    private String idCaso;
    private String descripcion;
    private String prioridad;
    private Detective detective;
    private String clave;
    ArrayList<Sospechoso> sospechosos = new ArrayList<>();
    private ArrayList<Bitacora> bitacora = new ArrayList<>();

    public Caso() {
    }

    public Caso(String idCaso, String descripcion, String prioridad, Detective detective, String clave,Sospechoso sospechoso, Bitacora bitacora) {
        this.idCaso = idCaso;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.detective = detective;
        this.clave = clave;
    }

    
    public String getIdCaso() {
        return idCaso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public Detective getDetective() {
        return detective;
    }

    public String getClave() {
        return clave;
    }

    public ArrayList<Sospechoso> getSospechosos() {
        return sospechosos;
    }
    public ArrayList<Bitacora> getBitacora() {
        return bitacora;
    }
    

    public void setIdCaso(String idCaso) {
        this.idCaso = idCaso;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public void setDetective(Detective detective) {
        this.detective = detective;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setSospechosos(ArrayList<Sospechoso> sospechosos) {
        this.sospechosos = sospechosos;
    }
    public void setBitacora(ArrayList<Bitacora> bitacora) {
        this.bitacora = bitacora;
    }


    
    public String Casos8() {
        return "Caso{" + "idCaso=" + idCaso + ", descripcion=" + descripcion + ", prioridad=" + prioridad + ", detective=" + detective + ", clave=" + clave + ", sospechosos=" + sospechosos + ", bitacora=" + bitacora + '}';
    }
}
