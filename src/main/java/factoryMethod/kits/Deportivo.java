package factoryMethod.kits;

public class Deportivo {

    private char talla;
    private String color;
    private int nroDePrendas;

    public Deportivo() {}

    public char getTalla() {
        return talla;
    }

    public void setTalla(char talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNroDePrendas() {
        return nroDePrendas;
    }

    public void setNroDePrendas(int nroDePrendas) {
        this.nroDePrendas = nroDePrendas;
    }
}
