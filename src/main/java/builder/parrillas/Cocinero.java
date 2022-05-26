package builder.parrillas;

public class Cocinero {

    private ParrillaBuilder parrillaBuilder;

    public Parrilla getParrillaFromBuilder() {

        return parrillaBuilder.parrilla;

    }

    public void setBuilder(ParrillaBuilder parrillaBuilder) {

        this.parrillaBuilder = parrillaBuilder;

    }

    public void createParrilla() {

        parrillaBuilder.createParrilla();
        parrillaBuilder.buildTipoDeCarne();
        parrillaBuilder.buildGuarniciones();
        parrillaBuilder.buildSaborRefresco();

    }

}
