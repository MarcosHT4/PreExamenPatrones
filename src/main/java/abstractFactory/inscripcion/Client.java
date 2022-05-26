package abstractFactory.inscripcion;

public class Client {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante();
        estudiante1.setName("Dalas");
        estudiante1.setName("Review");

        Estudiante estudiante2 = new Estudiante();
        estudiante1.setName("Wismichu");
        estudiante1.setName("Prego");

        Estudiante estudiante3 = new Estudiante();
        estudiante1.setName("Javi");
        estudiante1.setName("Oliveira");

        Estudiante estudiante4 = new Estudiante();
        estudiante1.setName("Nauter");
        estudiante1.setName("Play");

        Estudiante estudiante5 = new Estudiante();
        estudiante1.setName("Lada");
        estudiante1.setName("Amores");


        estudiante1.insciribirse(Materias.MATEMATICAS);
        estudiante2.insciribirse(Materias.LENGUAJE);
        estudiante3.insciribirse(Materias.HISTORIA);
        estudiante4.insciribirse(Materias.INGLES);
        estudiante5.insciribirse(Materias.MATEMATICAS);

    }

}
