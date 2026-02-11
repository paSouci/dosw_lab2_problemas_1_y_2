package reto1;

class FrequentCustomer extends Customer {
	public FrequentCustomer() {
		super("Frecuente");
	}

	@Override
	public double getDiscountRate() {
		return 0.10;
	}
}
