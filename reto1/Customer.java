package reto1;

abstract class Customer {
	protected String type;

	public Customer(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public abstract double getDiscountRate();
}
