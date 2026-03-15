public class PilaPizzas {
    private Nodo tope;
    private int tamano;

    public PilaPizzas() {
        this.tope = null;
        this.tamano = 0;
    }

    /* este metodo comprueba el tamano de la pila,
    * retorna verdadero indicando que la pila esta vacia*/
    public boolean isEmpty() {
        return (tamano == 0);
    }

    /*este metodo recibe como parametro una pizza y la
    * ingresa en el tope de la pila*/
    public void push(Pizza pizza) {
        tamano ++;
        if (tope == null) {
            tope = new Nodo(pizza, null);
            return;
        }
        Nodo segundo = tope;
        tope = new Nodo(pizza, segundo);
    }

    /*este metodo elimina la pizza de la cima de la pila
    * y la retorna. Se controla el caso de que la pila este vacia con un
    * condicional*/
    public Pizza pop() {
        if (isEmpty()) {
            System.out.println("La pila esta vacia. No hay objetos para retirar.");
            return null;
        }
        Nodo retirado = tope;
        tope = tope.getSiguiente();
        tamano --;
        return retirado.getPizza();
    }

    /* se retorna la pizza en la cima sin eliminarla de la pila.
    * Se controla la excepcion de que la pila este vacia*/
    public Pizza peek() {
        if (isEmpty()) {
            return null;
        }
        return tope.getPizza();
    }
}
