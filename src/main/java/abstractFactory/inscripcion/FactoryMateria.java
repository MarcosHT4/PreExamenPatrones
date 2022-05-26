package abstractFactory.inscripcion;

public class FactoryMateria {



    public static IMateria make(Materias m) {

        IMateria materias;

        switch(m) {

            case MATEMATICAS:
                materias = new Matematicas();
                ((Matematicas) materias).setCreditos(4);
                ((Matematicas) materias).setDocente("Carlos");
                break;

            case LENGUAJE:
                materias = new Lenguaje();
                ((Lenguaje) materias).setCreditos(6);
                ((Lenguaje) materias).setDocente("Ana");
                break;

            case HISTORIA:
                materias = new Historia();
                ((Historia) materias).setCreditos(3);
                ((Historia) materias).setDocente("Jaime");
                break;

            case INGLES:
                materias = new Ingles();
                ((Ingles) materias).setCreditos(8);
                ((Ingles) materias).setDocente("Johny");
                break;

            default:
                materias = null;



        }

        return materias;

    }

}
