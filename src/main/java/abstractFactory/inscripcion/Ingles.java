package abstractFactory.inscripcion;

public class Ingles implements IMateria {

    private String docente;
    private int creditos;

    public Ingles() {



    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public void showInfo() {

        System.out.println("Clase de Ingles: ");
        System.out.println("Docente: " + getDocente());
        System.out.println("Creditos: " + getCreditos());
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
    }
}
