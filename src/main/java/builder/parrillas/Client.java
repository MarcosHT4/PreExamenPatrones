package builder.parrillas;

public class Client {

    public static void main(String[] args) {

        Cocinero cocinero = new Cocinero();

        Bife bife = new Bife();
        Lomito lomito = new Lomito();
        Tira tira  = new Tira();

        cocinero.setBuilder(bife);
        cocinero.createParrilla();

        Parrilla parrilla1 = cocinero.getParrillaFromBuilder();
        parrilla1.showInfo();

        cocinero.setBuilder(lomito);
        cocinero.createParrilla();

        parrilla1 = cocinero.getParrillaFromBuilder();
        parrilla1.showInfo();

        cocinero.setBuilder(tira);
        cocinero.createParrilla();

        parrilla1 = cocinero.getParrillaFromBuilder();
        parrilla1.showInfo();




    }

}
