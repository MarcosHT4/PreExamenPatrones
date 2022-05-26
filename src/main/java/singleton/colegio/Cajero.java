package singleton.colegio;

public class Cajero {

    private String nombre;
    private int codigo;

    public Cajero() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void registrarseEnVentanilla() {


        Ventanilla.getInstance().recibirCodigoCajero(this, codigo);
        System.out.println(nombre + " introduce su codigo!");

    }

    public void mostrarSaldoCajero() {

        Ventanilla.getInstance().mostrarMontoVentanilla();

    }





}
