package ejercicio3;

public class KitColegial implements IKit {
    private Mochila mochila;
    private Libro[] libros;
    private Computadora computadora;

    public KitColegial(Mochila mochila, Libro[] libros, Computadora computadora) {
        this.mochila = mochila;
        this.libros = libros;
        this.computadora = computadora;
        System.out.println("Creando Kit Colegial");
    }

    @Override
    public void showInfo() {
        System.out.println("Mochila: " + mochila.getTamanio() + " " + mochila.getNumeroBolsillos());
        System.out.println("Computadora: " + computadora.getMarca() + " " + computadora.getOs());
        System.out.print("Libros: [");
        for (int i = 0; i < libros.length; i++) {
            System.out.print("Libro " + (i + 1) + ": { "+ "Autor: " + libros[i].getAutor() + ", Tipo: " + libros[i].getTipo() + " }");
            if (i < libros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
