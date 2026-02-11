package reto1;

import java.util.List;
import java.util.ArrayList;

class ShoppingCart {
	private List<CartItem> items = new ArrayList<>();

	public void addProduct(Product product, int quantity) {
		items.add(new CartItem(product, quantity));
		System.out.println(product.getName() + " " + quantity + " unidades agregado al carrito.");
	}

	public double calculateSubtotal() {
		return items.stream()
			.map(CartItem::getTotalPrice)
			.reduce(0.0, Double::sum);
	}

	public double calculateDiscount(Customer customer) {
		return calculateSubtotal() * customer.getDiscountRate();
	}

	public double calculateTotal(Customer customer) {
		return calculateSubtotal() - calculateDiscount(customer);
	}

	public List<CartItem> getItems() {
		return items;
	}
}
