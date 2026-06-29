package model;

/**
 * Representa una ruta gastronómica ofrecida por Llanquihue Tour.
 */

public class RutaGastronomica extends ServicioTuristico {

    // Atributo propio
    private int numeroDeParadas;

    /**
     * Construye una ruta gastronómica.
     *
     * @param nombre nombre de la ruta
     * @param duracionHoras duración en horas
     * @param numeroDeParadas cantidad de paradas gastronómicas
     */
    public RutaGastronomica(
            String nombre,
            int duracionHoras,
            int numeroDeParadas) {

        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    // Getter y Setter
    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    /**
     * Devuelve la información completa de la ruta gastronómica.
     *
     * @return información general y específica de la ruta
     */
    @Override
    public String toString() {
        return super.toString()
                + " | Número de paradas: " + numeroDeParadas;
    }
}
