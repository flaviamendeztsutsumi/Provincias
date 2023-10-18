
package dominio;

import java.util.ArrayList;
import java.util.List;

public class Municipio {
    private String nombre;
    private List<Localidad> localidades;

    public Municipio(String nombre) {
        this.nombre = nombre;
        this.localidades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Localidad> getLocalidades() {
        return localidades;
    }

    public void addLocalidad(Localidad localidad) {
        localidades.add(localidad);
    }

    public int getPoblacion() {
        int total = 0;
        for (Localidad localidad : localidades) {
            total += localidad.getHabitantes_localidad();
        }
        return total;
    }

  
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Municipio: ").append(nombre).append("\n");
        sb.append("Localidades:\n");

        for (Localidad localidad : localidades) {
            sb.append(localidad.toString()).append("\n");
        }

        return sb.toString();
    }
}


