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

    public int mostrarMenu() {
        System.out.println("\n|---------- Bienvenido al Portal de Pizzas ------------- |");
        System.out.println("|        Digite una de las siguientes opciones           |");
        System.out.println("|        1. Agregar nueva pizza                         |");
        System.out.println("|        2. Completar pedido                             |");
        System.out.println("|        3. Rehacer pedido                               |");
        System.out.println("|        4. Mostrar pedido actual                        |");
        System.out.println("|        0. Salir                                        |");
        System.out.println("|------------------------------------------------------- |");
        System.out.print("\nDigite su eleccion: ");
        return this.scanner.nextInt();
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
        System.out.println("\n" + pizzaCompletada.toString() + " mandada a la pila de completadas.");
    }

    public void redoPedido() {
        if (completados.isEmpty()) {
            System.out.println("\nPila de pedidos completados se encuentra vacia");
            return;
        }
        Pizza pizzaPorRehacer = completados.pop();
        pedidos.push(pizzaPorRehacer);
        System.out.println("\n" + pizzaPorRehacer.toString() + " mandada de vuelta a la pila de produccion.");
    }

    public void mostrarPedidoActual() {
        if (pedidos.isEmpty()) {
            System.out.println("No hay ningun pedido en pila de produccion");
            return;
        }
        System.out.println(pedidos.peek());


    }
}
