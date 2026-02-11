package reto1;

class Receipt {
	public static void printReceipt(Customer customer, ShoppingCart cart) {
		System.out.println("\n--- RECIBO DE COMPRA ---");
		System.out.println("Cliente: " + customer.getType());
		System.out.println("Productos:");

		cart.getItems().forEach(item -> System.out.println("- " + item.getProduct().getName() + " - $" + item.getTotalPrice()));

		double subtotal = cart.calculateSubtotal();
		double discount = cart.calculateDiscount(customer);
		double total = cart.calculateTotal(customer);

		System.out.println("Subtotal: $" + subtotal);
		System.out.println("Descuento aplicado: $" + discount);
		System.out.println("Total a pagar: $" + total);
		System.out.println("------------------------");
		System.out.println("¡Gracias por su compra!");
	}
}
