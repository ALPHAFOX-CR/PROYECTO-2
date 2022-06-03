
package Vista;
import Modelo.*;

public class Prueba {

    public static void main(String[] args) {
        Detective detective1 = new Detective("74285", "jose", "suerez", 23,"homicidio");
        Anotacion anotacion1 = new Anotacion("29/10/01", "sin observacion");
        Bitacora bitacora1 = new Bitacora(anotacion1);
        Direccion direccion = new Direccion("4674", "barrio sabana","valledupar","cesar","Colombia", true, "casa amarrila");
        Sospechoso sospechoso1 = new Sospechoso("94958868", "andres cuello","don pachecho","34", direccion);
        Caso caso1 = new Caso("989","contrabando", "a", detective1, "fantasma", sospechoso1, bitacora1);
        Cibercrimen cibercrimen = new Cibercrimen("Pornografia");
        Homicidio homicidio = new Homicidio("juan perez");
        Narcotico narcotico = new Narcotico("Drogas");
        Oficina oficina = new Oficina(detective1, caso1, sospechoso1,"FD21");
        
        detective1.Casos6();
        anotacion1.Casos10();
        bitacora1.Casos9();
        direccion.Casos5();
        sospechoso1.Casos1();
        caso1.Casos8();
        cibercrimen.Casos7();
        homicidio.Casos4();
        narcotico.Casos3();
        oficina.Casos2();
    }
    
}
