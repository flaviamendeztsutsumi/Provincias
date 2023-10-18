package dominio;

import java.util.ArrayList;
import java.util.List;

public class Provincia {
    private String nombre;
    private List<Municipio> municipios;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.municipios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Municipio> getMunicipios() {
        return municipios;
    }

    public void addMunicipio(Municipio municipio) {
        municipios.add(municipio);
    }

    public int getPoblacionTotal() {
        int poblacionTotal = 0;
        for (Municipio municipio : municipios) {
            poblacionTotal += municipio.getPoblacion();
        }
        return poblacionTotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Provincia: ").append(nombre).append("\n");
        sb.append("Municipios:\n");

        for (Municipio municipio : municipios) {
            sb.append(municipio.toString()).append("\n");
        }

        return sb.toString();
    }
}

