package presentacion;

import dominio.Localidad;
import dominio.Municipio;
import dominio.Provincia;

import java.util.ArrayList;
import java.util.Scanner;

public class InterfazUsuario {
    public static ArrayList<Provincia> leer() {
        ArrayList<Provincia> provincias = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String numProvincia;
        String numMunicipio;
        String numLocalidad;

        do {
            System.out.print("Nombre de la provincia (pulse enter para finalizar)");
            numProvincia = sc.nextLine();
            if (!numProvincia.equals("")) {
                Provincia p = new Provincia(numProvincia);

                do {
                    System.out.print("Nombre del Municipio (pulse enter para finalizar)");
                    numMunicipio = sc.nextLine();
                    if (!numMunicipio.equals("")) {
                        Municipio m = new Municipio(numMunicipio);

                        do {
                            System.out.print("Nombre de la localidad (pulse enter para finalizar)");
                            numLocalidad = sc.nextLine();
                            if (!numLocalidad.equals("")) {
                                System.out.print("Numero de habitantes (pulse enter para finalizar)");
                                int totalLocalidad = Integer.parseInt(sc.nextLine());
                                Localidad a = new Localidad(numLocalidad, totalLocalidad);
                                m.addLocalidad(a);
                            }
                        } while (!numLocalidad.equals(""));

                        p.addMunicipio(m);
                    }
                } while (!numMunicipio.equals(""));

                provincias.add(p);
            }
        } while (!numProvincia.equals(""));

        return provincias;
    }
}
