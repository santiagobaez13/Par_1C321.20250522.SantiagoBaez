package par_1c321.pkg20250522.santiagobaez;

import java.util.Scanner;

public class Par_1C32120250522SantiagoBaez {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AgenciaEspacial agencia = new AgenciaEspacial();
        int opcion;

        do {
            System.out.println("---MENÚ DE GESTION DE EXPEDICIONES ESPACIALES---");
            System.out.println("---1. Agregar Nave ---");
            System.out.println("---2. Mostrar todas las naves ---");
            System.out.println("---3. Iniciar Exploracion ---");
            System.out.println("---4.  Mostrar naves ordenadas por nombre ---");
            System.out.println("---5. Mostrar naves ordenadas por año de lanzamiento ---");
            System.out.println("---6. Mostrar naves ordenadas por tripulacion ---");
            System.out.println("---7. Salir ---");
            System.out.println("---Opcion:");
            opcion = validarEntero(sc);

            switch (opcion) {
                case 1 ->
                    agregarNave(sc, agencia);
                case 2 ->
                    agencia.mostrarNaves();
                case 3 ->
                    agencia.iniciarExploracion();
                case 4 ->
                    agencia.ordenarPorNombre();
                case 5 ->
                    agencia.ordenarPorAnio();
                case 6 ->
                    agencia.ordenarPorTripulacion();
                case 7 ->
                    System.out.println("---Saliendo del sistema---");
                default ->
                    System.out.println("---Opcion invalida, selecciona un numero del menu---");

            }

        } while (opcion != 7);

    }

    public static void agregarNave(Scanner sc, AgenciaEspacial agencia) {
        System.out.println("--- Tipo de nave ---");
        System.out.println("1. Nave de Exploracion");
        System.out.println("2. Carguero");
        System.out.println("3. Crucero Estelar");
        int tipo = validarEntero(sc);

        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        if (nombre.isEmpty()) {
            System.out.println("Nombre no debe estar vacio");
            return;
        }
        System.out.print("Capacidad de tripulación: ");
        int tripulacion = validarEntero(sc);
        System.out.print("Año de lanzamiento: ");
        int anio = validarEntero(sc);
        if (anio < 0) {
            System.out.println("Año inválido.");
            return;
        }
        switch (tipo) {
            case 1:
                System.out.println("Tipo de misión: 1) CARTOGRAFÍA 2) INVESTIGACIÓN 3) CONTACTO");
                int mision = validarEntero(sc);

                NaveExploracion.TipoMision tipoMision;

                switch (mision) {
                    case 1:
                        tipoMision = NaveExploracion.TipoMision.CARTOGRAFIA;
                        break;
                    case 2:
                        tipoMision = NaveExploracion.TipoMision.INVESTIGACION;
                        break;
                    case 3:
                        tipoMision = NaveExploracion.TipoMision.CONTACTO;
                        break;
                    default:
                        System.out.println("Misión inválida.");
                        return;
                }

                agencia.agregarNave(new NaveExploracion(nombre, tripulacion, anio, tipoMision));
                break;

            case 2:
                System.out.print("Capacidad de carga (100 a 500): ");
                int carga = validarEntero(sc);
                agencia.agregarNave(new Carguero(nombre, tripulacion, anio, carga));
                break;

            case 3:
                System.out.print("Cantidad de pasajeros: ");
                int pasajeros = validarEntero(sc);
                agencia.agregarNave(new CruceroEstelar(nombre, tripulacion, anio, pasajeros));
                break;

            default:
                System.out.println("Tipo de nave inválido.");
                break;
        }
    }
    
    public static int validarEntero(Scanner sc){
        while(!sc.hasNextInt()){
            System.out.println("Ingresa un numero no te hagas el gracioso: ");
            sc.next();
        }
        int n =sc.nextInt();
        sc.nextLine();
        return n;
    }

}
