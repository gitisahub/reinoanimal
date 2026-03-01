package paqAnimales;

/**
 * Representa un gato dentro del reino animal.
 * Es un mamífero que puede maullar y tiene un número de pelos.
 */
public class Gato extends Mamifero {
    private int pelos;
    public Gato(String nombre) {
        super(nombre);
    }

    public int getPelos() {
        return pelos;
    }

    public void setPelos(int pelos) {
        this.pelos = pelos;
    }

    @Override
    void dormir() {
        System.out.println("El gato se pasa todo el día durmiendo");
    }
    /**
     * Permite que el gato emita el sonido de maullar.
     */

    void maullar() {
        System.out.println("Es lo que hacen los gatos");
    }

    @Override
    void relacionar(Animal p) {
        System.out.println("Con el gato: " + p.toString());
    }

}
