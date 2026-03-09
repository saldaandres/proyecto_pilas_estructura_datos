import java.util.Arrays;

public class Pizza {
    private String nombre;
    private String[] ingredientes;

    public Pizza(String nombre, String[] ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getIngredientes() {
        return Arrays.toString(ingredientes);
    }

    public String toString() {
        return "Pizza " + getNombre() + ": " + getIngredientes();
    }
}
