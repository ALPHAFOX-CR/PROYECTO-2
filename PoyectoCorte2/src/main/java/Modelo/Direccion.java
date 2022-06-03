
package Modelo;

public class Direccion {
    private String noVivienda;
    private String localidad;
    private String ciudad;
    private String departamento;
    private String pais;
    private boolean fotografia;
    private String descripcion;

    public Direccion() {
    }

    public Direccion(String noVivienda, String localidad, String ciudad,String departamento, String pais, boolean fotografia, String descripcion) {
        this.noVivienda = noVivienda;
        this.localidad = localidad;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fotografia = fotografia;
        this.descripcion = descripcion;
    }

    public String getNoVivienda() {
        return noVivienda;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getPais() {
        return pais;
    }

    public boolean isFotografia() {
        return fotografia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNoVivienda(String noVivienda) {
        this.noVivienda = noVivienda;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setFotografia(boolean fotografia) {
        this.fotografia = fotografia;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




    public String Casos5() {
        return "Direccion{" + "noVivienda=" + noVivienda + ", localidad=" + localidad + ", ciudad=" + ciudad + ", pais=" + pais + ", fotografia=" + fotografia + ", descripcion=" + descripcion + '}';
    }
}
