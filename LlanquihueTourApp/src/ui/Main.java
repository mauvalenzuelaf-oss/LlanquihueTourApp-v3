package ui;

import data.GestorServicios;
import model.ServicioTuristico;

/**
 * Clase principal encargada de ejecutar las pruebas de la jerarquía de servicios turísticos.
 */
public class Main {

    /**
     * Método principal del programa.
     *
     * @param args argumentos recibidos desde la línea de comandos
     */
    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();

        /*
         * Las variables son de tipo ServicioTuristico.
         * Sin embargo, almacenan objetos de sus distintas subclases.
         * Esto permite aplicar polimorfismo.
         */
        ServicioTuristico servicio1 =
                gestor.crearRutaGastronomicaUno();

        ServicioTuristico servicio2 =
                gestor.crearRutaGastronomicaDos();

        ServicioTuristico servicio3 =
                gestor.crearPaseoLacustreUno();

        ServicioTuristico servicio4 =
                gestor.crearPaseoLacustreDos();

        ServicioTuristico servicio5 =
                gestor.crearExcursionCulturalUno();

        ServicioTuristico servicio6 =
                gestor.crearExcursionCulturalDos();

        System.out.println("=== SERVICIOS TURÍSTICOS LLANQUIHUE TOUR ===");

        System.out.println("\n--- RUTAS GASTRONÓMICAS ---");
        System.out.println(servicio1);
        System.out.println(servicio2);

        System.out.println("\n--- PASEOS LACUSTRES ---");
        System.out.println(servicio3);
        System.out.println(servicio4);

        System.out.println("\n--- EXCURSIONES CULTURALES ---");
        System.out.println(servicio5);
        System.out.println(servicio6);
    }
}