package prototype.contratoDocente;

public class DocenteContrato implements IDocente {

    private int sueldo;
    private int cargaHoraria;
    private boolean cursoEducacionSuperior;
    private boolean accesoPlataforma;
    private boolean marcadoBiometrico;
    private String marcadoHoraDeEntrada;
    private String marcadoHoraDeSalida;
    private String nombre;
    private String apellido;

    public DocenteContrato() {}

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public boolean isCursoEducacionSuperior() {
        return cursoEducacionSuperior;
    }

    public void setCursoEducacionSuperior(boolean cursoEducacionSuperior) {
        this.cursoEducacionSuperior = cursoEducacionSuperior;
    }

    public boolean isAccesoPlataforma() {
        return accesoPlataforma;
    }

    public void setAccesoPlataforma(boolean accesoPlataforma) {
        this.accesoPlataforma = accesoPlataforma;
    }

    public boolean isMarcadoBiometrico() {
        return marcadoBiometrico;
    }

    public void setMarcadoBiometrico(boolean marcadoBiometrico) {
        this.marcadoBiometrico = marcadoBiometrico;
    }

    public String getMarcadoHoraDeEntrada() {
        return marcadoHoraDeEntrada;
    }

    public void setMarcadoHoraDeEntrada(String marcadoHoraDeEntrada) {
        this.marcadoHoraDeEntrada = marcadoHoraDeEntrada;
    }

    public String getMarcadoHoraDeSalida() {
        return marcadoHoraDeSalida;
    }

    public void setMarcadoHoraDeSalida(String marcadoHoraDeSalida) {
        this.marcadoHoraDeSalida = marcadoHoraDeSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public Object clone() {

        DocenteContrato docenteContrato = new DocenteContrato();

        docenteContrato.setNombre(this.getNombre());
        docenteContrato.setApellido(this.getApellido());
        docenteContrato.setAccesoPlataforma(this.isAccesoPlataforma());
        docenteContrato.setMarcadoBiometrico(this.isMarcadoBiometrico());
        docenteContrato.setCargaHoraria(this.getCargaHoraria());
        docenteContrato.setSueldo(this.getSueldo());
        docenteContrato.setCursoEducacionSuperior(this.isCursoEducacionSuperior());
        docenteContrato.setMarcadoHoraDeEntrada(this.getMarcadoHoraDeEntrada());
        docenteContrato.setMarcadoHoraDeSalida(this.getMarcadoHoraDeSalida());

        return docenteContrato;
    }

    public void showInfo() {

        System.out.println("Info docente: ");
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Carga Horaria: " + cargaHoraria);
        System.out.println("Curso Educacion Superior: " + cursoEducacionSuperior);
        System.out.println("Acceso Plataforma: " + accesoPlataforma);
        System.out.println("Marcado Biometrico: " + marcadoBiometrico);
        System.out.println("Marcado Hora de Entrada: " + marcadoHoraDeEntrada);
        System.out.println("Marcado Hora de Salida: " + marcadoHoraDeSalida);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");

    }
}
