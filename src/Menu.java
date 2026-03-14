import java.util.Scanner;

public class Menu {
    static void main() {
        GestorPedidos gestor = new GestorPedidos();
        int eleccion = 1;
        while (eleccion != 0) {
            eleccion = gestor.mostrarMenu();
            switch (eleccion) {
                case 1 :
                    gestor.registrarPizza();
                    break;
                case 2:
                    gestor.undoPedido();
                    break;
                case 3:
                    gestor.redoPedido();
                    break;
                case 4:
                    gestor.mostrarPedidoActual();
                    break;
                default:
                    System.out.println("Haz salido, gracias por preferirnos.\n");

            }
        }
    }
}
