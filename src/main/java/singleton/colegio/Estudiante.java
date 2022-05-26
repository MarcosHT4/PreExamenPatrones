package singleton.colegio;

public class Estudiante {

    private String nombre;

    public Estudiante() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void pagarMatricula(int monto) {

        System.out.println(nombre + " paga la matricula!");

        Ventanilla.getInstance().pagar(monto);

    }
}
