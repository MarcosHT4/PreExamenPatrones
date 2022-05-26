package abstractFactory.inscripcion;

public class Estudiante {

    private String name;
    private String ci;

    public Estudiante() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void insciribirse(Materias materias) {

        IMateria materiaEstudiante = FactoryMateria.make(materias);
        materiaEstudiante.showInfo();


    }







}
