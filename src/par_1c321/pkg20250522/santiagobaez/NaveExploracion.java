
package par_1c321.pkg20250522.santiagobaez;

public class NaveExploracion extends Nave {

    public enum TipoMision {
        CARTOGRAFIA, INVESTIGACION, CONTACTO
    }

    private TipoMision tipoMision;

    public NaveExploracion(String nombre, int capacidad, int anio, TipoMision tipoMision) {
        super(nombre, capacidad, anio);
        this.tipoMision = tipoMision;
    }

    @Override
    public void iniciarMision() {
        System.out.println(nombre + " inicia misión de " + tipoMision);
    }

    @Override
    public String toString() {
        return super.toString() + ", Misión: " + tipoMision;
    }
}
