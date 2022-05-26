package factoryMethod.kits;

public class KitEscolarCreator extends KitCreator {
    @Override
    public KitEscolar createKit() {

        System.out.println("Empezando la creacion del KitEscolar...");

        KitEscolar kitEscolar = new KitEscolar();

        Mochila mochila = new Mochila();

        mochila.setTamano(100);
        mochila.setNroBolsillos(5);

        Deportivo deportivo = new Deportivo();

        deportivo.setColor("Rojo");
        deportivo.setTalla('M');
        deportivo.setNroDePrendas(5);

        Cuaderno cuaderno1 = new Cuaderno();
        Cuaderno cuaderno2 = new Cuaderno();


        cuaderno1.setTipo("Anidado");
        cuaderno1.setNroHojas(45);

        cuaderno2.setTipo("Plano");
        cuaderno2.setNroHojas(50);

        kitEscolar.setMochila(mochila);
        kitEscolar.setDeportivo(deportivo);
        kitEscolar.setCuadernos(new Cuaderno[]{cuaderno1, cuaderno2});

        return kitEscolar;

    }
}
