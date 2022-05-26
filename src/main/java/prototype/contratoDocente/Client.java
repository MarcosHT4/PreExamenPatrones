package prototype.contratoDocente;

public class Client {

    public static void main(String[] args) {

        DocenteContrato template = new DocenteContrato();

        template.setSueldo(5000);
        template.setCargaHoraria(80);
        template.setCursoEducacionSuperior(true);
        template.setAccesoPlataforma(true);
        template.setMarcadoBiometrico(false);
        template.setMarcadoHoraDeEntrada("08:00");
        template.setMarcadoHoraDeSalida("18:00");

        DocenteContrato docente1 = (DocenteContrato) template.clone();

        docente1.setNombre("Manuel");
        docente1.setApellido("Perez");

        DocenteContrato docente2 = (DocenteContrato) template.clone();

        docente2.setNombre("Dalas");
        docente2.setApellido("Azahar");

        DocenteContrato docente3 = (DocenteContrato) template.clone();

        docente3.setNombre("Paco");
        docente3.setApellido("Menendez");

        DocenteContrato docente4 = (DocenteContrato) template.clone();

        docente4.setNombre("Gerundio");
        docente4.setApellido("Balero");

        DocenteContrato docente5 = (DocenteContrato) template.clone();

        docente5.setNombre("Juan");
        docente5.setApellido("Caballo");

        DocenteContrato docente6 = (DocenteContrato) template.clone();

        docente6.setNombre("Arquimedes");
        docente6.setApellido("Griego");

        DocenteContrato docente7 = (DocenteContrato) template.clone();

        docente7.setNombre("Isaac");
        docente7.setApellido("Newton");

        DocenteContrato docente8 = (DocenteContrato) template.clone();

        docente8.setNombre("Nikola");
        docente8.setApellido("Tesla");

        DocenteContrato docente9 = (DocenteContrato) template.clone();

        docente9.setNombre("Trapecio");
        docente9.setApellido("Triangulero");

        DocenteContrato docente10 = (DocenteContrato) template.clone();

        docente10.setNombre("Marie");
        docente10.setApellido("Curie");

        DocenteContrato docente11 = (DocenteContrato) template.clone();

        docente11.setNombre("Maria");
        docente11.setApellido("Montessori");

        DocenteContrato docente12 = (DocenteContrato) template.clone();

        docente12.setNombre("Porfirio");
        docente12.setApellido("Miranda");

        DocenteContrato docente13 = (DocenteContrato) template.clone();

        docente13.setNombre("Alan");
        docente13.setApellido("Turing");

        DocenteContrato docente14 = (DocenteContrato) template.clone();

        docente14.setNombre("Pepe");
        docente14.setApellido("Panda");

        DocenteContrato docente15 = (DocenteContrato) template.clone();

        docente15.setNombre("Jose");
        docente15.setApellido("Madero");

        docente1.showInfo();
        docente2.showInfo();
        docente3.showInfo();
        docente4.showInfo();
        docente5.showInfo();
        docente6.showInfo();
        docente7.showInfo();
        docente8.showInfo();
        docente9.showInfo();
        docente10.showInfo();
        docente11.showInfo();
        docente12.showInfo();
        docente13.showInfo();
        docente14.showInfo();
        docente15.showInfo();
















    }

}
