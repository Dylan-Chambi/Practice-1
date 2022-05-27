package ejercicio1;

public class Client {

        public static void main(String[] args) {

            Estudiante estudiante1 = new Estudiante("Juan", 100);
            Estudiante estudiante2 = new Estudiante("Pedro", 200);
            Estudiante estudiante3 = new Estudiante("Luis", 300);
            Estudiante estudiante4 = new Estudiante("Maria", 400);
            Estudiante estudiante5 = new Estudiante("Jorge", 500);

            estudiante1.pagarSaldo( 50);
            estudiante2.pagarSaldo( 100);
            estudiante3.pagarSaldo( 150);
            estudiante4.pagarSaldo( 200);
            estudiante5.pagarSaldo( 250);

            Cajero.consultarSaldo();
        }
}
