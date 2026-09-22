public class PackPremium extends ProductoDecorador {
    private static final double CARGO = 2_500;

    public PackPremium(Producto producto) {
        super(producto);
    }

    @Override
    public String getNombre() {
        return producto.getNombre() + " + Pack premium";
    }

    @Override
    public double precio() {
        return producto.precio() + CARGO;
    }
}
