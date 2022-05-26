package builder.parrillas;

public class Bife extends ParrillaBuilder{
    @Override
    public void buildTipoDeCarne() {

        parrilla.setTipoDeCarne("bife");

    }

    @Override
    public void buildSaborRefresco() {

        parrilla.setSaborRefresco("Coca-Cola");

    }

    @Override
    public void buildGuarniciones() {

        parrilla.setGuarniciones("papasFritas");

    }
}
