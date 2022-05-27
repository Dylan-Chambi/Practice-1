package ejercicio1;

public class Estudiante {
    private String nombre;
    private int saldo;

    public Estudiante(String nombre, int saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void pagarSaldo(int MontoAPagar) {
        if(this.getSaldo() < MontoAPagar){
            System.out.println("No se puede pagar el saldo");
        }else {
            Cajero.cobrarSaldo(MontoAPagar);
            this.setSaldo(this.getSaldo() - MontoAPagar);
        }

    }

}
