package reto2;

public class HamburguesaPersonalizadaBuilder implements HamburguesaBuilder {
    private Hamburguesa hamburguesa = new Hamburguesa();

    @Override
    public void agregarPan() {
        hamburguesa.agregarIngrediente(new Ingrediente("Pan", 3000));
    }

    @Override
    public void agregarCarne() {
        hamburguesa.agregarIngrediente(new Ingrediente("Carne", 10000));
    }

    @Override
    public void agregarQueso() {
        hamburguesa.agregarIngrediente(new Ingrediente("Queso", 5000));
    }

    @Override
    public void agregarVegetales() {
        hamburguesa.agregarIngrediente(new Ingrediente("Vegetales", 2000));
    }

    @Override
    public void agregarSalsas() {
        hamburguesa.agregarIngrediente(new Ingrediente("Salsas", 1500));
    }

    @Override
    public Hamburguesa getHamburguesa() {
        return hamburguesa;
    }
}
