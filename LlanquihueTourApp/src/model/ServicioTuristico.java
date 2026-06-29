package model;

/**
 * Representa un servicio turístico ofrecido por Llanquihue Tour.
 * Cada tour un nombre y una duración expresada en horas.
 */
public class ServicioTuristico {

    // Atributos de la clase
    private String nombre;
    private int duracionHoras;

    /**
     * Construye un servicio turístico con sus datos principales.
     *
     * @param nombre nombre del servicio turístico
     * @param duracionHoras duración del servicio en horas
     */
    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    /**
     * Devuelve la información general del servicio turístico.
     *
     * @return información del servicio
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre
                + " | Duración: " + duracionHoras + " horas";
    }
}
