package paqAnimales;

/**
 * Representa un animal dentro del reino animal.
 * Contiene información básica como el nombre y comportamientos comunes.
 */

public class Animal {
    /**
     * Nombre del animal.
     */
    private String nombre;
    /**
     * Crea un animal con un nombre determinado.
     * @param nombre Nombre del animal.
     */
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene el nombre del animal.
     * @return nombre del animal.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Cambia el nombre del animal.
     * @param nombre Nuevo nombre del animal.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    void comer() {
        System.out.println("Necesita comer diarimente para sobrevivir");
    }

    void dormir() {
        System.out.println("Dormir es indispensable para descansar");
    }

    void reproducir() {
        System.out.println("Originar nuevos seres vivos");
    }

    void relacionar(Animal a) {
        System.out.println("Con el animal: " + a.nombre);
    }
    /**
     * Representa el animal en formato texto.
     * @return nombre del animal.
     */

    @Override
    public String toString() {
        return this.nombre;
    }
}