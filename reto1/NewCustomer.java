package reto1;

class NewCustomer extends Customer {
	public NewCustomer() {
		super("Nuevo");
	}

	@Override
	public double getDiscountRate() {
		return 0.05;
	}
}
