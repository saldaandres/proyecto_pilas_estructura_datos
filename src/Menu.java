import java.util.Scanner;

public class Menu {
    static void main() {
        GestorPedidos gestor = new GestorPedidos();
        int eleccion = 1;
        while (eleccion != 0) {
            eleccion = gestor.mostrarMenu();
        }
    }
}
