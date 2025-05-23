
package par_1c321.pkg20250522.santiagobaez;

public class CruceroEstelar extends Nave {
    private int cantidadPasajeros;

    public CruceroEstelar(String nombre, int capacidad, int anio, int pasajeros) {
        super(nombre, capacidad, anio);
        this.cantidadPasajeros = pasajeros;
    }

    @Override
    public void iniciarMision() {
        System.out.println(nombre + "es un crucero espacial, no realiza misiones");
    }

    @Override
    public String toString() {
        return super.toString() + ", Pasajeros: " + cantidadPasajeros;
    }
}

