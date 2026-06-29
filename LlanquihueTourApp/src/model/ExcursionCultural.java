package model;

/**
 * Representa una excursión cultural ofrecida por Llanquihue Tour.
 */

public class ExcursionCultural extends ServicioTuristico {

    // Atributo propio
    private String lugarHistorico;

    /**
     * Construye una excursión cultural.
     *
     * @param nombre nombre de la excursión
     * @param duracionHoras duración en horas
     * @param lugarHistorico lugar histórico visitado
     */
    public ExcursionCultural(
            String nombre,
            int duracionHoras,
            String lugarHistorico) {

        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    // Getter y Setter
    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    /**
     * Devuelve la información completa de la excursión cultural.
     *
     * @return información general y específica de la excursión
     */
    @Override
    public String toString() {
        return super.toString()
                + " | Lugar histórico: " + lugarHistorico;
    }
}
