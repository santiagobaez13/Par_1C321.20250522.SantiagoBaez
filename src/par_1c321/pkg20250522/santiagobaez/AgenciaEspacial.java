package par_1c321.pkg20250522.santiagobaez;

import java.util.*;

public class AgenciaEspacial {

    private List<Nave> naves = new ArrayList<>();

    public void agregarNave(Nave nave) {
        if (naves.contains(nave)) {
            System.out.println("Ya existe una nave con ese nombre y año.");
        } else {
            naves.add(nave);
            System.out.println("Nave agregada.");
        }
    }

    public void mostrarNaves() {
        if (naves.isEmpty()) {
            System.out.println("No hay naves");
            return;
        }
        for (Nave n : naves) {
            System.out.println(n);
        }
    }

    public void iniciarExploracion() {
        for (Nave n : naves) {
            n.iniciarMision();
        }
    }

    public void ordenarPorNombre() {
        Collections.sort(naves, new Comparator<Nave>() {
            @Override
            public int compare(Nave n1, Nave n2) {
                return n1.getNombre().compareTo(n2.getNombre());
            }
        });
        mostrarNaves();
    }

    public void ordenarPorAnio() {
        Collections.sort(naves);
        mostrarNaves();
    }

    public void ordenarPorTripulacion() {
        Collections.sort(naves, new Comparator<Nave>() {
            @Override
            public int compare(Nave n1, Nave n2) {
                return Integer.compare(n2.getCapacidadDeTripulacion(), n1.getCapacidadDeTripulacion());

            }

        }
        );
        mostrarNaves();
    }
}
