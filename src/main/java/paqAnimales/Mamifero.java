package paqAnimales;
/**
 * Representa un mamífero dentro del reino animal.
 * Hereda de la clase Animal y define comportamientos específicos.
 */
public class Mamifero extends Animal {

    public Mamifero(String nombre) {
        super(nombre);
    }
    @Override
    void reproducir() {
        System.out.println("La reproduccion es vivipara");
    }

    @Override
    void relacionar(Animal m) {
        System.out.println("Con el mamifero: " + m.toString());
    }
}
