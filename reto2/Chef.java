package reto2;

public class Chef {
    private HamburguesaBuilder builder;

    public void setBuilder(HamburguesaBuilder builder) {
        this.builder = builder;
    }

    public void construirHamburguesa(boolean pan, boolean carne, boolean queso, boolean vegetales, boolean salsas) {
        if (pan) builder.agregarPan();
        if (carne) builder.agregarCarne();
        if (queso) builder.agregarQueso();
        if (vegetales) builder.agregarVegetales();
        if (salsas) builder.agregarSalsas();
    }
}
