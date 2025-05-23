package par_1c321.pkg20250522.santiagobaez;



public class Carguero extends Nave {

    private int capacidadCarga;

    public Carguero(String nombre, int capacidad, int anio, int carga) {
        super(nombre, capacidad, anio);
        if (carga < 100) {
            this.capacidadCarga = 100;
        } else if (carga > 500) {
            this.capacidadCarga = 500;
        } else {
            this.capacidadCarga = carga;
        }
    }

    @Override
    public void iniciarMision() {
        System.out.println(nombre + " inicia misión de transporte de carga.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Carga: " + capacidadCarga + " toneladas";
    }
}
