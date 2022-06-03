
package Modelo;

public class Sospechoso extends Direccion{
    private String idSospechoso;
    private String NombreSospechoso;
    private String alias;
    private String edadSospechoso;
    private Direccion direccion;

    public Sospechoso() {
    }

    public Sospechoso(String idSospechoso, String NombreSospechoso, String alias, String edadSospechoso, Direccion direccion) {
        this.idSospechoso = idSospechoso;
        this.NombreSospechoso = NombreSospechoso;
        this.alias = alias;
        this.edadSospechoso = edadSospechoso;
        this.direccion = direccion;
    }

    public String getIdSospechoso() {
        return idSospechoso;
    }

    public String getNombreSospechoso() {
        return NombreSospechoso;
    }

    public String getAlias() {
        return alias;
    }

    public String getEdadSospechoso() {
        return edadSospechoso;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setIdSospechoso(String idSospechoso) {
        this.idSospechoso = idSospechoso;
    }

    public void setNombreSospechoso(String NombreSospechoso) {
        this.NombreSospechoso = NombreSospechoso;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setEdadSospechoso(String edadSospechoso) {
        this.edadSospechoso = edadSospechoso;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String Casos1() {
        return "Sospechoso{" + "idSospechoso=" + idSospechoso + ", NombreSospechoso=" + NombreSospechoso + ", alias=" + alias + ", edadSospechoso=" + edadSospechoso + ", direccion=" + direccion + '}';
    }
}
