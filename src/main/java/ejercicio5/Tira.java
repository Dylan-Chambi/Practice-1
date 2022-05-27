package ejercicio5;

public class Tira extends BuilderPlatoParrilla {
    @Override
    public void buildTipoDeCarne() {
        this.platoParrilla.setTipoDeCarne("tira de carne");
    }

    @Override
    public void buildSaborRefresco() {
        this.platoParrilla.setSaborRefresco("CocaCola");
    }

    @Override
    public void buildGuarniciones() {
        this.platoParrilla.setGuarniciones("fideo");
    }
}
