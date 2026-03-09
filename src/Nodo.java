public class Nodo {
    private Pizza pizza;
    private Nodo siguiente;

    public Nodo(Pizza pizza, Nodo siguiente) {
        this.pizza = pizza;
        this.siguiente = siguiente;
    }

    public Pizza getPizza() {
        return this.pizza;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }
}
