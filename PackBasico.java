public class PackBasico extends ProductoDecorador {
    private static final double CARGO = 1_000;

    public PackBasico(Producto producto) {
        super(producto);
    }

    @Override
    public String getNombre() {
        return producto.getNombre() + " + Pack basico";
    }

    @Override
    public double precio() {
        return producto.precio() + CARGO;
    }
}
