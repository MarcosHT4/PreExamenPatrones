package singleton.colegio;

public class Client {

    public static void main(String[] args) {

        Cajero cajero = new Cajero();

        cajero.setNombre("Manuel");
        cajero.setCodigo(2221);
        cajero.registrarseEnVentanilla();

        Estudiante estudiante1 = new Estudiante();

        estudiante1.setNombre("Maria");

        estudiante1.pagarMatricula(500);
        cajero.mostrarSaldoCajero();

        Estudiante estudiante2 = new Estudiante();

        estudiante2.setNombre("Marlos");

        estudiante2.pagarMatricula(600);
        cajero.mostrarSaldoCajero();

        Estudiante estudiante3 = new Estudiante();

        estudiante3.setNombre("Dalas");

        estudiante3.pagarMatricula(129);
        cajero.mostrarSaldoCajero();

    }

}

