package factoryMethod.kits;

public class KitColegial implements IKit {

    private Mochila mochila;
    private Libro[] libros;
    private Computadora computadora;

    public KitColegial() {}


    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Libro[] getLibros() {
        return libros;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    @Override

    public void showInfo() {

        System.out.println("KitColegial: ");
        System.out.println("Mochila NroBolsillos: " + getMochila().getNroBolsillos());
        System.out.println("Mochila Tamanio: " + getMochila().getTamano());

        for(int i = 0; i< libros.length; i++) {

            System.out.println("Libro " + (i+1) + " Tipo: " + getLibros()[i].getTipo());
            System.out.println("Libro " + (i+1) + " Autor: " + getLibros()[i].getAutor());

        }

        System.out.println("Computadora Marca: " + getComputadora().getMarca());
        System.out.println("Computadora OS: " + getComputadora().getOs());

        System.out.println("/*/*/*/*/*/*/*/*//*/*/*/*/*/*/*/*/*/*");
    }





}
