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

    public void push(Pizza pizza) {
        tamano ++;
        if (tope == null) {
            tope = new Nodo(pizza, null);
            return;
        }
        Nodo segundo = tope;
        tope = new Nodo(pizza, segundo);
    }

    public Pizza pop() {
        if (tope == null) {
            System.out.println("La pila esta vacia. No hay objetos para retirar.");
            return null;
        }
        Nodo retirado = tope;
        tope = tope.getSiguiente();
        tamano --;
        return retirado.getPizza();
    }

    public Pizza peek() {
        if (isEmpty()) {
            return null;
        }
        return tope.getPizza();
    }
}
