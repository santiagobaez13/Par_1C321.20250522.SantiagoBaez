
package par_1c321.pkg20250522.santiagobaez;

public abstract class Nave implements Comparable <Nave> {
    String nombre;
    int capacidadTripulacion;
    int anioLanzamiento;

    public Nave(String nombre, int capacidadDeTripulacion, int anioDeLanzamiento) {
        this.nombre = nombre;
        this.capacidadTripulacion = capacidadDeTripulacion;
        this.anioLanzamiento = anioDeLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnioDeLanzamiento() {
        return anioLanzamiento;
    }

    public int getCapacidadDeTripulacion() {
        return capacidadTripulacion;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Nave)) return false;
        Nave otra = (Nave) obj;
        return this.nombre.equalsIgnoreCase(otra.nombre) && this.anioLanzamiento == otra.anioLanzamiento;
    }
    @Override
    public int hashCode(){
        return nombre.toLowerCase().hashCode()+ anioLanzamiento;
        
    }
        @Override
    public int compareTo(Nave otra) {
        if (this.anioLanzamiento != otra.anioLanzamiento) {
            return Integer.compare(otra.anioLanzamiento, this.anioLanzamiento);
        }
        return Integer.compare(otra.capacidadTripulacion, this.capacidadTripulacion);
    }
    
    public abstract void iniciarMision();

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Tripulación: " + capacidadTripulacion + ", Año: " + anioLanzamiento;
    }
}
