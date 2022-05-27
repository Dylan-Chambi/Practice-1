package ejercicio6;

public class Client {
    public static void main(String[] args) {
        String input = "Como administrador Quiero generar un reporte diario Para evaluar las ganancias";
        Interpreter parser = new Interpreter(input);
        System.out.println("-----------------------Mensaje Interpretado-----------------------");
        System.out.println(parser.evaluateMSG());
    }
}
