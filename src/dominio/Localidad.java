package dominio;

public class Localidad {
    private String nombre;
    private int habitantes_localidad;

    public Localidad(String nombre, int habitantes_localidad) {
        this.nombre = nombre;
        this.habitantes_localidad = habitantes_localidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHabitantes_localidad() {
        return habitantes_localidad;
    }

    public void setHabitantes_localidad(int habitantes_localidad) {
        this.habitantes_localidad = habitantes_localidad;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + "\t población: " + habitantes_localidad;
    }
}

