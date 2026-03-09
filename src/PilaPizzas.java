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
        if (tope == null) {
            tope = new Nodo(pizza, null);
            System.out.println("Se agrega una nueva pizza a la pila");
            tamano ++;
            return;
        }
        Nodo segundo = tope;
        tope = new Nodo(pizza, segundo);
        tamano ++;
    }

    public Pizza pop() {
        if (tope == null) {
            System.out.println("La pila esta vacia. No hay objetos para retirar.");
            return null;
        }
        Nodo retirado = tope;
        tope = tope.getSiguiente();
        return retirado.getPizza();
    }
}
