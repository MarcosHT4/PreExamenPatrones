package builder.parrillas;

public abstract class ParrillaBuilder {

    protected Parrilla parrilla;

    public Parrilla getParrilla() {

        return parrilla;

    }

    public void createParrilla() {

        this.parrilla = new Parrilla();

    }

    public abstract void buildTipoDeCarne();
    public abstract void buildSaborRefresco();
    public abstract void buildGuarniciones();


}
