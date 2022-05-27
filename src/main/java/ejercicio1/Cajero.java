package ejercicio1;

public class Cajero {
    private static Cajero instance;
    private String numeroCajero;

    private int saldo;

    private Cajero(String numeroCajero, int saldo) {
        this.numeroCajero = numeroCajero;
        this.saldo = saldo;
    }

    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    private synchronized static void multiThreadControl(){
        if(instance==null){
            instance = new Cajero("", 0);
        }
    }

    public static Cajero getInstance(){
        if(instance==null) multiThreadControl();
        return instance;
    }

    public static void setNumeroCajero(String numeroCajero){
        Cajero.getInstance().numeroCajero = numeroCajero;
    }

    public static void setSaldo(int saldo){
        Cajero.getInstance().saldo = saldo;
    }

    public static void cobrarSaldo(int saldo){
        Cajero.getInstance().saldo += saldo;
        System.out.println("Saldo despues del pago: " + Cajero.getInstance().saldo);
    }

    public static void consultarSaldo(){
        System.out.println("Saldo actual: " + Cajero.getInstance().saldo);
    }

}
