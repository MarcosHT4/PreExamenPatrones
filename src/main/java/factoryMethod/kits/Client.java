package factoryMethod.kits;

public class Client {

    public static void main(String[] args) {

        KitEscolar kitEscolar = new KitEscolarCreator().createKit();
        KitColegial kitColegial =  new KitColegialCreator().createKit();


        kitEscolar.showInfo();
        kitColegial.showInfo();


    }

}
