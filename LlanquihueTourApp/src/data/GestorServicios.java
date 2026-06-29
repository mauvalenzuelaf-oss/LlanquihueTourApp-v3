package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

/**
 * Clase encargada de crear objetos de prueba correspondientes a los servicios turísticos.
 */

public class GestorServicios {
    public ServicioTuristico crearRutaGastronomicaUno() {
        return new RutaGastronomica(
                "En búsqueda del kuchen más grande del mundo",
                4,
                5
        );
    }

    public ServicioTuristico crearRutaGastronomicaDos() {
        return new RutaGastronomica(
                "Sabores del Lago Llanquihue",
                3,
                4
        );
    }

    public ServicioTuristico crearPaseoLacustreUno() {
        return new PaseoLacustre(
                "Paseo Lacustre en Pijamas",
                2,
                "Catamarán"
        );
    }

    public ServicioTuristico crearPaseoLacustreDos() {
        return new PaseoLacustre(
                "Navegación por el Lago Todos los Santos",
                5,
                "Lancha"
        );
    }

    public ServicioTuristico crearExcursionCulturalUno() {
        return new ExcursionCultural(
                "Ruta de los colones alemanes",
                2,
                "Museo Colonial Alemán de Frutillar"
        );
    }

    public ServicioTuristico crearExcursionCulturalDos() {
        return new ExcursionCultural(
                "Ruta patrimonial diurna",
                3,
                "Iglesia del Sagrado Corazón"
        );
    }
}
