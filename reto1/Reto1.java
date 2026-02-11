package reto1;

public class Reto1 {
	private static void test () {
		Product camiseta = new Product("Camiseta", 20000);
		Product pantalon = new Product("Pantalón", 50000);
		Product galletas = new Product("Galletas", 500);
		Product jugo = new Product("Jugo Natural", 3000);

		Customer customer = new FrequentCustomer();

		ShoppingCart cart = new ShoppingCart();

		cart.addProduct(camiseta, 2);
		cart.addProduct(galletas, 3);
		cart.addProduct(jugo, 5);
		Receipt.printReceipt(customer, cart);
	}

	public static void main(String[] args) {
		System.out.println("Bienvenido a la tienda Don Pepe!");
		test();
	}
}
