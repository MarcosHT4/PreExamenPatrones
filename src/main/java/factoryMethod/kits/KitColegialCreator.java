package factoryMethod.kits;

public class KitColegialCreator extends KitCreator {
    @Override
    public KitColegial createKit() {

        KitColegial kitColegial = new KitColegial();

        Mochila mochila = new Mochila();

        mochila.setTamano(100);
        mochila.setNroBolsillos(5);

        Computadora computadora = new Computadora();

        computadora.setMarca("HP");
        computadora.setOs("Linux");

        Libro libro1 = new Libro();
        Libro libro2 = new Libro();

        libro1.setTipo("Aventura");
        libro1.setAutor("Mark Twain");

        libro2.setTipo("Drama");
        libro2.setAutor("Dalas Review");

        kitColegial.setComputadora(computadora);
        kitColegial.setMochila(mochila);
        kitColegial.setLibros(new Libro[]{libro1, libro2});

        return kitColegial;



    }
}
