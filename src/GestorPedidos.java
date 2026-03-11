import java.util.Scanner;

public class GestorPedidos {
    Scanner scanner;
    private PilaPizzas pedidos;
    private PilaPizzas completados;

    public GestorPedidos() {
        scanner = new Scanner(System.in);
        pedidos = new PilaPizzas();
        completados = new PilaPizzas();
    }

    public void registrarPizza() {
        String nombre = scanner.next();
        String[] ingredientes = new String[3];
        for (int i = 0; i < ingredientes.length; i++) {
            ingredientes[i] = scanner.next();
        }
        Pizza nuevaPizza = new Pizza(nombre, ingredientes);
        pedidos.push(nuevaPizza);
    }

    static void main(String[] args) {
        String nombre1 = "margarita";
        String nombre2 = "4 quesos";
        String[] ingredientes1 = {"tomate", "queso", "albahaca"};
        String[] ingredientes2 = {"mozarella", "cheddar", "provolone"};

        Pizza pizza1 = new Pizza(nombre1, ingredientes1);
        Pizza pizza2 = new Pizza(nombre2, ingredientes2);

        PilaPizzas pila = new PilaPizzas();
        System.out.println(pila.isEmpty());

        System.out.println(pila.pop());

        pila.push(pizza1);
        pila.push(pizza2);

        System.out.println(pila.peek());
        System.out.println(pila.pop());
        System.out.println(pila.isEmpty());
        System.out.println(pila.peek());

    }
}
