package ejercicio3;

public class Client {
    public static void main(String[] args) {
        System.out.println("-----------------------Kit Colegial-----------------------");
        KitColegial kit1 = new CreatorKitColegial().createKit();
        kit1.showInfo();

        System.out.println("-----------------------Kit Escolar-----------------------");
        KitEscolar kit2 = new CreatorKitEscolar().createKit();
        kit2.showInfo();
    }
}
