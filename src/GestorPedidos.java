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
        System.out.print("Digite el nombre de la pizza: ");
        String nombre = scanner.next();
        String[] ingredientes = new String[3];
        for (int i = 0; i < ingredientes.length; i++) {
            System.out.print("Digite el nombre del ingrediente: ");
            ingredientes[i] = scanner.next();
        }
        Pizza nuevaPizza = new Pizza(nombre, ingredientes);
        pedidos.push(nuevaPizza);
    }

    public void undoPedido() {
        if (pedidos.isEmpty()) {
            System.out.println("\nPila de pedidos se encuentra vacia");
            return;
        }
        Pizza pizzaCompletada = pedidos.pop();
        completados.push(pizzaCompletada);
        System.out.println("\nPizza " + pizzaCompletada.toString() + " mandada a la pila de completadas.");
    }

    public void redoPedido() {
        if (completados.isEmpty()) {
            System.out.println("La pila de pedidos completados se encuentra vacia");
            return;
        }
        Pizza pizzaPorRehacer = completados.pop();
        pedidos.push(pizzaPorRehacer);
        System.out.println("\nPizza " + pizzaPorRehacer.toString() + " mandada a la pila de completadas.");
    }

    public  Pizza mostrarPedidoActual() {
        return pedidos.peek();
    }
}
