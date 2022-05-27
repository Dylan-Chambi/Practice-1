package ejercicio5;

public class Client {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();

        BuilderPlatoParrilla bife = new Bife();
        BuilderPlatoParrilla lomito = new Lomito();
        BuilderPlatoParrilla tira = new Tira();

        System.out.println("-------------------Pedido 1 - Bife-------------------");
        restaurante.setBuilder(bife);
        restaurante.buildPlatoParrilla();
        PlatoParrilla pedido1 = restaurante.getPlatoParrilla();
        pedido1.showInfo();

        System.out.println("-------------------Pedido 2 - Lomito-------------------");
        restaurante.setBuilder(lomito);
        restaurante.buildPlatoParrilla();
        PlatoParrilla pedido2 = restaurante.getPlatoParrilla();
        pedido2.showInfo();

        System.out.println("-------------------Pedido 3 - Tira-------------------");
        restaurante.setBuilder(tira);
        restaurante.buildPlatoParrilla();
        PlatoParrilla pedido3 = restaurante.getPlatoParrilla();
        pedido3.showInfo();
    }
}
