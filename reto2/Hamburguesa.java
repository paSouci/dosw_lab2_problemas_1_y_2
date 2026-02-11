package reto2;

import java.util.ArrayList;
import java.util.List;

public class Hamburguesa {
    private List<Ingrediente> ingredientes = new ArrayList<>();

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public double calcularPrecioTotal() {
        return ingredientes.stream()
                .mapToDouble(Ingrediente::getPrecio)
                .sum();
    }

    public void mostrarHamburguesa() {
        System.out.println("\n--- HAMBURGUESA PERSONALIZADA ---");
        System.out.print("Ingredientes seleccionados: ");

        ingredientes.stream()
                .map(Ingrediente::getNombre)
                .forEach(nombre -> System.out.print(nombre + ", "));

        System.out.println("\nPrecio total: $" + calcularPrecioTotal());
        System.out.println("------------------------------");
        System.out.println("¡Disfrute su hamburguesa!");
    }
}
