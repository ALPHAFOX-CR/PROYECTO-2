
package Modelo;

import java.util.ArrayList;

public class Oficina {
    private String CodOficina;
    private ArrayList<Detective> detective = new ArrayList<>();
    private ArrayList<Caso> casox = new ArrayList<>();
    private ArrayList<Sospechoso> sospechoso = new ArrayList<>();

    public Oficina() {
    }
    public Oficina(Detective detective, Caso casox, Sospechoso sospechoso, String CodOficina){
    this.CodOficina = CodOficina;
    }

    public ArrayList<Detective> getDetective() {
        return detective;
    }

    public ArrayList<Caso> getCasox() {
        return casox;
    }

    public ArrayList<Sospechoso> getSospechoso() {
        return sospechoso;
    }
    public String getCodOficina() {
        return CodOficina;
    }

    public void setCodOficina(String CodOficina) {
        this.CodOficina = CodOficina;
    }

    public void setDetective(ArrayList<Detective> detective) {
        this.detective = detective;
    }

    public void setCasox(ArrayList<Caso> casox) {
        this.casox = casox;
    }

    public void setSospechoso(ArrayList<Sospechoso> sospechoso) {
        this.sospechoso = sospechoso;
    }
    
  
    public String Casos2() {
       return "Codigo Oficina : " + CodOficina + "" + detective + "" + casox + "" + sospechoso; 
    }
}
