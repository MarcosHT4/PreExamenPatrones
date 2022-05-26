package builder.parrillas;

public class Parrilla {

    private String tipoDeCarne;
    private String saborRefresco;
    private String guarniciones;

    public Parrilla() {}

    public String getTipoDeCarne() {
        return tipoDeCarne;
    }

    public void setTipoDeCarne(String tipoDeCarne) {
        this.tipoDeCarne = tipoDeCarne;
    }

    public String getSaborRefresco() {
        return saborRefresco;
    }

    public void setSaborRefresco(String saborRefresco) {
        this.saborRefresco = saborRefresco;
    }

    public String getGuarniciones() {
        return guarniciones;
    }

    public void setGuarniciones(String guarniciones) {
        this.guarniciones = guarniciones;
    }

    public void showInfo() {

        System.out.println("Tipo de Carne: " + tipoDeCarne);
        System.out.println("Sabor Refresco: " + saborRefresco);
        System.out.println("Guarniciones: " + guarniciones);
        System.out.println("/*/*/*/*/*/*/**/*/*/*/*/*/*/**/*/*/*/**/");

    }
}
