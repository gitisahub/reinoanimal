package paqAnimales;

/**
 * Representa un perro dentro del reino animal.
 * Es un tipo de mamífero que puede ladrar.
 */
public class Perro extends Mamifero {

    public Perro(String nombre) {
        super(nombre);
    }
    @Override
    void dormir() {
        System.out.println("El perro debe dormir en funcion del ejericio que realiza");
    }

    /**
     * Permite que el perro emita el sonido de ladrar.
     */

    void ladrar() {
        System.out.println("Es una labor social de guarda");
    }

    void gruñir() {
        System.out.println("Es un sonido ronco y sostenido");
    }

    @Override
    void relacionar(Animal p) {
        System.out.println("Con el perro: " + p.toString());
    }

}
