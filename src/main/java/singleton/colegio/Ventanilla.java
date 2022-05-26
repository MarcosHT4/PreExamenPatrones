package singleton.colegio;

public class Ventanilla {

    private static Ventanilla instance;
    private int monto;
    private boolean cajeroRegistrado;

    private Ventanilla() {

        System.out.println("Creando ventanilla...");

    }

    public static Ventanilla getInstance() {

        if(instance==null) {

            instance = new Ventanilla();

        }

        return instance;

    }

    public void recibirCodigoCajero(Cajero cajero, int codigo) {

        if(codigo != 0) {

            cajeroRegistrado = true;

        }

    }

    public void mostrarMontoVentanilla() {

        System.out.println("El monto de la ventanilla es: " + monto);

    }



    public void pagar(int monto) {

        if(cajeroRegistrado) {

            this.monto += monto;

        } else {

            System.out.println("No se pudo procesar el pago! No hay nadie en ventanilla");

        }

    }









}
