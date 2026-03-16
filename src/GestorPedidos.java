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
        System.out.println("|        1. Agregar nueva pizza                          |");
        System.out.println("|        2. Completar pedido                             |");
        System.out.println("|        3. Rehacer pedido                               |");
        System.out.println("|        4. Mostrar pedido actual                        |");
        System.out.println("|        0. Salir                                        |");
        System.out.println("|------------------------------------------------------- |");
        System.out.print("\nDigite su eleccion: ");
        return this.scanner.nextInt();
    }

    /* Se toman los datos de la pizza proporcionados por el usuario para crear
    * una nueva pizza en la pila de pedidos*/
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
        System.out.println(nuevaPizza.toString() + " se anadio con exito");
    }

    /* Se completa el pedido y se manda a la pila de completados*/
    public void undoPedido() {
        if (pedidos.isEmpty()) {
            System.out.println("Pila de pedidos se encuentra vacia");
            return;
        }
        Pizza pizzaCompletada = pedidos.pop();
        completados.push(pizzaCompletada);
        System.out.println(pizzaCompletada.toString() + " cocinada con exito");
    }

    /*Envia un pedido ya completado de vuelta a la pila de produccion*/
    public void redoPedido() {
        if (completados.isEmpty()) {
            System.out.println("Pila de pedidos completados se encuentra vacia.");
            return;
        }
        Pizza pizzaPorRehacer = completados.pop();
        pedidos.push(pizzaPorRehacer);
        System.out.println(pizzaPorRehacer.toString() + " mandada de vuelta a la pila de produccion.");
    }

    /*Muestra la siguiente pizza que se va a cocinar*/
    public void mostrarPedidoActual() {
        if (pedidos.isEmpty()) {
            System.out.println("No hay ningun pedido en pila de produccion");
            return;
        }
        System.out.println(pedidos.peek());
    }
}
