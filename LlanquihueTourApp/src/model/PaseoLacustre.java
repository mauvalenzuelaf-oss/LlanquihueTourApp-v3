package model;

/**
 * Representa un paseo lacustre ofrecido por Llanquihue Tour.
 */
public class PaseoLacustre extends ServicioTuristico {

    // Atributo propio
    private String tipoEmbarcacion;

    /**
     * Construye un paseo lacustre.
     *
     * @param nombre nombre del paseo
     * @param duracionHoras duración en horas
     * @param tipoEmbarcacion tipo de embarcación utilizada
     */
    public PaseoLacustre(
            String nombre,
            int duracionHoras,
            String tipoEmbarcacion) {

        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    // Getter y Setter
    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    /**
     * Devuelve la información completa del paseo lacustre.
     *
     * @return información general y específica del paseo
     */
    @Override
    public String toString() {
        return super.toString()
                + " | Tipo de embarcación: " + tipoEmbarcacion;
    }
}
