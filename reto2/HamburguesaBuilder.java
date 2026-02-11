package reto2;

public interface HamburguesaBuilder {
    void agregarPan();
    void agregarCarne();
    void agregarQueso();
    void agregarVegetales();
    void agregarSalsas();
    Hamburguesa getHamburguesa();
}
