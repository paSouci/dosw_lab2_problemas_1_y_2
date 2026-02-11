package reto2;

import java.util.Scanner;

public class Reto2 {

    private static void test () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione ingredientes para su hamburguesa:");
        System.out.println("1. Pan ($3000)");
        System.out.println("2. Carne ($10000)");
        System.out.println("3. Queso ($5000)");
        System.out.println("4. Vegetales ($2000)");
        System.out.println("5. Salsas ($1500)");

        System.out.println("\nIngrese los números separados por espacio:");

        String[] seleccion = scanner.nextLine().split(" ");

        boolean pan = false, carne = false, queso = false, vegetales = false, salsas = false;

        for (String opcion : seleccion) {
            switch (opcion) {
                case "1" -> pan = true;
                case "2" -> carne = true;
                case "3" -> queso = true;
                case "4" -> vegetales = true;
                case "5" -> salsas = true;
            }
        }

        HamburguesaPersonalizadaBuilder builder = new HamburguesaPersonalizadaBuilder();
        Chef chef = new Chef();
        chef.setBuilder(builder);
        chef.construirHamburguesa(pan, carne, queso, vegetales, salsas);

        Hamburguesa hamburguesa = builder.getHamburguesa();
        hamburguesa.mostrarHamburguesa();
        scanner.close();
    }

    public static void main(String[] args) {
        test();
    }
}
