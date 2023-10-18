
package aplicacion;

import dominio.Localidad;
import dominio.Municipio;
import dominio.Provincia;

public class Main {
    public static void main(String[] args) {
        Localidad localidad1 = new Localidad("Mostoles", 10000);
        Localidad localidad2 = new Localidad("Carabanchel", 7000);

        Municipio municipio1 = new Municipio("Madrid");
        municipio1.addLocalidad(localidad1);
        municipio1.addLocalidad(localidad2);

        Provincia provincia1 = new Provincia("Comunidad de Madrid");
        provincia1.addMunicipio(municipio1);

        Localidad localidad3 = new Localidad("Malvarosa", 8000);
        Localidad localidad4 = new Localidad("Benimaclet", 5000);

        Municipio municipio2 = new Municipio("Valencia");
        municipio2.addLocalidad(localidad3);
        municipio2.addLocalidad(localidad4);

        Provincia provincia2 = new Provincia("C Valenciana");
        provincia2.addMunicipio(municipio2);
    }
}

