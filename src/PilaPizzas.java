public class PilaPizzas {
    private Nodo tope;
    private int tamano;

    public PilaPizzas() {
        this.tope = null;
        this.tamano = 0;
    }

    public boolean isEmpty() {
        return (tamano == 0);
    }
}
